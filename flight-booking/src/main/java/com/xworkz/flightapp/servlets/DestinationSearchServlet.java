package com.xworkz.flightapp.servlets;

import com.xworkz.flightapp.dto.BookingInfoDTO;
import com.xworkz.flightapp.dto.SearchDto;
import com.xworkz.flightapp.exception.DataInvalidException;
import com.xworkz.flightapp.service.BookingService;
import com.xworkz.flightapp.service.BookingServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@WebServlet(urlPatterns = "/destinationSearch", loadOnStartup = 1)
public class DestinationSearchServlet extends HttpServlet {
    BookingService service = new BookingServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String destination = req.getParameter("destination");
        SearchDto dto = new SearchDto();
        dto.setDestination(destination);
        try {
            List<BookingInfoDTO> dtos = service.validateAndDestinationSearch(dto);
            if (dtos != null && !dtos.isEmpty()) {
                req.setAttribute("dto", dtos);
            } else {
                req.setAttribute("msg", "No record found");
            }

            RequestDispatcher dispatcher = req.getRequestDispatcher("destinationSearch.jsp");
            dispatcher.forward(req, resp);

        }catch (DataInvalidException e){
            System.out.println("data not found");
            req.setAttribute("dataError", "Data is Invalid");

            RequestDispatcher dispatcher = req.getRequestDispatcher("search.jsp");
            dispatcher.forward(req, resp);
        }
    }


}
