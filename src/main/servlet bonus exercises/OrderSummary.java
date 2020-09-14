import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// 3. Create a servlet that listens for POST requests to ```/order-summary``` and
// souts out the name of the product ordered by the user and the quantity.
// HINT: you will probably need to use the request object to get the parameters!

public class OrderSummary extends OrderForm {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String product = request.getParameter("Name of product: ");
        String units = request.getParameter("Number of units: ");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Your Order: </title></head><body>");

        out.println("<p>Name of Product " + product + "Number of Units: "
                + units + " is your order.</p>");

        out.println("</body></html>");

    }
}





