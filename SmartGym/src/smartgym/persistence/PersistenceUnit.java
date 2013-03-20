/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartgym.persistence;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Carlos
 */
public abstract class PersistenceUnit {
    
    private static EntityManagerFactory entityManagerFactory;
    
    public static void start(){
        PersistenceUnit.entityManagerFactory = Persistence.createEntityManagerFactory("SmartGymPU");
    }
    
    public static void close(){
        PersistenceUnit.entityManagerFactory.close();
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }
    
    
    
    
            
            
    
}
