package za.ac.tut.entities;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class StudentFacade implements StudentFacadeLocal {

    @PersistenceContext(unitName = "StudentPU")
    private EntityManager em;

    @Override
    public void create(Student student) {
        em.persist(student);
    }

    @Override
    public void remove(Student student) {
        em.remove(em.merge(student));
    }

    @Override
    public Student find(Object id) {
        return em.find(Student.class, id);
    }

    @Override
    public java.util.List<Student> findAll() {
        return em.createQuery("SELECT s FROM Student s", Student.class).getResultList();
    }

    @Override
    public int count() {
        return ((Long)em.createQuery("SELECT COUNT(s) FROM Student s").getSingleResult()).intValue();
    }

    @Override
    public void edit(Student student) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Student> findRange(int[] range) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
