package Tarea3;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

	private static SessionFactory sessionFactory;

	static {
		try {
			StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();
			sessionFactory = new MetadataSources(ssr).buildMetadata().buildSessionFactory();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	public static SessionFactory getSessionFactory() {

		return sessionFactory;
	}
	
	public static void closeFactory() {
		sessionFactory.close();
	}
}