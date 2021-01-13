package TareaNoEntregable;

import java.io.Serializable;

public class Profesor implements Serializable  {

	private int Id;
	private String Nombre;
	private String Apellido1;
	private String Apellido2;


     public Profesor(){
     }

     public Profesor(String Nombre, String Apellido1, String Apellido2) {
         this.Nombre = Nombre;
         this.Apellido1 = Apellido1;
         this.Apellido2 = Apellido2;
     }
     
     public int getId() {
		return Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}

	public String getApellido1() {
		return Apellido1;
	}

	public void setApellido1(String Apellido1) {
		this.Apellido1 = Apellido1;
	}

	public String getApellido2() {
		return Apellido2;
	}

	public void setApellido2(String Apellido2) {
		this.Apellido2 = Apellido2;
	}
	
	@Override
	public String toString() {
		return Id + "\t" + Nombre + " " + Apellido1 + " " + Apellido2;
	}
 }