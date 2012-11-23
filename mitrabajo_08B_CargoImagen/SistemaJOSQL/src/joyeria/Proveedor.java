package joyeria;
// Generated 10-may-2010 15:42:23 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Proveedor generated by hbm2java
 */
public class Proveedor  implements java.io.Serializable {


     private String idProveedor;
     private String nombre;
     private String direccion;
     private String codPostal;
     private String provincia;
     private String departamento;
     private String pais;
     private String email;
     private Set ingresos = new HashSet(0);

    public Proveedor() {
    }

	
    public Proveedor(String idProveedor, String nombre, String direccion, String codPostal, String provincia, String departamento, String pais, String email) {
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.direccion = direccion;
        this.codPostal = codPostal;
        this.provincia = provincia;
        this.departamento = departamento;
        this.pais = pais;
        this.email = email;
    }
    public Proveedor(String idProveedor, String nombre, String direccion, String codPostal, String provincia, String departamento, String pais, String email, Set ingresos) {
       this.idProveedor = idProveedor;
       this.nombre = nombre;
       this.direccion = direccion;
       this.codPostal = codPostal;
       this.provincia = provincia;
       this.departamento = departamento;
       this.pais = pais;
       this.email = email;
       this.ingresos = ingresos;
    }
   
    public String getIdProveedor() {
        return this.idProveedor;
    }
    
    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getCodPostal() {
        return this.codPostal;
    }
    
    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }
    public String getProvincia() {
        return this.provincia;
    }
    
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public String getDepartamento() {
        return this.departamento;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getPais() {
        return this.pais;
    }
    
    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Set getIngresos() {
        return this.ingresos;
    }
    
    public void setIngresos(Set ingresos) {
        this.ingresos = ingresos;
    }




}


