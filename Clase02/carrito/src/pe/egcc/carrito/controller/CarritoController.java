package pe.egcc.carrito.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pe.egcc.carrito.model.Carrito;
import pe.egcc.carrito.model.CarritoItem;
import pe.egcc.carrito.service.CarritoService;

@WebServlet({ "/Grabar", "/Ingresar","/Salir" })
public class CarritoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, 
	    HttpServletResponse response) throws ServletException, IOException {
	  
	  String path = request.getServletPath();
	  if(path.equals("/Ingresar")){
	    ingresar(request,response);
	  } else if(path.equals("/Grabar")){
      grabar(request,response);
    }
	  
	}

  private void grabar(HttpServletRequest request, 
      HttpServletResponse response) 
      throws ServletException, IOException {
    String destino;
    try {
      // Datos
      CarritoItem item = new CarritoItem();
      item.setNombre(request.getParameter("articulo"));
      item.setPrecio(Double.parseDouble(request.getParameter("precio")));
      item.setCant(Integer.parseInt(request.getParameter("cant")));
      // Obtener carrito
      HttpSession session = request.getSession();
      Carrito carrito;
      carrito = (Carrito) session.getAttribute("carrito");
      // Proceso
      CarritoService service = new CarritoService();
      service.agregarItem(carrito, item);
      request.setAttribute("mensaje", "Proceso ejecutado correctamente.");
      destino = "main.jsp";
    } catch (Exception e) {
      request.setAttribute("error", e.getMessage());
      destino = "agregar.jsp";
    }
    // Forward
    RequestDispatcher rd;
    rd = request.getRequestDispatcher(destino);
    rd.forward(request, response);
  }

  private void ingresar(HttpServletRequest request, 
      HttpServletResponse response) 
          throws ServletException, IOException {
    String destino;
    // Datos
    String nombre = request.getParameter("nombre");
    if(nombre == null || nombre.isEmpty()){
      request.setAttribute("error", "Debes ingresar tu nombre.");
      destino = "index.jsp";
    } else {
      Carrito carrito = new Carrito();
      carrito.setCliente(nombre);
      request.getSession().setAttribute("carrito", carrito);
      destino = "main.jsp";
    }
    // Forward
    RequestDispatcher rd;
    rd = request.getRequestDispatcher(destino);
    rd.forward(request, response);
  }

}
