package Tarea2;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
public class Superusuarios {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUser;
	
	@Column
	private String Nombre;
	
	@Column
	private String Apellidos;
	
	@Column(length = 6)
	private String User;	

	public Superusuarios() {
		super();
	}

	
	public Superusuarios(String nombre, String apellidos, String user) {
		super();
		Nombre = nombre;
		Apellidos = apellidos;
		User = user;
	}

	
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	
	public String getUser() {
		return User;
	}
	public void setUser(String user) {
		User = user;
	}
}
