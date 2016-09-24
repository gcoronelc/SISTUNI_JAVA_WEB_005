package pe.egcc.nw.model;

import java.util.Date;

public class Empleado {

  private int id;
  private String nombre;
  private String apellido;
  private String titulo;
  private String titulo2;
  private Date fechaNac;
  private Date fechaIng;
  private String direccion;
  private String ciudad;
  private String region;
  private String codPostal;
  private String pais;
  private String telefono;
  private String extension;
  private byte[]  foto;
  private String  notas;
  private String jefe;
  private String rutaFoto;
  
  public Empleado() {
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

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getTitulo2() {
    return titulo2;
  }

  public void setTitulo2(String titulo2) {
    this.titulo2 = titulo2;
  }

  public Date getFechaNac() {
    return fechaNac;
  }

  public void setFechaNac(Date fechaNac) {
    this.fechaNac = fechaNac;
  }

  public Date getFechaIng() {
    return fechaIng;
  }

  public void setFechaIng(Date fechaIng) {
    this.fechaIng = fechaIng;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public String getCiudad() {
    return ciudad;
  }

  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }

  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public String getCodPostal() {
    return codPostal;
  }

  public void setCodPostal(String codPostal) {
    this.codPostal = codPostal;
  }

  public String getPais() {
    return pais;
  }

  public void setPais(String pais) {
    this.pais = pais;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }

  public byte[] getFoto() {
    return foto;
  }

  public void setFoto(byte[] foto) {
    this.foto = foto;
  }

  public String getNotas() {
    return notas;
  }

  public void setNotas(String notas) {
    this.notas = notas;
  }

  public String getJefe() {
    return jefe;
  }

  public void setJefe(String jefe) {
    this.jefe = jefe;
  }

  public String getRutaFoto() {
    return rutaFoto;
  }

  public void setRutaFoto(String rutaFoto) {
    this.rutaFoto = rutaFoto;
  }

  
  
    
}
