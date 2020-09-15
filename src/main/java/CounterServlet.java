package controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "controller.CounterServlet", urlPatterns = "/count")
public class CounterServlet extends HttpServlet {
    int hitCount;

    public void init() {
        hitCount = 0;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
            response.setContentType("text/html");
            hitCount++;
            PrintWriter out = response.getWriter();

            out.println(hitCount);
    }
    public void destroy(){}
}