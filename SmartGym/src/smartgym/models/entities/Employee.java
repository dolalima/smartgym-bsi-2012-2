/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartgym.models.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import smartgym.utilities.Encrypter;

/**
 *
 * @author Carlos
 */
@Entity
public class Employee extends Person {    
    
    private String password;
    @OneToMany(mappedBy = "employee")
    private List<Activity> activitys;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = Encrypter.md5(password);
    }

    public List<Activity> getActivitys() {
        return activitys;
    }

    public void setActivitys(List<Activity> activitys) {
        this.activitys = activitys;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (this.getId() != null ? this.getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smartgym.models.entities.Employee[ id=" + this.getId() + " ]";
    }
    
}
