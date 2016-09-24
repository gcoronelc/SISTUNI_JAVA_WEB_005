package pe.egcc.nw.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.egcc.nw.model.Empleado;
import pe.egcc.nw.service.LogonService;

@WebServlet({"/LogonIngresar","/LogonSalir"})
public class LogonController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  String path = request.getServletPath();
	  switch (path) {
    case "/LogonIngresar":
      ingresar(request,response);
      break;
    }
	} // Fin de service

  private void ingresar(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    String destino;
    try {
      // Datos
      String usuario = request.getParameter("usuario");
      String clave = request.getParameter("clave");
      // Proceso
      LogonService service = new LogonService();
      Empleado bean =  service.verificar(usuario, clave);
      // Agregar Objeto a Session
      request.getSession().setAttribute("usuario", bean);
      destino = "main.jsp";
    } catch (Exception e) {
      request.setAttribute("error", e.getMessage());
      destino = "index.jsp";
    }
    // Forward
    ControlUtil.forward(request, response, destino);
  }
	
	

} // Fin de LogonController
