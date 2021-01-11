package Tarea3;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

public class Main {
	public static void main(String[] args) {
		HibernateUtil hibernate;
		try {
			hibernate = new HibernateUtil();
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.getTransaction().begin();
			
			Profesor profesor = new Profesor("Antonio", "Pérez", "Navarro");
			
			Set<CorreoElectronico> correosElectronicos = new HashSet<CorreoElectronico>();
			correosElectronicos.add(new CorreoElectronico("antonio@outlook.com", profesor));
			correosElectronicos.add(new CorreoElectronico("antonio@gmail.com", profesor));
			
			profesor.setCorreosElectronicos(correosElectronicos);
			
			session.save(profesor);
			session.getTransaction().commit();
			session.close();
			hibernate.closeFactory();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
