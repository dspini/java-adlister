import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

// 1. Create a servlet that returns your first and last name in a heading element to the
// user if navigating to ```/name```.

    @WebServlet(name = "FirstAndLastName", urlPatterns = "/name")
    public class FirstAndLastName extends HttpServlet {

        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<h1>Donnie Spini</h1>");
        }
    }

