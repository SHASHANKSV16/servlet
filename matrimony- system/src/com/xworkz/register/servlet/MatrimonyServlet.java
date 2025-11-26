package com.xworkz.register.servlet;

import com.xworkz.register.dto.MatrimonyDTO;
import com.xworkz.register.exception.DataInvalidException;
import com.xworkz.register.service.MatrimonyService;
import com.xworkz.register.service.MatrimonyServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/matrimony",loadOnStartup = 1)

public class MatrimonyServlet extends HttpServlet {


    public MatrimonyServlet(){
        System.out.println("MatrimonyServlet is created");
    }

    MatrimonyService service = new MatrimonyServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        MatrimonyDTO dto = new MatrimonyDTO();
        dto.setEmail(req.getParameter("email"));
        dto.setForWhom(req.getParameter("for"));
        dto.setGender(req.getParameter("gender"));
        dto.setDob(req.getParameter("dob"));
        dto.setMotherTongue(req.getParameter("motherTougue"));
        dto.setReligion(req.getParameter("religion"));
        dto.setMartialStatus(req.getParameter("martialStatus"));
        dto.setHeight(Integer.parseInt(req.getParameter("height")));

        try {
            service.validateAndSave(dto);

            req.setAttribute("email", req.getParameter("email"));
            req.setAttribute("forWhom", req.getParameter("for"));
            req.setAttribute("gender", req.getParameter("gender"));
            req.setAttribute("dob", req.getParameter("dob"));
            req.setAttribute("motherTongue", req.getParameter("motherTougue"));
            req.setAttribute("religion", req.getParameter("religion"));
            req.setAttribute("martialStatus", req.getParameter("martialStatus"));
            req.setAttribute("height", req.getParameter("height"));

            req.setAttribute("success", "Data Added Successfully");

        } catch (DataInvalidException e) {

            req.setAttribute("error", "Data Not Added Successfully");
        }

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("matrimonyResult.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("matrimony.jsp");
        requestDispatcher.forward(req, resp);
    }


}
