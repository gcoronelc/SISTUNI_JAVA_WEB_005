package pe.egcc.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
@WebServlet(name = "Hola",
        urlPatterns = {"/Hola", "/Hello", "/Hi", "/Bateria"})
public class Hola extends HttpServlet {

  @Override
  protected void service(HttpServletRequest request,
          HttpServletResponse response)
          throws ServletException, IOException {

    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<title>Hola Mundo</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>Hola Mundo</h1>");
    out.println("</body>");
    out.println("</html>");

  }

}
