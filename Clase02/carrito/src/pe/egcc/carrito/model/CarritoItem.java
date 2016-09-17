package pe.egcc.carrito.model;

public class CarritoItem {
  
  private static int cont = 0;

  private int id;
  private String nombre;
  private double precio;
  private int cant;
  private double importe;

  public CarritoItem() {
    id = ++cont;
  }

  public CarritoItem(String nombre, double precio, int cant) {
    super();
    id = ++cont;
    this.nombre = nombre;
    this.precio = precio;
    this.cant = cant;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int getCant() {
    return cant;
  }

  public void setCant(int cant) {
    this.cant = cant;
  }

  public double getImporte() {
    return importe;
  }

  public void setImporte(double importe) {
    this.importe = importe;
  }
  
  @Override
  public String toString() {
    String texto = id + " | " + nombre 
        + " | " + precio + " | " + cant + " | " + importe;
    return texto;
  }

}
