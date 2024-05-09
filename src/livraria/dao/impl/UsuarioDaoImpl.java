package livraria.dao.impl;

import java.util.List;
import javax.persistence.EntityManager;
import livraria.dao.UsuarioDao;
import livraria.model.Usuario;

/**
 *
 * @author tecno-base
 */
public class UsuarioDaoImpl implements UsuarioDao {

    @Override
    public void addUsuario(Usuario usuario, EntityManager em) {

        try {
            em.getTransaction().begin();
            em.persist(usuario);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public void updateUsuario(Usuario usuario, EntityManager em) {
        Usuario u = em.find(Usuario.class, usuario.getId());
        try {
            em.getTransaction().begin();
            u.setNome(usuario.getNome());
            u.setEmail(usuario.getEmail());
            u.setPassword(usuario.getPassword());
            u.setRole(usuario.getRole());
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public void deleteUsuario(Usuario usuario, EntityManager em) {
        Usuario r = em.find(Usuario.class, usuario.getId());
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
    public List<Usuario> seletUsuario(EntityManager em) {
        List<Usuario> usuario = em.createQuery("SELECT u FROM Usuario u", Usuario.class).getResultList();
        return usuario;
    }
}
