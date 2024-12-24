<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>Redirect</title>
</head>
<body>
<%
    int k = 1;

    for(int i = 5; i >= 1; i--){
        for(int j = 1; j <= i; j++) {
            out.println("<b>" + k + "   </b>");
        }
        out.print("<br>");
        k++;
    }
%>
</body>
</html>
