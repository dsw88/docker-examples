package info.davidwoodruff.dockerexamples.todos.endpoints;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class HealthEndpoint extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setStatus(HttpServletResponse.SC_OK);
        final PrintWriter writer = res.getWriter();
        try {
            writer.write("OK");
        } finally {
            writer.close();
        }
    }
}
