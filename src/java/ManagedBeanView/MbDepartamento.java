/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBeanView;

import DAO.DAODepartamento;
import HibernateUtil.HibernateUtil;
import POJO.Departamento;
import java.io.Serializable;
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
public class MbDepartamento implements Serializable{

    private Session session;
    private Transaction transaction;
    
    private Departamento dpto;
    private List<Departamento> listaDpto;
    
    public MbDepartamento() {
        dpto = new Departamento();
    }

    public List<Departamento> getAllDpto()
    {
        this.session = null;
        this.transaction = null;
        
        try {
            this.session = HibernateUtil.getSessionFactory().openSession();
            DAODepartamento daoEmpleado = new DAODepartamento();
            this.transaction = this.session.beginTransaction();
            this.listaDpto = daoEmpleado.getAll(this.session);
            this.transaction.commit();
            return this.listaDpto;
            
        } catch (Exception e) {
            if (this.transaction != null) {
                this.transaction.rollback();
            }
            return null;
        } finally{
            session.close();
        }
    }
    
    public void insertarDpto()
    {
        System.out.println("Entro al metodo");
        this.session = null;
        this.transaction = null;
        
        try {
            this.session = HibernateUtil.getSessionFactory().openSession();
            DAODepartamento daoDpto = new DAODepartamento();
            this.transaction = this.session.beginTransaction();
            daoDpto.insertDpto(session, dpto);
            this.transaction.commit();
            
        } catch (Exception e) {
            if (this.transaction != null) {
                this.transaction.rollback();
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info" , "PrimeFaces Rocks."));
       
            }
        }finally{           
            session.close();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Se añadio un nuevo departamento" , "PrimeFaces Rocks."));
        }
        
    }
    
    public Departamento getDpto() {
        return dpto;
    }

    public void setDpto(Departamento dpto) {
        this.dpto = dpto;
    }

    public List<Departamento> getListaDpto() {
        return listaDpto;
    }

    public void setListaDpto(List<Departamento> listaDpto) {
        this.listaDpto = listaDpto;
    }
    
    
    
}
