package pe.egcc.app.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.egcc.app.model.MateModel;
import pe.egcc.app.service.MateService;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
@WebServlet(name = "MateServlet",
        urlPatterns = {"/MateSumar", "/MateRestar", "/MateDivide"})
public class MateServlet extends HttpServlet {

  @Override
  protected void service(HttpServletRequest request,
          HttpServletResponse response) throws ServletException, IOException {
    String path = request.getServletPath();
    if (path.equals("/MateSumar")) {
      mateSumar(request, response);
    } else if (path.equals("/MateRestar")) {
      mateRestar(request, response);
    }

  }

  private void mateSumar(HttpServletRequest request, 
          HttpServletResponse response) 
          throws ServletException, IOException {
    // Datos
    MateModel model = new MateModel();
    model.setNum1(Integer.parseInt(request.getParameter("num1")));
    model.setNum2(Integer.parseInt(request.getParameter("num2")));
    // Proceso
    model.setOpera("+");
    MateService service = new MateService();
    service.procesar(model);
    // Forward
    request.setAttribute("model", model);
    RequestDispatcher rd = request.getRequestDispatcher("sumar.jsp");
    rd.forward(request, response);
  }

  private void mateRestar(HttpServletRequest request, HttpServletResponse response) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

}
