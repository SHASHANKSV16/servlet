package com.xworkz.bookingforms.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/foodOrder", loadOnStartup = 1)
public class FoodOrderServlet extends HttpServlet {

    public FoodOrderServlet() {
        System.out.println("FoodOrderServlet is created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String customerName = req.getParameter("customerName");
        String contact = req.getParameter("contact");
        String foodItem = req.getParameter("foodItem");
        String address = req.getParameter("address");
        String payment = req.getParameter("payment");
        Cookie[] cookies = req.getCookies();
        if (cookies == null || cookies.length < 1) {
            throw new IllegalArgumentException("cookie is not there plaese go to index page and create a cookie");
        } else {
            for (Cookie cookie : cookies) {
                System.out.println("the name of the cookie is " + cookie.getName() + "the value of cookie" + cookie.getValue());
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
                "    Food Booking details \n" +
                "  </div>\n" +
                "  <div class=\"card-body\">\n" +
                "      <p><strong>Customer Name:</strong> " + customerName + "</p> <p><strong>Contact Number:</strong> " + contact + "</p> <p><strong>Food Item:</strong> " + foodItem + "</p> <p><strong>Delivery Address:</strong> " + address + "</p>  <p><strong>Payment Method:</strong> " + payment + "</p>"+
                "  </div>\n" +
                "</div>");
        writer.println("</div>");
        writer.println("</body></html>");


    }
}
