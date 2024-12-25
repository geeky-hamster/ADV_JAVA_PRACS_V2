package com.pracs;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/palindrome-check")
public class PalindromeCheckServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String reversedName = new StringBuilder(name).reverse().toString();

        if (name.equalsIgnoreCase(reversedName)) {
            out.println("<b>The name " + name + " is a palindrome.</b>");
        } else {
            out.println("<b>The name " + name + " is not a palindrome.</b>");
        }

        out.close();
    }
}