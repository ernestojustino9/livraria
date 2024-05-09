package livraria.dao;

import java.util.List;
import javax.persistence.EntityManager;
import livraria.model.Utente;

public interface UtenteDao {

    public void addUtente(Utente utente, EntityManager em);

    public void updateUtente(Utente utente, EntityManager em);

    public void deleteUtente(Utente utente, EntityManager em);

    public List<Utente> seletUtente(EntityManager em);
}
