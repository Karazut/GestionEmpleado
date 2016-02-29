package POJO;
// Generated 28-feb-2016 22:06:41 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Empleado generated by hbm2java
 */
public class Empleado  implements java.io.Serializable {


     private Integer codEmpleado;
     private Depatamento depatamento;
     private Empleado empleado;
     private String nomEmpleado;
     private String apeEmpleado;
     private String cedEmpleado;
     private String telEmpleado;
     private String dirEmpleado;
     private boolean esCoordinador;
     private Set coordinadordptos = new HashSet(0);
     private Set contratos = new HashSet(0);
     private Set empleados = new HashSet(0);
     private Set nominas = new HashSet(0);

    public Empleado() {
    }

	
    public Empleado(Depatamento depatamento, String nomEmpleado, String apeEmpleado, String cedEmpleado, String telEmpleado, String dirEmpleado, boolean esCoordinador) {
        this.depatamento = depatamento;
        this.nomEmpleado = nomEmpleado;
        this.apeEmpleado = apeEmpleado;
        this.cedEmpleado = cedEmpleado;
        this.telEmpleado = telEmpleado;
        this.dirEmpleado = dirEmpleado;
        this.esCoordinador = esCoordinador;
    }
    public Empleado(Depatamento depatamento, Empleado empleado, String nomEmpleado, String apeEmpleado, String cedEmpleado, String telEmpleado, String dirEmpleado, boolean esCoordinador, Set coordinadordptos, Set contratos, Set empleados, Set nominas) {
       this.depatamento = depatamento;
       this.empleado = empleado;
       this.nomEmpleado = nomEmpleado;
       this.apeEmpleado = apeEmpleado;
       this.cedEmpleado = cedEmpleado;
       this.telEmpleado = telEmpleado;
       this.dirEmpleado = dirEmpleado;
       this.esCoordinador = esCoordinador;
       this.coordinadordptos = coordinadordptos;
       this.contratos = contratos;
       this.empleados = empleados;
       this.nominas = nominas;
    }
   
    public Integer getCodEmpleado() {
        return this.codEmpleado;
    }
    
    public void setCodEmpleado(Integer codEmpleado) {
        this.codEmpleado = codEmpleado;
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
    public String getNomEmpleado() {
        return this.nomEmpleado;
    }
    
    public void setNomEmpleado(String nomEmpleado) {
        this.nomEmpleado = nomEmpleado;
    }
    public String getApeEmpleado() {
        return this.apeEmpleado;
    }
    
    public void setApeEmpleado(String apeEmpleado) {
        this.apeEmpleado = apeEmpleado;
    }
    public String getCedEmpleado() {
        return this.cedEmpleado;
    }
    
    public void setCedEmpleado(String cedEmpleado) {
        this.cedEmpleado = cedEmpleado;
    }
    public String getTelEmpleado() {
        return this.telEmpleado;
    }
    
    public void setTelEmpleado(String telEmpleado) {
        this.telEmpleado = telEmpleado;
    }
    public String getDirEmpleado() {
        return this.dirEmpleado;
    }
    
    public void setDirEmpleado(String dirEmpleado) {
        this.dirEmpleado = dirEmpleado;
    }
    public boolean isEsCoordinador() {
        return this.esCoordinador;
    }
    
    public void setEsCoordinador(boolean esCoordinador) {
        this.esCoordinador = esCoordinador;
    }
    public Set getCoordinadordptos() {
        return this.coordinadordptos;
    }
    
    public void setCoordinadordptos(Set coordinadordptos) {
        this.coordinadordptos = coordinadordptos;
    }
    public Set getContratos() {
        return this.contratos;
    }
    
    public void setContratos(Set contratos) {
        this.contratos = contratos;
    }
    public Set getEmpleados() {
        return this.empleados;
    }
    
    public void setEmpleados(Set empleados) {
        this.empleados = empleados;
    }
    public Set getNominas() {
        return this.nominas;
    }
    
    public void setNominas(Set nominas) {
        this.nominas = nominas;
    }




}


