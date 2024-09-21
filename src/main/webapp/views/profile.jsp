<%@ page import="java.util.Arrays" %><%--
  Created by IntelliJ IDEA.
  User: norin
  Date: 1/5/2024
  Time: 5:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile</title>
</head>
<body>
<h1>Profile Page</h1>
<%--<h1>Username: <%= request.getSession().getAttribute("username") %>--%>
<%--</h1>--%>
<%--<h1>Password: <%= request.getSession().getAttribute("password") %>--%>
<%--</h1>--%>
<h1>Username: <%=
Arrays.stream(request.getCookies())
        .filter(cookie -> cookie.getName().equals("username"))
        .findFirst()
        .get()
        .getValue()%>
</h1>
</body>
</html>
