package livraria.dao;

import java.util.List;
import javax.persistence.EntityManager;
import livraria.model.Usuario;


public interface UsuarioDao {

    public void addUsuario(Usuario usuario, EntityManager em);

    public void updateUsuario(Usuario usuario, EntityManager em);

    public void deleteUsuario(Usuario usuario, EntityManager em);

    public List<Usuario> seletUsuario(EntityManager em);
}
