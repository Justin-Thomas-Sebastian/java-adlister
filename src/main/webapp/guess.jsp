
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess</title>
</head>
<body>
<form action="/guess" method="POST">
    <p>Guess number between 1 and 3 (inclusive)</p>
    <label for="user-guess"></label>
    <input type="text" name="user-guess" id="user-guess">
    <input type="submit" value="Guess">
</form>

</body>
</html>
