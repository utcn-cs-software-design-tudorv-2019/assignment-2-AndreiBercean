package repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import entity.Enrolment;

public class EnrolmentRepository{
	public void delete(Enrolment u)
	{
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        session.beginTransaction();
        session.delete(u);
        session.getTransaction().commit();
        
        session.close();
	}
	
	public void create(Enrolment u)
	{
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        session.beginTransaction();
        session.save(u);
        session.getTransaction().commit();
        
        session.close();
	}
	
	public void update(Enrolment u)
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
	
	public List<Enrolment> select()
	{
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        List<Enrolment> rez = session.createCriteria(Enrolment.class).list();
        session.close();
        return rez;
	}
}
