import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "PizzaServlet", urlPatterns = "/pizza-order")
public class PizzaServlet extends HttpServlet {
    protected List<String> toppingsList = new ArrayList<>();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("pizza-order.jsp");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // get values from pizza order form
        String crust = request.getParameter("crust");
        String sauce = request.getParameter("sauce");
        String size = request.getParameter("size");
        String topping1 = request.getParameter("topping1");
        String topping2 = request.getParameter("topping2");
        String topping3 = request.getParameter("topping3");
        String address = request.getParameter("address");

        // add topping to toppings list if not null
        addTopping(topping1);
        addTopping(topping2);
        addTopping(topping3);

        // Output values
        System.out.println("Crust: " + crust);
        System.out.println("Sauce: " + sauce);
        System.out.println("Size: " + size);
        System.out.println("Toppings:" + toppingsList.toString());
        System.out.println("Address: " + address);
    }

    protected void addTopping(String topping){
        if(topping != null) {
            toppingsList.add(topping);
        }
    }
}