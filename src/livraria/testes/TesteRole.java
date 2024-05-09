package livraria.testes;

import livraria.config.HibernateConfig;
import livraria.dao.impl.Roledaoimpl;
import livraria.model.Role;

public class TesteRole {

    public static void main(String[] args) {
        HibernateConfig hc = new HibernateConfig();

        Role role = new Role();
//        role.setRoles("USER");

//        
        Roledaoimpl roledaoimpl = new Roledaoimpl();
        roledaoimpl.addRole(role, hc.getEntityManager());
        System.out.println("Utente salvo" + role.getRoles());

        for (Role r : roledaoimpl.seletRole(hc.getEntityManager())) {
            System.out.println("Role" + r.getRoles());
        }
        hc.closeConnection();

    }
}
