<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>Prime Number</title>
</head>
<body>
    <%
        int number = Integer.parseInt(request.getParameter("number"));

        boolean flag = false;
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                flag = true;
                    break;
                }
            }

        if(!flag) {
            out.println("<b>" + number + " is a Prime Number</b>");
        }
        else {
            out.println("<b>" + number + " is not a Prime Number</b>");
        }
    %>
</body>
</html>
