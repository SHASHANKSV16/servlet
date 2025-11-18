package com.xworkz.coffeeapp.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/cafeteria", loadOnStartup = 1)


public class CafeteriaServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String location = req.getParameter("location");
        String type = req.getParameter("type");
        String price = req.getParameter("price");
        String franchise = req.getParameter("franchise");
        String owner = req.getParameter("owner");
        String gst = req.getParameter("gst");

        req.setAttribute("name", name);
        req.setAttribute("location", location);
        req.setAttribute("type", type);
        req.setAttribute("price", price);
        req.setAttribute("franchise", franchise);
        req.setAttribute("owner", owner);
        req.setAttribute("gst", gst);

        RequestDispatcher dispatcher = req.getRequestDispatcher("CafeteriaResult.jsp");
        dispatcher.forward(req, resp);
    }
}
