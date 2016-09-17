package pe.egcc.carrito.service;

import pe.egcc.carrito.model.Carrito;
import pe.egcc.carrito.model.CarritoItem;

public class CarritoService {

  public void agregarItem( Carrito carrito, CarritoItem item){
    item.setImporte(item.getPrecio() * item.getCant());
    carrito.getItems().add(item);
    double total = 0.0;
    carrito.setCantItems(carrito.getItems().size());
    for(CarritoItem i: carrito.getItems()){
      total += i.getImporte();
    }
    carrito.setTotal(total);
  }
  
}
