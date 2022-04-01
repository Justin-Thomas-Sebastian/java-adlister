import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CorrectServlet", urlPatterns = "/correct")
public class CorrectServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String userGuess = request.getParameter("user-guess");
        String random = request.getParameter("random");
        request.setAttribute("random", random);
        request.setAttribute("userGuess", userGuess);
        request.setAttribute("outcome", "correct");
        request.getRequestDispatcher("guess-outcome.jsp").forward(request, response);
    }
}