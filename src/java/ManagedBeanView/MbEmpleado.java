/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBeanView;

import DAO.DAODepartamento;
import DAO.DAOEmpleado;
import HibernateUtil.HibernateUtil;
import POJO.Depatamento;
import POJO.Empleado;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Julian
 */
@ManagedBean
@ViewScoped
public class MbEmpleado implements Serializable {

    Session session;
    Transaction transaction;
    private DAOEmpleado daoEmpleado;
    private Empleado emp;
    private Depatamento dpto;
    private List<Empleado> listaEmpleado;//Variable para el select one menu de registro
    private String codDpto, codResp;//Variable para el select one menu de registro

    public MbEmpleado() {
        emp = new Empleado();

    }

    public void prueba() {
        System.out.println("valor select one menu" + dpto);
    }

    public List<Empleado> getAll() {
        System.out.println("Entro al metodo getAllEmpleado");
        this.session = null;
        this.transaction = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();
            this.listaEmpleado = this.daoEmpleado.getAll(this.session);
            transaction.commit();
            System.out.println("termino el metodo getAllEmpleado");
            return this.listaEmpleado;

        } catch (Exception e) {
            if (this.transaction != null) {
                this.transaction.rollback();
            }
            return null;
        } finally {

        }
    }

    public void insertarEmpl() {
        
        this.session = null;
        this.transaction = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            DAOEmpleado daoEmpleado = new DAOEmpleado();
            DAODepartamento daoDpto = new DAODepartamento();

            this.emp.setEmpleado(daoEmpleado.getByCod(this.session, this.codDpto));
            this.emp.setDepatamento(daoDpto.getByCod(this.session, this.codDpto));
            this.transaction = this.session.beginTransaction();

            daoEmpleado.insertEmpleado(session, emp);
            transaction.commit();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Se realizo el registro", "PrimeFaces Rocks."));

        } catch (Exception e) {
            if (this.transaction != null) {
                this.transaction.rollback();
            }
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "No se realizo el registro", "PrimeFaces Rocks."));
            session.close();
        } finally {
            session.close();
        }
    }

    public void deleteEmpl(String cod) {
        this.session = null;
        this.transaction = null;
        
        try {
            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = session.beginTransaction();
            this.emp = this.daoEmpleado.getByCod(session, cod);
            
            daoEmpleado.deleteEmpelado(this.session, this.emp);
            this.transaction.commit();
            
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Se elimino el empleado", "PrimeFaces Rocks."));

        } catch (Exception e) {
        } finally{
            session.close();
        }
    }

    public String getCodDpto() {
        return codDpto;
    }

    public void setCodDpto(String codDpto) {
        this.codDpto = codDpto;
    }

    public String getCodResp() {
        return codResp;
    }

    public void setCodResp(String codResp) {
        this.codResp = codResp;
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

    public Depatamento getDpto() {
        return dpto;
    }

    public void setDpto(Depatamento dpto) {
        this.dpto = dpto;
    }

}
