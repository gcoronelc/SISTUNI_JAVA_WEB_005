package pe.egcc.nw.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import pe.egcc.nw.db.AccesoDB;
import pe.egcc.nw.model.Cliente;

public class ClienteService {

  
  public Cliente traerCliente(String id){
    Cliente bean = null;
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      String sql = "select CustomerID, CompanyName, ContactName, "
          + "ContactTitle, Address, City, Region, PostalCode, "
          + "Country, Phone, Fax "
          + "from customers where CustomerID = ? ";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, id);
      ResultSet rs = pstm.executeQuery();
      if(rs.next()){
        bean = new Cliente();
        bean.setId(rs.getString("CustomerID"));
        bean.setNombre(rs.getString("CompanyName"));
        bean.setContacto(rs.getString("ContactName"));
        bean.setCargo(rs.getString("ContactTitle"));
        bean.setDireccion(rs.getString("Address"));
        bean.setCiudad(rs.getString("City"));
        bean.setRegion(rs.getString("Region"));
        bean.setCodPostal(rs.getString("PostalCode"));
        bean.setCiudad(rs.getString("Country"));
        bean.setTelefono(rs.getString("Phone"));
        bean.setFax(rs.getString("Fax"));
      }
      rs.close();
      pstm.close();
      if(bean == null){
        throw new Exception("Dato incorrecto.");
      }
    } catch (Exception e) {
      throw new RuntimeException();
    } finally{
      try {
        cn.close();
      } catch (Exception e2) {
      }
    }
    return bean;
  }
  
}
