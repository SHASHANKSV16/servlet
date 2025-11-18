package com.xworkz.coffeeapp.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/feedback", loadOnStartup = 1)


public class CustomerFeedBackServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String comments = req.getParameter("comments");
        String rating = req.getParameter("rating");

        req.setAttribute("name", name);
        req.setAttribute("email", email);
        req.setAttribute("comments", comments);
        req.setAttribute("rating", rating);

        RequestDispatcher dispatcher = req.getRequestDispatcher("CustomerFeedBackResult.jsp");
        dispatcher.forward(req, resp);
    }
}
