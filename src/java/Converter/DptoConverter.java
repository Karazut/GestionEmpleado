/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converter;

import DAO.DAODepartamento;
import HibernateUtil.HibernateUtil;
import ManagedBeanView.MbDepartamento;
import POJO.Depatamento;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedProperty;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Prueba
 */
@FacesConverter("dptoConverter")
public class DptoConverter implements Converter{

    private Session session;
    private Transaction ts;
    
    @ManagedProperty(value="#{mbDepartamento}")
    private MbDepartamento mbDepartamento;

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String cod) {

        try {
           System.out.println("metodo getASoBJECT DPTO");
            List<Depatamento> listDpto = mbDepartamento.getAllDpto();
            System.out.println("lista sptO" + listDpto.size());
            for (Depatamento dpto : listDpto) {
                if (dpto.getCodDpto().toString().equals(cod)) {
                    System.out.println("Entro al ciclo for If converterDPto");
                    return dpto;
                }
            }
            System.out.println("No entro al ciclo forIf");
            return null;
        } catch (Exception e) {

            session.close();
            return null;
        }
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        Depatamento dpto = (Depatamento) o;

        return dpto.getCodDpto().toString();
    }

}
