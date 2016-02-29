/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import POJO.Empleado;
import java.util.List;
import org.hibernate.Session;


/**
 *
 * @author Julian
 */
public interface ItEmpleado {
    public List<Empleado> getAll(Session session) throws Exception;
    public Empleado getByCed(Session session, String ced) throws Exception;
    public void insertEmpleado(Session session, Empleado emp) throws Exception;
}
