package repository;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import entity.Users;

public class UsersRepository {
	
	public void delete(Users u)
	{
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        session.beginTransaction();
        session.delete(u);
        session.getTransaction().commit();
        
        session.close();
	}
	
	public void create(Users u)
	{
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        session.beginTransaction();
        session.save(u);
        session.getTransaction().commit();
        
        session.close();
	}
	
	public void update(Users u)
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
	
	public List<Users> select()
	{
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        List<Users> rez = session.createCriteria(Users.class).list();
        session.close();
        return rez;
	}
}
