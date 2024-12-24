package com.pracs;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/prime-number")
public class PrimeNumber extends HttpServlet {
    private static final long serialUID = 1l;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");

        int number = Integer.parseInt(req.getParameter("number"));

        boolean flag = false;
        for (int i = 2; i <= number / 2; ++i) {
            // condition for nonprime number
            if (number % i == 0) {
                flag = true;
                break;
            }
        }

        if(!flag) {
            out.println("<b>It is a Prime Number</b>");
        }
        else {
            out.println("<b>It is NOT a Prime Number</b>");
        }

        out.close();
    }
}
