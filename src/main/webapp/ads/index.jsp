<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Ads Home Page</title>
</head>
<body>
    <%@ include file="../partials/navbar.jsp" %>
    <h1>Ads</h1>
    <c:forEach var="ad" items="${ads}">
        <div class="ad">
            <h2>Title: ${ad.getTitle()}</h2>
            <p>Description: ${ad.getDescription()}</p>
        </div>
    </c:forEach>
</body>
</html>
