/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Interface.ItEmpleado;
import POJO.Empleado;
import java.util.List;
import javafx.scene.shape.QuadCurve;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Julian
 */
public class DAOEmpleado implements ItEmpleado {

    @Override
    public List<Empleado> getAll(Session session) throws Exception {
        return session.createCriteria(Empleado.class).list();
    }

    @Override
    public Empleado getByCed(Session session, String ced) throws Exception {
        String hql = "select * from empleado where=:Ced";
        Query query = session.createQuery(hql);
        query.setParameter("ced", ced);
        return (Empleado) query.uniqueResult();
    }

    @Override
    public void insertEmpleado(Session session, Empleado emp) throws Exception {
        session.save(emp);
    }

}
