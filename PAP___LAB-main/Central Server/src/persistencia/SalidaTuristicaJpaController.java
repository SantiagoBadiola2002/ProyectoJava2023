/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logica.SalidaTuristica;
import persistencia.exceptions.NonexistentEntityException;
import persistencia.exceptions.PreexistingEntityException;

/**
 *
 * @author natil
 */
public class SalidaTuristicaJpaController implements Serializable {

    public SalidaTuristicaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    public SalidaTuristicaJpaController() {
        emf = Persistence.createEntityManagerFactory("Lab1PU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(SalidaTuristica salidaTuristica) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(salidaTuristica);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findSalidaTuristica(salidaTuristica.getNombre()) != null) {
                throw new PreexistingEntityException("SalidaTuristica " + salidaTuristica + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(SalidaTuristica salidaTuristica) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            salidaTuristica = em.merge(salidaTuristica);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = salidaTuristica.getNombre();
                if (findSalidaTuristica(id) == null) {
                    throw new NonexistentEntityException("The salidaTuristica with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            SalidaTuristica salidaTuristica;
            try {
                salidaTuristica = em.getReference(SalidaTuristica.class, id);
                salidaTuristica.getNombre();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The salidaTuristica with id " + id + " no longer exists.", enfe);
            }
            em.remove(salidaTuristica);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<SalidaTuristica> findSalidaTuristicaEntities() {
        return findSalidaTuristicaEntities(true, -1, -1);
    }

    public List<SalidaTuristica> findSalidaTuristicaEntities(int maxResults, int firstResult) {
        return findSalidaTuristicaEntities(false, maxResults, firstResult);
    }

    private List<SalidaTuristica> findSalidaTuristicaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(SalidaTuristica.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public SalidaTuristica findSalidaTuristica(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(SalidaTuristica.class, id);
        } finally {
            em.close();
        }
    }

    public int getSalidaTuristicaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<SalidaTuristica> rt = cq.from(SalidaTuristica.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
//    
//    public List<String> findByActividad(String actividad) { 
//        EntityManager em = getEntityManager();
//        String query = "SELECT listaSalidaTuristica_NOMBRE FROM actividad_salidaturistica WHERE Actividad_NOMBRE LIKE '%"+actividad+"%'";
//	@SuppressWarnings("unchecked")
//	List<String> r = (List<String>) em.createNativeQuery(query).getResultList();
//        return r;
//    }
    
}
