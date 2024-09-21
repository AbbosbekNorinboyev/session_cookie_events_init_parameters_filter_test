<%--
  Created by IntelliJ IDEA.
  User: norin
  Date: 1/5/2024
  Time: 10:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bad Request</title>
    <link rel="stylesheet" href="/fragments/css.css"/>
</head>
<body>
<h1 class="bad-request">
    Bad Request
</h1>
<p>Message: ${error_message}</p>
<p>URL: ${error_uri}</p>
<p>Code: ${error_code}</p>
</body>
</html>
