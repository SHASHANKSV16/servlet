package com.xworkz.wonderla.servlets;

import com.xworkz.wonderla.dto.SearchDto;
import com.xworkz.wonderla.dto.WonderlaDTO;
import com.xworkz.wonderla.service.WonderlaService;
import com.xworkz.wonderla.service.WonderlaServiceImpl;
import lombok.SneakyThrows;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(urlPatterns = "/edit", loadOnStartup = 1)
public class BookingDetailsEditServlet extends HttpServlet {
    WonderlaService wonderlaService = new WonderlaServiceImpl();

    @SneakyThrows
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String date = req.getParameter("date");
        SearchDto searchDto = new SearchDto(date, email);
        Optional<WonderlaDTO> wonderlaDTO = wonderlaService.validateAndSearch(searchDto);
        req.setAttribute("edit", wonderlaDTO.get());
        req.getRequestDispatcher("update.jsp").forward(req, resp);
    }
}
