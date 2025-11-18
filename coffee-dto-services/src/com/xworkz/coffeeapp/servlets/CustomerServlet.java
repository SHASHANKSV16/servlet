package com.xworkz.coffeeapp.servlets;

import com.xworkz.coffeeapp.dto.CustomerDTO;
import com.xworkz.coffeeapp.service.CustomerService;
import com.xworkz.coffeeapp.service.CustomerServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/customer", loadOnStartup = 1)
// Customer : name, mobile, Coffee Flavour, quantity, Payment Mode

public class CustomerServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String mobile = req.getParameter("mobile");
        String flavour = req.getParameter("flavour");
        String quantity = req.getParameter("quantity");
        String payment = req.getParameter("payment");

        req.setAttribute("name", name);
        req.setAttribute("mobile", mobile);
        req.setAttribute("flavour", flavour);
        req.setAttribute("quantity", quantity);
        req.setAttribute("payment", payment);

        RequestDispatcher dispatcher = req.getRequestDispatcher("CustomerResult.jsp");
        dispatcher.forward(req, resp);

        CustomerDTO customerDTO = new CustomerDTO(name,Long.parseLong(mobile),flavour,Integer.parseInt(quantity),payment);

        CustomerService customerService = new CustomerServiceImpl();
        customerService.ValidateAndAdd(customerDTO);

    }
}
