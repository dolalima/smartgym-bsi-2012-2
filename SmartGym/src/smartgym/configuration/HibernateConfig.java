/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartgym.configuration;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author Carlos
 */
public abstract class HibernateConfig {

    public static boolean CreatePersistenceTables() {

        try {
            AnnotationConfiguration config = new AnnotationConfiguration();
            config.configure("./META-INF/hibernate.cfg.xml");
            new SchemaExport(config).create(true, true);          

        } catch(Exception e)  {
            return false;
        }
        
        return true;


    }
}
