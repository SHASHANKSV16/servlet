package com.xworkz.flightapp.servlets;

import com.xworkz.flightapp.dto.BookingInfoDTO;
import com.xworkz.flightapp.dto.SearchDto;
import com.xworkz.flightapp.service.BookingService;
import com.xworkz.flightapp.service.BookingServiceImpl;
import lombok.SneakyThrows;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(urlPatterns = "/edit", loadOnStartup = 1)
public class InfoUpdateServlet extends HttpServlet {
    BookingService service = new BookingServiceImpl();
    @SneakyThrows
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String date = req.getParameter("date");
        SearchDto searchDto = new SearchDto(date, email);
        Optional<BookingInfoDTO> dto = service.validateAndSearch(searchDto);
        req.setAttribute("edit", dto.get());
        req.getRequestDispatcher("update.jsp").forward(req, resp);
    }
}
