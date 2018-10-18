package by.itacademy.web;

import by.itacademy.entity.User;
import by.itacademy.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user")
public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id = Integer.valueOf(req.getParameter("id"));

        UserService userService = new UserService();
        User user = new User();

        user = userService.getUserService(id); // тут!

        req.setAttribute("user", user);

        getServletContext().getRequestDispatcher("/WEB-INF/jsp/user.jsp").forward(req, resp);
    }
}
