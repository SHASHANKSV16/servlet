package com.xworkz.coffeeapp.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/coffee", loadOnStartup = 1)

public class CoffeeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String type= req.getParameter("type");
        String qty= req.getParameter("qty");
        String loc= req.getParameter("loc");
        String farmer = req.getParameter("farmer");
        String price = req.getParameter("price");


        req.setAttribute("type",type);
        req.setAttribute("qty",qty);
        req.setAttribute("price",price);
        req.setAttribute("farmer",farmer);
        req.setAttribute("loc",loc);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("CoffeeResult.jsp");
        requestDispatcher.forward(req,resp);
    }
}
