import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//2. Create a servlet that returns a simple form if the user navigates to ```/order-form```.
// In servering up HTML, you may need to include
// ```response.setHeader("content-type", "text/html");```.
// The form should include an input for the name of a product and an input for how many
// of the product they want to order. The method of the form should be ```POST``` and the
// action should be ```/order-summary```.

@WebServlet(name = "OrderForm", urlPatterns = "/order-form")
public class OrderForm extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setHeader("content-type", "text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Order Form</title></head>");
        out.println("<body>");
        out.println("<h3>Input Your Order</h3>");
        out.println("<form method='post' action='OrderSummary'>");
        out.println("<p>Enter Product Name: <input type='text' name='first'></p>");
        out.println("<p>Enter Number of Items: <input type='text' name='second'></p>");
        out.println("<p><input type='submit' value='submit'></p>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");

    }

}

