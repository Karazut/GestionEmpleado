package POJO;
// Generated 01-mar-2016 8:17:46 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Contrato generated by hbm2java
 */
public class Contrato  implements java.io.Serializable {


     private Integer codContrato;
     private Categoriaprofesional categoriaprofesional;
     private Empleado empleado;
     private Date fechaInicio;
     private boolean enVigor;
     private Date fechaFin;

    public Contrato() {
    }

	
    public Contrato(Categoriaprofesional categoriaprofesional, Empleado empleado, Date fechaInicio, boolean enVigor) {
        this.categoriaprofesional = categoriaprofesional;
        this.empleado = empleado;
        this.fechaInicio = fechaInicio;
        this.enVigor = enVigor;
    }
    public Contrato(Categoriaprofesional categoriaprofesional, Empleado empleado, Date fechaInicio, boolean enVigor, Date fechaFin) {
       this.categoriaprofesional = categoriaprofesional;
       this.empleado = empleado;
       this.fechaInicio = fechaInicio;
       this.enVigor = enVigor;
       this.fechaFin = fechaFin;
    }
   
    public Integer getCodContrato() {
        return this.codContrato;
    }
    
    public void setCodContrato(Integer codContrato) {
        this.codContrato = codContrato;
    }
    public Categoriaprofesional getCategoriaprofesional() {
        return this.categoriaprofesional;
    }
    
    public void setCategoriaprofesional(Categoriaprofesional categoriaprofesional) {
        this.categoriaprofesional = categoriaprofesional;
    }
    public Empleado getEmpleado() {
        return this.empleado;
    }
    
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public Date getFechaInicio() {
        return this.fechaInicio;
    }
    
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public boolean isEnVigor() {
        return this.enVigor;
    }
    
    public void setEnVigor(boolean enVigor) {
        this.enVigor = enVigor;
    }
    public Date getFechaFin() {
        return this.fechaFin;
    }
    
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }




}


