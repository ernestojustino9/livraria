/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livraria.dao.impl;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import livraria.dao.RoleDao;
import livraria.model.Role;
import livraria.util.ComboBoxList;

/**
 *
 * @author tecno-base
 */
public class Roledaoimpl implements RoleDao {

    @Override
    public void addRole(Role role, EntityManager em) {

        try {
            em.getTransaction().begin();
            em.persist(role);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public void updateRole(Role role, EntityManager em) {
        Role r = em.find(Role.class, role.getId());
        try {
            em.getTransaction().begin();
            r.setRoles(role.getRoles());
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public void deleteRole(Role role, EntityManager em) {
        Role r = em.find(Role.class, role.getId());
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
    public List<Role> seletRole(EntityManager em) {
        List<Role> role = em.createQuery("SELECT r FROM Role r", Role.class).getResultList();
        return role;
    }

    @Override
    public void comboBoxRole(EntityManager em) {
        this.setList(new ArrayList<ComboBoxList>());
        List<Role> roleList = em.createQuery("SELECT r FROM Role r ORDER BY r.roles ASC", Role.class).getResultList();
        for (Role r : roleList) {
            this.getList().add(new ComboBoxList(r.getId(), r.getRoles()));
        }
    }
    private ArrayList<ComboBoxList> list;

    public ArrayList<ComboBoxList> getList() {
        return list;
    }

    public void setList(ArrayList<ComboBoxList> list) {
        this.list = list;
    }

}
