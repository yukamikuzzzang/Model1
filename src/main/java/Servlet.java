import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Date today = new Date();
        out.println("<html>" +
                "<body>" +
                "<h1 align=center>Servlet </h1><br>" +
                "<br>" + today + "<br><a href='https://velog.io/@lukehongg/intellij-jsp-project' target='_blank'>REFERENCE</a>"+"</body>" +
                "</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
