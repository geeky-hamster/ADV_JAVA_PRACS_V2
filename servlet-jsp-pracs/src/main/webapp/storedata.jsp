<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Store Data</title>
</head>
<body>
    <h1>Store Data</h1>
    <form action="" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name"><br><br>
        <label for="email">Email:</label>
        <input type="text" id="email" name="email"><br><br>
        <input type="submit" value="Store">
    </form>

    <%
        String name = request.getParameter("name");
        String email = request.getParameter("email");

        if (name != null && email != null) {
            try {
                Class.forName("org.postgresql.Driver");
                Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5433/store", "postgres", "admin");
                PreparedStatement stmt = conn.prepareStatement("INSERT INTO users (name, email) VALUES (?, ?)");
                stmt.setString(1, name);
                stmt.setString(2, email);
                stmt.executeUpdate();
                out.println("<p>Data stored successfully.</p>");
            } catch (Exception e) {
                out.println("<p>Error storing data: " + e.getMessage() + "</p>");
            }
        }
    %>
</body>
</html>