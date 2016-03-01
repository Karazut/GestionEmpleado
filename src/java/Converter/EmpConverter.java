/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converter;

import DAO.DAOEmpleado;
import HibernateUtil.HibernateUtil;
import ManagedBeanView.MbEmpleado;
import POJO.Empleado;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedProperty;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Julian
 */
@FacesConverter("empConverter")
public class EmpConverter implements Converter {

   
    @ManagedProperty(value="#{mbEmpleado}")
    private MbEmpleado mbEmpl;
    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String ced) {
       
        try {
            System.out.println("metodo getASoBJECT EMP");
            List<Empleado> listEmp = mbEmpl.getAll();
            System.out.println("empleado lista" + listEmp.size());
            for (Empleado emp : listEmp) {
                if (emp.getCedEmpleado().equals(ced)) {
                    System.out.println("Ingreso al ciclo for if empConverter");
                    return emp;                   
                }
            }

            return null;
        } catch (Exception e) {

            return null;
        }
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object value) {
        Empleado empleado = (Empleado) value;
        return empleado.getCedEmpleado();
    }

}
