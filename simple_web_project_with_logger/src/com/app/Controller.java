package com.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "Controller", urlPatterns = {"/controller"})
public class Controller extends HttpServlet {
    static Logger logger = LogManager.getLogger(Controller.class.getName());

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstValue = request.getParameter("value1");
        String secondValue = request.getParameter("value2");
        int a = Integer.parseInt(firstValue);
        int b = Integer.parseInt(secondValue);
        request.setAttribute("result", a + b);
        request.getRequestDispatcher("pages/main.jsp").forward(request, response);
        logger.info("hello, I'm loggerrr!");
    }
}
