/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Interface.ItDepartamento;
import POJO.Departamento;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Julian
 */
public class DAODepartamento implements ItDepartamento{

    
    @Override
    public List<Departamento> getAll(Session session) throws Exception {
        return session.createCriteria(Departamento.class).list();
    }

    @Override
    public void insertDpto(Session session, Departamento dpto) throws Exception {
        session.save(dpto);
    }

    @Override
    public Departamento getByCod(Session session, String cod) throws Exception {
        int num = Integer.parseInt(cod);
        String hql = "from Departamento where codDpto = :cod";
        System.out.println(cod + "dpto");
        Query query = session.createQuery(hql);
        query.setParameter("cod", num);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
        
        return (Departamento) query.uniqueResult();
    }
    
    
}
