package Tarea2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {

	private static File fichero = new File(".\\Alumnado_nuevo.txt");

	public static void main(String[] args) {
    	//M�todo para crear la tabla con los usuarios
    	try {
			crearTablaSuperusuarios(fichero);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
	}
	
	/**
	 * M�todo que pasa un fichero a variables, las guarda en un objeto <br>
	 * y ese objeto las suba una BBDD llamada bd_neptuno
	 * @param fichero
	 * @throws IOException
	 */
	public static void crearTablaSuperusuarios(File fichero) throws IOException {
		// SessionFactory. Generador de sesiones
    	StandardServiceRegistry sr = new StandardServiceRegistryBuilder().configure().build();
    	SessionFactory sf = new MetadataSources(sr).buildMetadata().buildSessionFactory();
    	
    	//Abrir sesi�n
    	Session session = sf.openSession();
    	
    	//Iniciar transacci�n
    	session.getTransaction().begin();
    	//Declara variables, lee el fichero y guarda el objeto
		String nombre, apell, linea, user;
		Object[]div;
		FileReader fr = new FileReader(fichero);
		BufferedReader br = new BufferedReader(fr);
		while((linea = br.readLine())!=null) {
			div = linea.split(", ");
			
			nombre = div[1].toString();
			System.out.println(nombre);
			apell = div[0].toString();
			user = "2DAM" + Character.toString(nombre.charAt(0)) + Character.toString(apell.charAt(0));
				
			Superusuarios usuarios = new Superusuarios(nombre, apell, user);
			session.save(usuarios);
		}
		
		//Commit transaction
    	session.getTransaction().commit();
    	
    	//Cierra sesi�n y SessionFactory
    	session.close();
    	sf.close();
	}
}
