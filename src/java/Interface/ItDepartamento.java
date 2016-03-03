/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import POJO.Departamento;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Julian
 */
public interface ItDepartamento {
    
    public List<Departamento> getAll(Session session) throws Exception;
    public Departamento getByCod(Session session, String cod) throws Exception;
    public void insertDpto(Session session, Departamento dpto) throws Exception;
}
