package controllers.hello;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "controllers.hello.CountServlet", urlPatterns = "/count")
public class CountServlet extends HttpServlet {
    private int viewCounter = 0;

    public int getViewCounter() {
        return viewCounter;
    }

    public void setViewCounter(int newViewCounter){
        this.viewCounter = newViewCounter;
    }

    public void addViewCounter() {
        setViewCounter(getViewCounter() + 1);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String paramName = "current-count";
        String parameterValue = req.getParameter(paramName);

        addViewCounter();
        if (parameterValue != null) {
            setViewCounter(Integer.parseInt(parameterValue));
        }
        out.println("<h1>This page has been viewed " + getViewCounter() + " times</h1>");
    }
}