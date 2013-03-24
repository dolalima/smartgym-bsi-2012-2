/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartgym.models.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Carlos
 */
@Entity
public class Payment implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date paymentedDay;
    
    @Column(nullable=false)    
    private double paymentValue;
    
    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date maturity;
    
    @ManyToOne
    @JoinColumn(name="client",nullable = false)
    private Client client; 
    
    @ManyToOne
    @JoinColumn(name="employee")    
    private Employee employee;
    
    @Column(nullable = false)
    private boolean paid =false;
    
    @Column(nullable = false)
    private boolean valid=false;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getPaymentedDay() {
        return paymentedDay;
    }

    public void setPaymentedDay(Date paymentedDay) {
        this.paymentedDay = paymentedDay;
    }

    public double getPaymentValue() {
        return paymentValue;
    }

    public void setPaymentValue(double paymentValue) {
        this.paymentValue = paymentValue;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    
    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public Date getMaturity() {
        return maturity;
    }

    public void setMaturity(Date maturity) {
        this.maturity = maturity;
    }    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Payment)) {
            return false;
        }
        Payment other = (Payment) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smartgym.models.entities.Payment[ id=" + id + " ]";
    }
    
}
