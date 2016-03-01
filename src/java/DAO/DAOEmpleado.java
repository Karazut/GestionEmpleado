/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Interface.ItEmpleado;
import POJO.Empleado;
import java.util.List;
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
    public void insertEmpleado(Session session, Empleado emp) throws Exception {
        session.save(emp);
    }

    @Override
    public Empleado getByCod(Session session, String cod) throws Exception {
        int num = Integer.parseInt(cod);
        String hql = "from Empleado where codEmpleado = :cod";
        System.out.println(cod+"emp");
        Query query = session.createQuery(hql);
        query.setParameter("cod", num);
        
        return (Empleado) query.uniqueResult();
    }

    @Override
    public void deleteEmpelado(Session session, Empleado emp) throws Exception {
        session.delete(emp);
    }

}
