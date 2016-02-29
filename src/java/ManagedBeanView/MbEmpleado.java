/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBeanView;

import DAO.DAOEmpleado;
import HibernateUtil.HibernateUtil;
import POJO.Empleado;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Julian
 */
@ManagedBean
@ViewScoped
public class MbEmpleado {

    Session session;
    Transaction transaction;
    
    private Empleado emp;
    private List<Empleado> listaEmpleado;
    private String d;
    public MbEmpleado() {
    }

    public List<Empleado> getAll()
    {
        System.out.println("Entro al metodo");
        this.session = null;
        this.transaction = null;
        
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            DAOEmpleado daoEmpleado = new DAOEmpleado();
            this.transaction = this.session.beginTransaction();
            this.listaEmpleado = daoEmpleado.getAll(this.session);
            transaction.commit();
            return this.listaEmpleado;
            
        } catch (Exception e) {
            if (this.transaction != null) {
                this.transaction.rollback();
            }
            return null;
        }
        
    }

    public void insertarEmpl()
    {
        System.out.println("Entro al metodo");
        this.session = null;
        this.transaction = null;
        
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            DAOEmpleado daoEmpleado = new DAOEmpleado();
            this.transaction = this.session.beginTransaction();
            daoEmpleado.insertEmpleado(session, emp);
            transaction.commit();
            
        } catch (Exception e) {
            if (this.transaction != null) {
                this.transaction.rollback();
            }
        }finally{            
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info" + d, "PrimeFaces Rocks."));
        }
        
    }
    
    
    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }
    
    public Empleado getEmp() {
        return emp;
    }

    public void setEmp(Empleado emp) {
        this.emp = emp;
    }

    public List<Empleado> getListaEmpleado() {
        return listaEmpleado;
    }

    public void setListaEmpleado(List<Empleado> listaEmpleado) {
        this.listaEmpleado = listaEmpleado;
    }
    
    
    
}
