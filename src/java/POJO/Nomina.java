package POJO;
// Generated 01-mar-2016 8:17:46 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Nomina generated by hbm2java
 */
public class Nomina  implements java.io.Serializable {


     private Integer codNomina;
     private Categoriaprofesional categoriaprofesional;
     private Empleado empleado;
     private Date fechaNomina;

    public Nomina() {
    }

    public Nomina(Categoriaprofesional categoriaprofesional, Empleado empleado, Date fechaNomina) {
       this.categoriaprofesional = categoriaprofesional;
       this.empleado = empleado;
       this.fechaNomina = fechaNomina;
    }
   
    public Integer getCodNomina() {
        return this.codNomina;
    }
    
    public void setCodNomina(Integer codNomina) {
        this.codNomina = codNomina;
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
    public Date getFechaNomina() {
        return this.fechaNomina;
    }
    
    public void setFechaNomina(Date fechaNomina) {
        this.fechaNomina = fechaNomina;
    }




}


