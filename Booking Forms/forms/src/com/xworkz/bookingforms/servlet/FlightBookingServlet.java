package com.xworkz.bookingforms.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/flight", loadOnStartup = 1)
public class FlightBookingServlet extends HttpServlet {

    public FlightBookingServlet() {
        System.out.println("FlightBookingServlet is created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String passengerName = req.getParameter("passengerName");
        String email = req.getParameter("email");
        String travelClass = req.getParameter("travelClass");
        String notes = req.getParameter("notes");
        String tripType = req.getParameter("tripType");

        Cookie[] cookies = req.getCookies();
        if(cookies == null || cookies.length<1){
            throw new IllegalArgumentException("cookie is there  go to index page and create cookie");
        }else {
            for (Cookie cookie : cookies){
                System.out.println("the name of the cookie is "+cookie.getName() + "the value of cookie is"+cookie.getValue());
            }
        }

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        writer.println("<html><head><link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB\" crossorigin=\"anonymous\"></head><body>");
        writer.println("<h1 style='color: green;text-align: center'>Order Placed Successfully!</h1>");
        writer.println("<h3 style='color: blue;text-align: center'>Order Details:</h3>");
        writer.println("<div>");
        writer.println("<div class=\"card text-center\">\n" +
                "  <div class=\"card-header\">\n" +
                "    Flight Booking details \n" +
                "  </div>\n" +
                "  <div class=\"card-body\">\n" +
                "      <p><strong> Passenger Name:</strong> " + passengerName + "</p> <p><strong>Email :</strong> " + email + "</p> <p><strong>Travel class:</strong> " + travelClass + "</p> <p><strong>Notes:</strong> " + notes + "</p>  <p><strong>Trip Type:</strong> " + tripType + "</p>"+
                "  </div>\n" +
                "</div>");
        writer.println("</div>");
        writer.println("</body></html>");





    }
}
