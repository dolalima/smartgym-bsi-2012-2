/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartgym.models.entities;

import smartgym.models.entities.exceptions.PaymentDayInvalidException;
import javax.persistence.Entity;


/**
 *
 * @author Carlos
 */
@Entity
public class Client extends Person {
    
        
    private int paymentDay;
    private boolean regular;
    

    public int getPaymentDay() {
        return paymentDay;
    }

    public void setPaymentDay(int paymentDay) throws PaymentDayInvalidException {
        if(paymentDay<1 && paymentDay >31){
            throw new PaymentDayInvalidException("Data de pagamento invalida");
        }else{
            this.paymentDay = paymentDay;
        }
        
    }

    public boolean isRegular() {
        return regular;
    }

    public void setRegular(boolean regular) {
        this.regular = regular;
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
        if (!(object instanceof Client)) {
            return false;
        }
        Client other = (Client) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smartgym.models.entities.Client[ id=" + this.getId() + " ]";
    }
    
}
