<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza</title>
</head>
<body>

<form method="POST" action="/pizza-order">
    <label for="crust">Crust Type:</label>
    <select name="crust" id="crust">
        <option value="stuffed">Stuffed Crust</option>
        <option value="thick">Thick</option>
        <option value="thin">Thin</option>
    </select><br>

    <label for="sauce">Sauce Type:</label>
    <select name="sauce" id="sauce">
        <option value="regular">Regular</option>
        <option value="garlic">Garlic</option>
        <option value="marinara">Marinara</option>
    </select><br>

    <label for="size">Size:</label>
    <select name="size" id="size">
        <option value="small">Small</option>
        <option value="medium">Medium</option>
        <option value="large">Large</option>
    </select><br>

    <label>Toppings: </label><br>
    <input type="checkbox" id="topping1" name="topping1" value="pepperoni">
    <label for="topping1"> Pepperoni</label><br>
    <input type="checkbox" id="topping2" name="topping2" value="anchovies">
    <label for="topping2"> Anchovies</label><br>
    <input type="checkbox" id="topping3" name="topping3" value="pineapple">
    <label for="topping3"> Pineapple</label><br>

    <label for="address">Address:</label>
    <input type="text" id="address" name="address"><br>
    <input type="submit" value="Order">
</form>
</body>
</html>