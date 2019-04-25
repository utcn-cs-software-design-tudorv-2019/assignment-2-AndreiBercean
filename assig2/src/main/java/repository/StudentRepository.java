package repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import entity.Student;

public class StudentRepository {
	SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
	
	public void delete(Student u)
	{
		
        Session session = sessionFactory.openSession();
        
        session.beginTransaction();
        session.delete(u);
        session.getTransaction().commit();
        
        session.close();
	}
	
	public void create(Student u)
	{
        Session session = sessionFactory.openSession();
        
        session.beginTransaction();
        session.save(u);
        session.getTransaction().commit();
        
        session.close();
	}
	
	public void update(Student u)
	{
        Session session = sessionFactory.openSession();
        
        session.beginTransaction();
        session.saveOrUpdate(u);
        session.getTransaction().commit();
        
        session.close();
	}
	
	/*public void select()
	{
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        session.beginTransaction();
        session.delete(u);
        session.getTransaction().commit();
        
        session.close();
	}*/
	
	public List<Student> select()
	{
        Session session = sessionFactory.openSession();
        List<Student> rez = session.createCriteria(Student.class).list();
        session.close();
        return rez;
	}
}
