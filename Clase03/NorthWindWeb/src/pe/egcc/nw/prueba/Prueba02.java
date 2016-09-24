package pe.egcc.nw.prueba;

import pe.egcc.nw.model.Empleado;
import pe.egcc.nw.service.LogonService;

public class Prueba02 {

  public static void main(String[] args) {
    try {
      LogonService service = new LogonService();
      Empleado bean = service.verificar("Nancy", "suerte");
      System.out.println("Hola " + bean.getNombre());
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
  }
}
