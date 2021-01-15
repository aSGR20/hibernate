package Tarea5;


import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {
	public static void main(String[] args) {
		
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			
			Query query = session.getNamedQuery("mostrarProfesores");
			List<Profesor> profesores = query.list();
			for (Profesor profesor : profesores) {
				System.out.println(profesor.toString());
			}
			
			tx.commit();
			sessionFactory.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
