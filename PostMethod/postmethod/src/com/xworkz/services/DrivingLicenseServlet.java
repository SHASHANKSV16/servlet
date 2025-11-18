package com.xworkz.services;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

@WebServlet(urlPatterns = "/dl",loadOnStartup = 1)

public class DrivingLicenseServlet extends HttpServlet {


    public DrivingLicenseServlet(){
        System.out.println("driving license Servlet created.........");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("hi");
        String name = servletRequest.getParameter("name");
        String pwd = servletRequest.getParameter("pwd");
        System.out.println(name);
        System.out.println(pwd);
        PrintWriter writer = servletResponse.getWriter();
        servletResponse.setContentType("text/html");
        writer.println("the name is "+name+"<br>");
        writer.println("the password is "+ (Objects.nonNull(pwd)) +"<br>");


    }
}
