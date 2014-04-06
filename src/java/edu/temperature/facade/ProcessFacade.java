/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.temperature.facade;

import edu.temperature.entity.Process;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Camilo
 */
@Stateless
public class ProcessFacade extends AbstractFacade<Process> implements ProcessFacadeLocal {
    @PersistenceContext(unitName = "PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProcessFacade() {
        super(Process.class);
    }
    
}
