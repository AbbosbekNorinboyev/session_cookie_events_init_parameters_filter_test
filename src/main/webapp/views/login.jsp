<%--
  Created by IntelliJ IDEA.
  User: norin
  Date: 1/5/2024
  Time: 5:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <jsp:include page="/fragments/css.jsp"/>
</head>
<body>
<form method="post">
    <div class="m-3">
        <label class="form-label" for="user">Username </label>
        <input class="form-control" id="user" type="username" name="username"/>
        <br>
        <label class="form-label" for="pass">Password </label>
        <input class="form-control" id="pass" type="password" name="password"/>
        <br>
        <input class="btn btn-success" type="submit" value="Login"/>
    </div>
</form>
<jsp:include page="/fragments/js.jsp"/>
</body>
</html>
