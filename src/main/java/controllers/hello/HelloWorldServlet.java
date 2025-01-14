package controllers.hello;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "controllers.hello.HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String paramName = "name";
        String parameterValue = req.getParameter(paramName);

        if(parameterValue == null){
            out.println("<h1>Hello, stranger</h1>");
        } else {
            out.println("<h1>Hello, " + parameterValue + "</h1>");
        }
    }
}