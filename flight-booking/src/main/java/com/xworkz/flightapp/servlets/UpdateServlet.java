package com.xworkz.flightapp.servlets;

import com.xworkz.flightapp.dto.BookingInfoDTO;
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

@WebServlet(urlPatterns = "/update", loadOnStartup = 1)
public class UpdateServlet extends HttpServlet {
    BookingService service = new BookingServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String airline = req.getParameter("airline");
        String email = req.getParameter("email");
        String date = req.getParameter("date");
        String name = req.getParameter("name");
        String from = req.getParameter("from");
        String destination = req.getParameter("destination");

        BookingInfoDTO bookingInfoDTO = new BookingInfoDTO(from,destination,date,name,email,airline);
        System.out.println(bookingInfoDTO);
        try {
            System.out.println("in try");
            service.validateAndUpdate(bookingInfoDTO);

            req.setAttribute("date", date);
            req.setAttribute("destination", destination);
            req.setAttribute("airline", airline);
            req.setAttribute("from", from);
            req.setAttribute("name", name);
            req.setAttribute("email", email);
            req.setAttribute("success","Booking Confirmed");


            RequestDispatcher dispatcher = req.getRequestDispatcher("result.jsp");
            dispatcher.forward(req, resp);

        } catch (DataInvalidException e) {

            req.setAttribute("dataError", "Data is Invalid");

            RequestDispatcher dispatcher = req.getRequestDispatcher("update.jsp");
            dispatcher.forward(req, resp);

        }
    }
}
