package com.xworkz.ipl.servlets;

import com.xworkz.ipl.dto.PlayerDTO;
import com.xworkz.ipl.exception.DataInvalidException;
import com.xworkz.ipl.exception.DataNotSavedException;
import com.xworkz.ipl.service.PlayerService;
import com.xworkz.ipl.service.PlayerServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/playerLogin",loadOnStartup = 1)
public class IPLServlets extends HttpServlet {

    PlayerService service = new PlayerServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String playerName = req.getParameter("playerName");
        int age = Integer.parseInt(req.getParameter("age"));
        String playerType = req.getParameter("playerType");
        String state = req.getParameter("state");
        double battingAvg = Double.parseDouble(req.getParameter("battingAvg"));
        double bowlingAvg = Double.parseDouble(req.getParameter("bowlingAvg"));
        int stumps = Integer.parseInt(req.getParameter("stumps"));
        PlayerDTO dto = new PlayerDTO(playerName,age,playerType,state,battingAvg,bowlingAvg,stumps);
        System.out.println(dto);
try{
        service.ValidateAndSave(dto);
    req.setAttribute("playerName", playerName);
    req.setAttribute("age", age);
    req.setAttribute("playerType", playerType);
    req.setAttribute("state", state);
    req.setAttribute("battingAvg", battingAvg);
    req.setAttribute("bowlingAvg", bowlingAvg);
    req.setAttribute("stumps", stumps);

    req.setAttribute("success", "Player Registered Successfully");

    RequestDispatcher dispatcher = req.getRequestDispatcher("result.jsp");
    dispatcher.forward(req, resp);



}catch (DataInvalidException e) {

    req.setAttribute("dataError", "Data is Invalid");

    RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
    dispatcher.forward(req, resp);

} catch (DataNotSavedException e) {

    req.setAttribute("nameError", "The name has been used. Please try again.");

    RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
    dispatcher.forward(req, resp);
}
}
}
