package pe.egcc.carrito.model;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

  private String cliente;
  private double total;
  private int cantItems;
  private List<CarritoItem> items;
  
  public Carrito() {
    items = new ArrayList<>();
  }
  
  public String getCliente() {
    return cliente;
  }

  public void setCliente(String cliente) {
    this.cliente = cliente;
  }

  public double getTotal() {
    return total;
  }

  public void setTotal(double total) {
    this.total = total;
  }

  public List<CarritoItem> getItems() {
    return items;
  }

  public void setItems(List<CarritoItem> items) {
    this.items = items;
  }
  public void setCantItems(int cantItems) {
    this.cantItems = cantItems;
  }
  
  public int getCantItems() {
    return cantItems;
  }

}
