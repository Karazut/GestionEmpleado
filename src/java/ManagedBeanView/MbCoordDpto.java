/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBeanView;

import DAO.DAOCoordDpto;
import HibernateUtil.HibernateUtil;
import POJO.Coordinadordpto;
import POJO.Departamento;
import POJO.Empleado;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Prueba
 */
@ManagedBean
@ViewScoped
public class MbCoordDpto implements Serializable{

    private Session session;
    private Transaction transaction;
    
    private List<Empleado> emp;
    private List<Departamento> dpto;
  
    @ManagedProperty(value = "#{mbEmpleado}")
    private MbEmpleado mbEmpleado;
    @ManagedProperty(value = "#{mbDepartamento}")
    private MbDepartamento mbDpto;
    
    private String coord, dto;
    
    private Coordinadordpto coordDpto;
    /**
     * Creates a new instance of MbCoordDpto
     */
    public MbCoordDpto() {
        
    }
    
    @PostConstruct
    public void init()
    {
        coordDpto = new Coordinadordpto();
        this.emp = mbEmpleado.getAllEmpleado();
        this.dpto = mbDpto.getAllDpto();
        System.out.println(emp.size());
        
    }
    
    public void asignar(){
        
    }    
    
    public Coordinadordpto getCoordDpto() {
        return coordDpto;
    }

    public void setCoordDpto(Coordinadordpto coordDpto) {
        this.coordDpto = coordDpto;
    }

    public List<Empleado> getEmp() {
        return emp;
    }

    public void setEmp(List<Empleado> emp) {
        this.emp = emp;
    }

    public List<Departamento> getDpto() {
        return dpto;
    }

    public void setDpto(List<Departamento> dpto) {
        this.dpto = dpto;
    }

    public String getCoord() {
        return coord;
    }

    public void setCoord(String coord) {
        this.coord = coord;
    }

    public String getDto() {
        return dto;
    }

    public void setDto(String dto) {
        this.dto = dto;
    }

    public MbEmpleado getMbEmpleado() {
        return mbEmpleado;
    }

    public void setMbEmpleado(MbEmpleado mbEmpleado) {
        this.mbEmpleado = mbEmpleado;
    }

    public MbDepartamento getMbDpto() {
        return mbDpto;
    }

    public void setMbDpto(MbDepartamento mbDpto) {
        this.mbDpto = mbDpto;
    }
            
    
}
