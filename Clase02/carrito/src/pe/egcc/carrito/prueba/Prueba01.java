package pe.egcc.carrito.prueba;

import pe.egcc.carrito.model.Carrito;
import pe.egcc.carrito.model.CarritoItem;
import pe.egcc.carrito.service.CarritoService;

public class Prueba01 {

  public static void main(String[] args) {
    
    Carrito carrito = new Carrito();
    CarritoService service = new CarritoService();
    
    service.agregarItem(carrito, new CarritoItem("Producto 1", 950.0, 3));
    service.agregarItem(carrito, new CarritoItem("Producto 2", 457.0, 4));
    service.agregarItem(carrito, new CarritoItem("Producto 3", 856.0, 6));
    service.agregarItem(carrito, new CarritoItem("Producto 4", 745.0, 4));
    service.agregarItem(carrito, new CarritoItem("Producto 5", 678.0, 7));
    
    for(CarritoItem i: carrito.getItems()){
      System.out.println(i.toString());
    }
    System.out.println("Total: " + carrito.getTotal());
  }
}
