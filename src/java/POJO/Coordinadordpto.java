package POJO;
// Generated 01-mar-2016 8:17:46 by Hibernate Tools 4.3.1



/**
 * Coordinadordpto generated by hbm2java
 */
public class Coordinadordpto  implements java.io.Serializable {


     private Integer codigo;
     private Depatamento depatamento;
     private Empleado empleado;

    public Coordinadordpto() {
    }

    public Coordinadordpto(Depatamento depatamento, Empleado empleado) {
       this.depatamento = depatamento;
       this.empleado = empleado;
    }
   
    public Integer getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public Depatamento getDepatamento() {
        return this.depatamento;
    }
    
    public void setDepatamento(Depatamento depatamento) {
        this.depatamento = depatamento;
    }
    public Empleado getEmpleado() {
        return this.empleado;
    }
    
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }




}

