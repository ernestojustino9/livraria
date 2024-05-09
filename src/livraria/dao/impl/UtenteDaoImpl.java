package livraria.dao.impl;

import java.util.List;
import javax.persistence.EntityManager;
import livraria.dao.UtenteDao;
import livraria.model.Utente;

public class UtenteDaoImpl implements UtenteDao {

    @Override
    public void addUtente(Utente utente, EntityManager em) {
        try {
            em.getTransaction().begin();
            em.persist(utente);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public void updateUtente(Utente utente, EntityManager em) {
        Utente u = em.find(Utente.class, utente.getId());
        try {
            em.getTransaction().begin();
            u.setCodUtente(utente.getCodUtente());
            u.setNome(utente.getNome());
            u.setBi(utente.getBi());
            u.setEndereco(utente.getEndereco());
            u.setTelefone(utente.getTelefone());
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public void deleteUtente(Utente utente, EntityManager em) {
         Utente r = em.find(Utente.class, utente.getId());
        try {
            em.getTransaction().begin();
            em.remove(r);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public List<Utente> seletUtente(EntityManager em) {
        List<Utente> utente = em.createQuery("SELECT u FROM Utente u", Utente.class).getResultList();
        return utente;
    }

}
