/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import POJO.Coordinadordpto;
import org.hibernate.Session;

/**
 *
 * @author Julian
 */
public interface ItCoordinadorDpto {
    public boolean insert(Session session, int coordinador, int dpto) throws Exception;
}
