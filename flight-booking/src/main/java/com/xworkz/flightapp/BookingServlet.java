package com.xworkz.flightapp;

import com.xworkz.flightapp.dto.BookingInfoDTO;
import com.xworkz.flightapp.dto.SearchDto;
import com.xworkz.flightapp.exception.DataInvalidException;
import com.xworkz.flightapp.exception.DataNotSavedException;
import com.xworkz.flightapp.service.BookingService;
import com.xworkz.flightapp.service.BookingServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Optional;

@WebServlet(urlPatterns = "/flight",loadOnStartup = 1)
public class BookingServlet extends HttpServlet {

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
            service.validateAndSave(bookingInfoDTO);

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

            RequestDispatcher dispatcher = req.getRequestDispatcher("booking.jsp");
            dispatcher.forward(req, resp);

        } catch (DataNotSavedException e) {

            req.setAttribute("emailError", "for the selected date the ticket has been booked by same email id. Please try again.");

            RequestDispatcher dispatcher = req.getRequestDispatcher("booking.jsp");
            dispatcher.forward(req, resp);
        }


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String date = req.getParameter("date");
        String email = req.getParameter("email");
        SearchDto dto = new SearchDto(date,email);
        try {
            Optional<BookingInfoDTO> optional = service.validateAndSearch(dto);
            if (optional.isPresent()) {
                req.setAttribute("dto", optional.get());
            } else {
                req.setAttribute("msg", "No record found");
            }


            RequestDispatcher dispatcher = req.getRequestDispatcher("search.jsp");
            dispatcher.forward(req, resp);

        }catch (DataInvalidException e){
            System.out.println("data not found");
            req.setAttribute("dataError", "Data is Invalid");

            RequestDispatcher dispatcher = req.getRequestDispatcher("search.jsp");
            dispatcher.forward(req, resp);
        }
    }
    }


