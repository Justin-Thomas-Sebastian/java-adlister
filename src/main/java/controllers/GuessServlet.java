package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "controllers.GuessServlet", urlPatterns = "/guess")
public class GuessServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("/guess.jsp");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int userGuess = Integer.parseInt(request.getParameter("user-guess"));
        int randomNumber = getRandomNumber(1,3);
        String randomToStr = Integer.toString(randomNumber);

        if(userGuess == randomNumber){
            request.getRequestDispatcher("/correct?random=" + randomToStr).forward(request, response);
        } else {
            request.getRequestDispatcher("/incorrect?random=" + randomToStr).forward(request, response);
        }
    }

    protected int getRandomNumber(int min, int max){
        Random random = new Random();
        return random.nextInt(max + 1 - min) + min;
    }
}