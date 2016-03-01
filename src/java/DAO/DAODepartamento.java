/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Interface.ItDepartamento;
import POJO.Depatamento;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Julian
 */
public class DAODepartamento implements ItDepartamento{

    
    @Override
    public List<Depatamento> getAll(Session session) throws Exception {
        return session.createCriteria(Depatamento.class).list();
    }

    @Override
    public void insertDpto(Session session, Depatamento dpto) throws Exception {
        session.save(dpto);
    }

    @Override
    public Depatamento getByCod(Session session, String cod) throws Exception {
        int num = Integer.parseInt(cod);
        String hql = "from Depatamento where codDpto = :cod";
        System.out.println(cod + "dpto");
        Query query = session.createQuery(hql);
        query.setParameter("cod", num);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
        
        return (Depatamento) query.uniqueResult();
    }
    
    
}
