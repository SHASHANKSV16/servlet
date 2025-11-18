package com.xworkz.coffeeapp.servlets;

import com.xworkz.coffeeapp.dto.CoffeeDTO;
import com.xworkz.coffeeapp.service.CoffeeService;
import com.xworkz.coffeeapp.service.CoffeeServiceImpl;

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
        System.out.println("jygfd");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("CoffeeResult.jsp");
        requestDispatcher.forward(req,resp);
        CoffeeDTO coffeeDto = new CoffeeDTO(type,Integer.parseInt(qty),Double.parseDouble(price),farmer,loc);

        CoffeeService coffeeService = new CoffeeServiceImpl();
        coffeeService.validateAndAdd(coffeeDto);
    }
}
