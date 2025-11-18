package com.xworkz.coffeeapp.servlets;

import com.xworkz.coffeeapp.dto.CoffeeLandDTO;
import com.xworkz.coffeeapp.service.CoffeeLandService;
import com.xworkz.coffeeapp.service.CoffeeLandServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/coffeeLand", loadOnStartup = 1)
// Coffee Land : Size by Acre, Total Plants, Total Yeild, Expenditure, Profit Made, Festilizer Quantity Used

public class CoffeeLandServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String acre = req.getParameter("acre");
        String totalPlants = req.getParameter("totalPlants");
        String totalYield = req.getParameter("totalYield");
        String expenditure = req.getParameter("expenditure");
        String profit = req.getParameter("profit");
        String fertilizerQuantity = req.getParameter("fertilizerQuantity");


        req.setAttribute("acre", acre);
        req.setAttribute("totalPlants", totalPlants);
        req.setAttribute("totalYield", totalYield);
        req.setAttribute("expenditure", expenditure);
        req.setAttribute("fertilizerQuantity", fertilizerQuantity);
        req.setAttribute("profit", profit);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("CoffeeLandResult.jsp");
        requestDispatcher.forward(req, resp);

        CoffeeLandDTO coffeeLandDTO = new CoffeeLandDTO(Double.parseDouble(acre), Double.parseDouble(totalYield), Integer.parseInt(totalPlants), Double.parseDouble(expenditure), Double.parseDouble(profit), Double.parseDouble(fertilizerQuantity));
        CoffeeLandService coffeeLandService = new CoffeeLandServiceImpl();
        coffeeLandService.VlaidateAndAdd(coffeeLandDTO);

    }
}
