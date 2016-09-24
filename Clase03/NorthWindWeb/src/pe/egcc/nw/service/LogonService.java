package pe.egcc.nw.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.management.RuntimeErrorException;

import pe.egcc.nw.db.AccesoDB;
import pe.egcc.nw.model.Empleado;

public class LogonService {

  public Empleado verificar(String usuario, String clave) {
    Empleado bean = null;
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      String sql = "select EmployeeID, LastName, FirstName, Title," 
          + "TitleOfCourtesy, BirthDate, HireDate, Address,"
          + "City, Region, PostalCode, Country, HomePhone," 
          + "Extension, Photo, Notes, ReportsTo, PhotoPath "
          + "from Employees " 
          + "where EmployeeID = ( " 
          + "select EmployeeID from dbo.Users " 
          + "where UserName = ? "
          + "and Password = HashBytes('SHA1',CONVERT(varchar,?)) " 
          + "and State = 1)";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, usuario);
      pstm.setString(2, clave);
      ResultSet rs = pstm.executeQuery();
      if (rs.next()) {
        bean = new Empleado();
        bean.setId(rs.getInt("EmployeeID"));
        bean.setApellido(rs.getString("LastName"));
        bean.setNombre(rs.getString("FirstName"));
        bean.setTitulo(rs.getString("Title"));
        bean.setTitulo2(rs.getString("TitleOfCourtesy"));
        bean.setFechaNac(rs.getDate("BirthDate"));
        bean.setFechaIng(rs.getDate("HireDate"));
        bean.setDireccion(rs.getString("Address"));
        bean.setCiudad(rs.getString("City"));
        bean.setRegion(rs.getString("Region"));
        bean.setCodPostal(rs.getString("PostalCode"));
        bean.setPais(rs.getString("Country"));
        bean.setTelefono(rs.getString("HomePhone"));
        bean.setExtension(rs.getString("Extension"));
        bean.setFoto(rs.getBytes("Photo"));
        bean.setNotas(rs.getString("Notes"));
        bean.setJefe(rs.getString("ReportsTo"));
        bean.setRutaFoto(rs.getString("PhotoPath"));
      }
      rs.close();
      pstm.close();
      if (bean == null) {
        throw new Exception("Datos incorrectos.");
      }
    } catch (Exception e) {
      throw new RuntimeException(e.getMessage());
    } finally {
      try {
        cn.close();
      } catch (Exception e2) {
      }
    }
    return bean;
  }

  
  
}
