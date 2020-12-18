package Tarea3;

public class Main {
	
	HibernateUtil hibernate;

	public static void main(String[] args) {
	 	Profesor profesor=new Profesor(7, "Sara", "Barrrera", "Salas");
	 	Set<CorreoElectronico> correosElectronicos=new HashSet<>();
	 	correosElectronicos.add(new CorreoElectronico(3, "sara@yahoo.com",profesor));
	 	correosElectronicos.add(new CorreoElectronico(2, "sara@hotmail.com",profesor));
	 	correosElectronicos.add(new CorreoElectronico(1, "sara@gmail.com",profesor));
	 	
	 	profesor.setCorreosElectronicos(correosElectronicos);
	 	
	 	HibernateUtil hibernate = new HibernateUtil(profesor);
	 	
	}
}
