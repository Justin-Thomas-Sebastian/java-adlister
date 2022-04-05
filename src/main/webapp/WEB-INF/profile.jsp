
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile</title>
</head>
<body>
    <%@ include file="../partials/navbar.jsp" %>
    <p>Logged in as ${username}</p>
    <form action="/logout" method="POST">
        <input type="submit" value="Logout">
    </form>
</body>
</html>
