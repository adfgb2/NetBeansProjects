package joyeria;
// Generated 10-may-2010 15:42:23 by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Producto generated by hbm2java
 */
public class Producto  implements java.io.Serializable {


     private int idProducto;
     private Familia familia;
     private String descripcion;
     private Date fechaDeRegistro;
     private Date fechaDeBaja;
     private String estado;
     private byte[] foto;
     private Set detalleIngresos = new HashSet(0);

    public Producto() {
    }

	
    public Producto(int idProducto, Familia familia, String descripcion, Date fechaDeRegistro, Date fechaDeBaja, String estado, byte[] foto) {
        this.idProducto = idProducto;
        this.familia = familia;
        this.descripcion = descripcion;
        this.fechaDeRegistro = fechaDeRegistro;
        this.fechaDeBaja = fechaDeBaja;
        this.estado = estado;
        this.foto = foto;
    }
    public Producto(int idProducto, Familia familia, String descripcion, Date fechaDeRegistro, Date fechaDeBaja, String estado, byte[] foto, Set detalleIngresos) {
       this.idProducto = idProducto;
       this.familia = familia;
       this.descripcion = descripcion;
       this.fechaDeRegistro = fechaDeRegistro;
       this.fechaDeBaja = fechaDeBaja;
       this.estado = estado;
       this.foto = foto;
       this.detalleIngresos = detalleIngresos;
    }
   
    public int getIdProducto() {
        return this.idProducto;
    }
    
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    public Familia getFamilia() {
        return this.familia;
    }
    
    public void setFamilia(Familia familia) {
        this.familia = familia;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Date getFechaDeRegistro() {
        return this.fechaDeRegistro;
    }
    
    public void setFechaDeRegistro(Date fechaDeRegistro) {
        this.fechaDeRegistro = fechaDeRegistro;
    }
    public Date getFechaDeBaja() {
        return this.fechaDeBaja;
    }
    
    public void setFechaDeBaja(Date fechaDeBaja) {
        this.fechaDeBaja = fechaDeBaja;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public byte[] getFoto() {
        return this.foto;
    }
    
    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
    public Set getDetalleIngresos() {
        return this.detalleIngresos;
    }
    
    public void setDetalleIngresos(Set detalleIngresos) {
        this.detalleIngresos = detalleIngresos;
    }




}


