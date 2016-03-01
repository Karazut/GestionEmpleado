/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Interface.ItCoordinadorDpto;
import POJO.Coordinadordpto;
import POJO.Empleado;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Prueba
 */
public class DAOCoordDpto implements ItCoordinadorDpto{

    @Override
    public boolean insert(Session session, int coordinador, int dpto) throws Exception {
        String hql = "insert into coordinadordpto (coordinador, dpto) values (?,?)";        
        Query query = session.createQuery(hql);
        query.setParameter(0, coordinador);
        query.setParameter("dpto", dpto);
        if (query.executeUpdate()>1) {
            return true;
        }
         return false;      
    }
    
}
