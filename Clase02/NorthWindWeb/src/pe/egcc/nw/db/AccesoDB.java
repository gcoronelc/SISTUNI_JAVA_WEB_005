package pe.egcc.nw.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class AccesoDB {

  private AccesoDB() {
  }

  public static Connection getConnection() throws SQLException {
    Connection cn = null;
    try {
      // Datos SQL Server
      String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
      String url = "jdbc:sqlserver://localhost:1433;databaseName=northwind";
      String user = "gustavo";
      String pass = "sql";
      // Cargar el driver a memoria
      Class.forName(driver).newInstance();
      // Obtener el objeto Connection
      cn = DriverManager.getConnection(url, user, pass);
    } catch (SQLException e) {
      throw e;
    } catch(ClassNotFoundException e){
      throw new SQLException("No se encuentra el driver.");
    } catch(Exception e){
      throw new SQLException("No se tiene acceso al servidor.");
    }
    return cn;
  }
  
}
