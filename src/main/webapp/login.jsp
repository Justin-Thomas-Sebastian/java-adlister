<%--
  Created by IntelliJ IDEA.
  User: justin_mac
  Date: 3/31/22
  Time: 7:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    request.setAttribute("username", request.getParameter("username"));
    request.setAttribute("password", request.getParameter("password"));
%>

<html>
<head>
    <title>Login</title>
</head>
<body>
    <%@ include file="partials/navbar.jsp" %>
    <form method="POST" action="/login.jsp">
        <label for="username">Username</label>
        <input id="username" name="username" type="text">
        <br>
        <label for="password">Password</label>
        <input id="password" name="password" type="password">
        <br>
        <input type="submit">
    </form>

    <c:choose>
        <c:when test="${username.equals('admin') && password.equals('password')}">
            <% response.sendRedirect("/profile.jsp");%>
        </c:when>
    </c:choose>
</body>
</html>
