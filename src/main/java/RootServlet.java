import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RootServlet", urlPatterns = "/")
public class RootServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>This is the home page</h1>");
        out.println("<h1>Click <a href='http://localhost:8080/hello'>here</a> to go to hello world.</h1>");
        out.println("<h1>Click <a href='http://localhost:8080/count'>here</a> to go to view count.</h1>");
    }
}