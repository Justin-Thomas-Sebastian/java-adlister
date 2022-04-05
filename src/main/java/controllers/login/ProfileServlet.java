package controllers.login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.login.ProfileServlet", urlPatterns = "/profile")
public class ProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if(request.getSession().getAttribute("user") == null){
            System.out.println("not logged in");
            response.sendRedirect("/login");
            return;
        }

        String username = (String) request.getSession().getAttribute("user");
        if(!username.equals("admin")){
            System.out.println("not logged in as admin");
            response.sendRedirect("/login");
        } else {
            request.setAttribute("username", username);
            request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        request.setAttribute("username", username);
        request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);
    }
}