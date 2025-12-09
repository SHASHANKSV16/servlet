package com.xworkz.wonderla.servlets;

import com.xworkz.wonderla.dto.SearchDto;
import com.xworkz.wonderla.dto.WonderlaDTO;
import com.xworkz.wonderla.exception.DataInvalidException;
import com.xworkz.wonderla.exception.DataNotSavedException;
import com.xworkz.wonderla.service.WonderlaService;
import com.xworkz.wonderla.service.WonderlaServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Optional;

@WebServlet(urlPatterns = "/wonder", loadOnStartup = 1)

public class WonderlaServlet extends HttpServlet {

    WonderlaService service = new WonderlaServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String date = req.getParameter("date");
        String ticketType = req.getParameter("ticketType");
        String adults = req.getParameter("adults");
        String children = req.getParameter("children");
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        WonderlaDTO dto = new WonderlaDTO(date,ticketType,Integer.parseInt(adults),Integer.parseInt(children),name,email);

        try {
            service.validateAndSave(dto);

            req.setAttribute("date", date);
            req.setAttribute("ticketType", ticketType);
            req.setAttribute("adults", adults);
            req.setAttribute("children", children);
            req.setAttribute("name", name);
            req.setAttribute("email", email);
            req.setAttribute("success","Booking Confirmed");
            HttpSession httpSession = req.getSession();
            httpSession.setAttribute("sessionName",name);

            RequestDispatcher dispatcher = req.getRequestDispatcher("result.jsp");
            dispatcher.forward(req, resp);


        } catch (DataInvalidException e) {

            req.setAttribute("dataError", "Data is Invalid");

            RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
            dispatcher.forward(req, resp);

        } catch (DataNotSavedException e) {

            req.setAttribute("emailError", "for the selected date the ticket has been booked by same email id. Please try again.");

            RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
            dispatcher.forward(req, resp);
        }


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String date = req.getParameter("date");
        String email = req.getParameter("email");
        SearchDto dto = new SearchDto(date,email);
try {
    Optional<WonderlaDTO> optional = service.validateAndSearch(dto);
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
