/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import POJO.Depatamento;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Julian
 */
public interface ItDepartamento {
    
    public List<Depatamento> getAll(Session session) throws Exception;
}
