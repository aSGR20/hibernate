package Tarea3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	
	public HibernateUtil(Object object){
		// SessionFactory. Generador de sesiones
    	StandardServiceRegistry sr = new StandardServiceRegistryBuilder().configure().build();
    	SessionFactory sf = new MetadataSources(sr).buildMetadata().buildSessionFactory();
    	
    	//Abrir sesión
    	Session session = sf.openSession();
    	
    	//Iniciar transacción
    	session.getTransaction().begin();
    	
    	//Guardar objetos en BBDD
    	session.save(object);
    	
    	//Commit transaction
    	session.getTransaction().commit();
    	
    	//Cierra sesión y SessionFactory
    	session.close();
    	sf.close();
	}
}
