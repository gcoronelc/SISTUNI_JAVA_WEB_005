package pe.egcc.sumarapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.egcc.sumarapp.service.MateService;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
@WebServlet(name = "ServletSumar", urlPatterns = {"/ServletSumar"})
public class ServletSumar extends HttpServlet {

  @Override
  protected void doPost(HttpServletRequest request,
          HttpServletResponse response) throws ServletException, IOException {

    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();

    try {
      // Datos
      int n1 = Integer.parseInt(request.getParameter("num1"));
      int n2 = Integer.parseInt(request.getParameter("num2"));
      // Proceso
      MateService service = new MateService();
      int suma = service.sumar(n1, n2);
      // Reporte
      mostrarCabecera(out);
      out.println("<h1>RESULTADO</h1>");
      out.println("<p>Número 1: " + n1 + "</p>");
      out.println("<p>Número 2: " + n2 + "</p>");
      out.println("<p>Suma: " + suma + "</p>");
      mostrarPie(out);
    } catch (Exception e) {
      mostrarCabecera(out);
      out.println("<h1>ERROR</h1>");
      out.println("<p style='color:red;'>" + e.getMessage() + "</p>");
      mostrarPie(out);
    }

  }

  private void mostrarCabecera(PrintWriter out) {
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<title>SUMAR</title>");
    out.println("</head>");
    out.println("<body>");
  }

  private void mostrarPie(PrintWriter out) {
    out.println("<a href='index.html'>Retornar</a>");
    out.println("</body>");
    out.println("</html>");
  }

}
