    <%@ page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8"%>
    <!DOCTYPE html>
    <html>
    <head>
    <meta charset="UTF-8">
    <title>Logged In Page</title>
    </head>
    <body>
        <h1>Logged In Page</h1>
        <%
            String username = (String) session.getAttribute("username");
            if (username != null) {
        %>
            <p>Welcome, <%= username %></p>
        <%
            } else {
        %>
            <p>You are not logged in.</p>
        <%
            }
        %>
    </body>
    </html>