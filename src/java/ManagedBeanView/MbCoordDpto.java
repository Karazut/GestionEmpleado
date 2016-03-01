/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBeanView;

import DAO.DAOCoordDpto;
import HibernateUtil.HibernateUtil;
import POJO.Coordinadordpto;
import POJO.Depatamento;
import POJO.Empleado;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
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
    private List<Depatamento> dpto;
  
    @ManagedProperty(value = "#{mbEmpleado}")
    private MbEmpleado mbEmpleado;
    @ManagedProperty(value = "#{mbDepartamento}")
    private MbDepartamento mbDpto;
    
    private int coord, dto;
    
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
        this.emp = mbEmpleado.getAll();
        this.dpto = mbDpto.getAllDpto();
        System.out.println(emp.size());
        
    }
    
    public void prueba (){
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, coord + "" + dto , "PrimeFaces Rocks."));
        System.out.println(dto);
    }
    
    public void insertCoord(){
        System.out.println("Ingreso a insertCoord");
        this.session = null;
        this.transaction = null;
        System.out.println(dto + "<< dpto - emp >>"+ coord);
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            DAO.DAOCoordDpto daocCordDpto = new DAOCoordDpto();
            this.transaction = this.session.beginTransaction();
            if (daocCordDpto.insert(session, coord, dto)) {
                System.out.println("Registro existoso");   
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Registro exitoso" , "PrimeFaces Rocks."));
       
            }

            this.transaction.commit();
       } catch (Exception e) {
            if (this.transaction != null) {
                this.transaction.rollback();                
            }
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info" , "PrimeFaces Rocks."));
       
        }finally{      
            session.close();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Se añadio un nuevo departamento" , "PrimeFaces Rocks."));
        }
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

    public List<Depatamento> getDpto() {
        return dpto;
    }

    public void setDpto(List<Depatamento> dpto) {
        this.dpto = dpto;
    }

    public int getCoord() {
        return coord;
    }

    public void setCoord(int coord) {
        this.coord = coord;
    }

    public int getDto() {
        return dto;
    }

    public void setDto(int dto) {
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
