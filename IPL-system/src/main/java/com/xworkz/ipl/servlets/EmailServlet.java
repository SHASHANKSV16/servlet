package com.xworkz.ipl.servlets;

import com.xworkz.ipl.exception.DataInvalidException;
import com.xworkz.ipl.service.PlayerService;
import com.xworkz.ipl.service.PlayerServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/email")
public class EmailServlet extends HttpServlet {
PlayerService service = new PlayerServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String email = req.getParameter("email");

        System.out.println("Received Email : " + email);

        req.setAttribute("email", email);
        try {
            boolean isPresent = service.ValidateAndSearch(email);

            if (isPresent) {
                RequestDispatcher dispatcher =
                        req.getRequestDispatcher("biddingTeams.jsp");
                dispatcher.forward(req, resp);
            } else {
                req.setAttribute("error", "Email not found. Please enter a valid IPL email.");
                RequestDispatcher dispatcher =
                        req.getRequestDispatcher("bidding.jsp");
                dispatcher.forward(req, resp);
            }

        } catch (DataInvalidException e) {

            req.setAttribute("error", e.getMessage());
            RequestDispatcher dispatcher =
                    req.getRequestDispatcher("bidding.jsp");
            dispatcher.forward(req, resp);
        }

    }
}
