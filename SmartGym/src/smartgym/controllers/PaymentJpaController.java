/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartgym.controllers;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import smartgym.controllers.exceptions.NonexistentEntityException;
import smartgym.models.entities.Payment;

/**
 *
 * @author Carlos
 */
public class PaymentJpaController implements Serializable {

    public PaymentJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Payment payment) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(payment);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Payment payment) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            payment = em.merge(payment);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = payment.getId();
                if (findPayment(id) == null) {
                    throw new NonexistentEntityException("The payment with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Payment payment;
            try {
                payment = em.getReference(Payment.class, id);
                payment.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The payment with id " + id + " no longer exists.", enfe);
            }
            em.remove(payment);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Payment> findPaymentEntities() {
        return findPaymentEntities(true, -1, -1);
    }

    public List<Payment> findPaymentEntities(int maxResults, int firstResult) {
        return findPaymentEntities(false, maxResults, firstResult);
    }

    private List<Payment> findPaymentEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            Query q = em.createQuery("select object(o) from Payment as o");
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Payment findPayment(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Payment.class, id);
        } finally {
            em.close();
        }
    }

    public int getPaymentCount() {
        EntityManager em = getEntityManager();
        try {
            Query q = em.createQuery("select count(o) from Payment as o");
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
