package com.xworkz.ipl.servlets;

import com.xworkz.ipl.dto.PlayerDTO;
import com.xworkz.ipl.service.PlayerService;
import com.xworkz.ipl.service.PlayerServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

@WebServlet(urlPatterns = "/searchPlayer", loadOnStartup = 1)
public class SearchPlayerServlet extends HttpServlet {

    private PlayerService service = new PlayerServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String playerType = req.getParameter("playerType");

        List<PlayerDTO> playerList = service.searchByType(playerType);

        req.setAttribute("playerList", playerList);

        RequestDispatcher dispatcher =
                req.getRequestDispatcher("biddingTeams.jsp");
        dispatcher.forward(req, resp);
    }
}