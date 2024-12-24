package com.pracs;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/redirect")
public class Redirect extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        int number = Integer.parseInt(request.getParameter("number"));

        if(number % 2 == 0) {
            response.sendRedirect("https://web.whatsapp.com/");
        } else {
            response.sendRedirect("https://www.google.com/");
        }

        out.close();
    }
}
