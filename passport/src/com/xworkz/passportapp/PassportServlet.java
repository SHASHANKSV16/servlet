package com.xworkz.passportapp;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
@WebServlet(urlPatterns = "/passport",loadOnStartup = 1)

public class PassportServlet extends GenericServlet {

    public PassportServlet(){
        System.out.println("passpoet servlet created");
        Comparable
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String registerAt = servletRequest.getParameter("registerAt");
        String office = servletRequest.getParameter("office");
        String name = servletRequest.getParameter("name");
        String surName = servletRequest.getParameter("surname");
        String dob = servletRequest.getParameter("dob");
        String email=servletRequest.getParameter("email");
        String isLoginIdSameasEmailId = servletRequest.getParameter("loginSame");
        String loginId = servletRequest.getParameter("loginId");
        String pwd = servletRequest.getParameter("pwd");
        String cpwd = servletRequest.getParameter("pwd");
        String hintQuestion = servletRequest.getParameter("hintQuestion");
        String hintAnswer = servletRequest.getParameter("hintAnswer");

        System.out.println("Registered at " + registerAt);
        System.out.println("Office: " + office);
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surName);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Email: " + email);
        System.out.println("Is Login ID same as Email ID: " + isLoginIdSameasEmailId);
        System.out.println("Login ID: " + loginId);
        System.out.println("Password: " + pwd);
        System.out.println("Confirm Password: " + cpwd);
        System.out.println("Hint Question: " + hintQuestion);
        System.out.println("Hint Answer: " + hintAnswer);
        servletResponse.setContentType("text/html");
        PrintWriter writer = servletResponse.getWriter();
        writer.println("Registered at " + registerAt+"<br>");
        writer.println("Office: " + office+"<br>");
        writer.println("Name: " + name+"<br>");
        writer.println("Surname: " + surName+"<br>");
        writer.println("Date of Birth: " + dob+"<br>");
        writer.println("Email: " + email+"<br>");
        writer.println("Is Login ID same as Email ID: " + isLoginIdSameasEmailId+"<br>");
        writer.println("Login ID: " + loginId+"<br>");
        writer.println("Password: " + Objects.nonNull(pwd)+"<br>");
        writer.println("Confirm Password: " + Objects.nonNull(pwd)+"<br>");
        writer.println("Hint Question: " + hintQuestion+"<br>");
        writer.println("Hint Answer: " + hintAnswer+"<br>");



    }
}
