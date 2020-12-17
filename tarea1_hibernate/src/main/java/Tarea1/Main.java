package Tarea1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {

	public static void main(String[] args) {
		// SessionFactory. Generador de sesiones
    	StandardServiceRegistry sr = new StandardServiceRegistryBuilder().configure().build();
    	SessionFactory sf = new MetadataSources(sr).buildMetadata().buildSessionFactory();
    	
    	//Abrir sesión
    	Session session = sf.openSession();
    	
    	//Iniciar transacción
    	session.getTransaction().begin();
    	
    	//Creación de objetos
    	Alumno alumno1 = new Alumno("Antonio", "Ortega", 44);
    	Alumno alumno2 = new Alumno("Nacho", "Ignacio", 22);
    	
    	Matricula matricula1 = new Matricula("2 dam", alumno1);
    	Matricula matricula2 = new Matricula("1 dam", alumno2);
    	
    	//Guardar objetos en BBDD
    	session.save(alumno1);
    	session.save(alumno2);
    	session.save(matricula1);
    	session.save(matricula2);
    	
    	//Commit transaction
    	session.getTransaction().commit();
    	
    	//Cierra sesión y SessionFactory
    	session.close();
    	sf.close();
	}
}
