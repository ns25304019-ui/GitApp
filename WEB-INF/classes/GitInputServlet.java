import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GitInputServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    request.setCharacterEncoding("UTF-8");

    String sei = request.getParameter("sei");
    String mei = request.getParameter("mei");

    response.setContentType("text/html");
    response.setCharacterEncoding("UTF-8");

    PrintWriter out = response.getWriter();
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<title>YOUR NAME</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("sei:"+sei+"mei:"+mei);
    out.println("</body>");
    out.println("</html>");

        }
}