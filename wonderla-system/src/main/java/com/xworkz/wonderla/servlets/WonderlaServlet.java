package com.xworkz.wonderla.servlets;

import com.xworkz.wonderla.dto.WonderlaDTO;
import com.xworkz.wonderla.exception.DataInvalidException;
import com.xworkz.wonderla.service.WonderlaService;
import com.xworkz.wonderla.service.WonderlaServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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

            RequestDispatcher dispatcher = req.getRequestDispatcher("result.jsp");
            dispatcher.forward(req, resp);
        } catch (DataInvalidException e) {
            System.out.println("data invalid");
            e.printStackTrace();
        }

    }
}
