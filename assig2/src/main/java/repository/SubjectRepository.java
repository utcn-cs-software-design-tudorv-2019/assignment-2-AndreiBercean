package repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import entity.Subject;

public class SubjectRepository {
	public void delete(Subject u)
	{
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        session.beginTransaction();
        session.delete(u);
        session.getTransaction().commit();
        
        session.close();
	}
	
	public void create(Subject u)
	{
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        session.beginTransaction();
        session.save(u);
        session.getTransaction().commit();
        
        session.close();
	}
	
	public void update(Subject u)
	{
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
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
	
	public List<Subject> select()
	{
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        List<Subject> rez = session.createCriteria(Subject.class).list();
        session.close();
        return rez;
	}
}
