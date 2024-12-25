package com.pracs;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/string-length")
public class StringLength extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String inputString = request.getParameter("inputString");
        int stringLength = inputString.length();

        if (stringLength > 6) {
            out.println("<b>The length of the string " + inputString + " is greater than 6.</b>");
        } else {
            out.println("<b>The length of the string " + inputString + " is not greater than 6.</b>");
        }

        out.close();
    }
}