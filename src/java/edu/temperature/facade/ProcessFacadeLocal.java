/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.temperature.facade;

import edu.temperature.entity.Process;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Camilo
 */
@Local
public interface ProcessFacadeLocal {

    void create(Process process);

    void edit(Process process);

    void remove(Process process);

    Process find(Object id);

    List<Process> findAll();

    List<Process> findRange(int[] range);

    int count();
    
}
