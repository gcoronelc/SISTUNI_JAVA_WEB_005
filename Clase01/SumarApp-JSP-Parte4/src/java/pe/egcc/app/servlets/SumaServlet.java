package pe.egcc.app.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.egcc.app.model.SumaModel;
import pe.egcc.app.service.MateService;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
@WebServlet(name = "SumaServlet", urlPatterns = {"/SumaServlet"})
public class SumaServlet extends HttpServlet {

  @Override
  protected void doPost(HttpServletRequest request, 
          HttpServletResponse response) throws ServletException, IOException {
    
    // Datos
    SumaModel model = new SumaModel();
    model.setNum1(Integer.parseInt(request.getParameter("a")));
    model.setNum2(Integer.parseInt(request.getParameter("b")));
    // Proceso
    MateService service = new MateService();
    service.sumar(model);
    // Forward
    request.setAttribute("model", model);
    RequestDispatcher rd;
    rd = request.getRequestDispatcher("suma.jsp");
    rd.forward(request, response);
  }

  
  
}
