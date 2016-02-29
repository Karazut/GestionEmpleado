/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBeanView;

import DAO.DAODepartamento;
import HibernateUtil.HibernateUtil;
import POJO.Depatamento;
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
public class MbDepartamento {

    private Session session;
    private Transaction transaction;
    
    private Depatamento dpto;
    private List<Depatamento> listaDpto;
    
    public MbDepartamento() {
    }

    public List<Depatamento> getAllDpto()
    {
        this.session = null;
        this.transaction = null;
        
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            DAODepartamento daoEmpleado = new DAODepartamento();
            this.transaction = this.session.beginTransaction();
            this.listaDpto = daoEmpleado.getAll(this.session);
            transaction.commit();
            return this.listaDpto;
            
        } catch (Exception e) {
            if (this.transaction != null) {
                this.transaction.rollback();
            }
            return null;
        }
    }
    
     public void insertarDpto()
    {
        System.out.println("Entro al metodo");
        this.session = null;
        this.transaction = null;
        
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            DAODepartamento daoDpto = new DAODepartamento();
            this.transaction = this.session.beginTransaction();
            daoDpto.insertDpto(session, dpto);
            transaction.commit();
            
        } catch (Exception e) {
            if (this.transaction != null) {
                this.transaction.rollback();
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info" , "PrimeFaces Rocks."));
       
            }
        }finally{            
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info" , "PrimeFaces Rocks."));
        }
        
    }
    
    public Depatamento getDpto() {
        return dpto;
    }

    public void setDpto(Depatamento dpto) {
        this.dpto = dpto;
    }

    public List<Depatamento> getListaDpto() {
        return listaDpto;
    }

    public void setListaDpto(List<Depatamento> listaDpto) {
        this.listaDpto = listaDpto;
    }
    
    
    
}
