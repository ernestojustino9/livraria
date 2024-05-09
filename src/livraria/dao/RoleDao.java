package livraria.dao;

import java.util.List;
import javax.persistence.EntityManager;
import livraria.model.Role;

public interface RoleDao {

    public void addRole(Role role, EntityManager em);

    public void updateRole(Role role, EntityManager em);

    public void deleteRole(Role role, EntityManager em);

    public List<Role> seletRole(EntityManager em);

    public void comboBoxRole(EntityManager em);

}
