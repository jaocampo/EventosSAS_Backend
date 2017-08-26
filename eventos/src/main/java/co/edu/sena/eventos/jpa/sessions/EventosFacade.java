/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.eventos.jpa.sessions;

import co.edu.sena.eventos.jpa.entities.Eventos;
import co.edu.sena.eventos.jpa.entities.Eventos_;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author adsi1261718
 */
@Stateless
public class EventosFacade extends AbstractFacade<Eventos> {

    @PersistenceContext(unitName = "co.edu.sena_eventos_war_1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EventosFacade() {
        super(Eventos.class);
    }
    
    public Eventos findByCodigo(String codigo){
        CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Eventos> cq = cb.createQuery(Eventos.class);
        Root<Eventos> tercero = cq.from(Eventos.class);
        
        cq.where(cb.equal(tercero.get(Eventos_.codigo), codigo));
        TypedQuery<Eventos> tq = getEntityManager().createQuery(cq);
        
        try {
            return (Eventos) tq.getSingleResult();
        } catch (NonUniqueResultException ex) {
            throw ex;
        } catch(NoResultException e){
            return null;
        }
    }
}
