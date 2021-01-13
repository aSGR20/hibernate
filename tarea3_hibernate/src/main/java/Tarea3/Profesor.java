package Tarea3;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="Profesor")
public class Profesor implements Serializable  {

    @Id
    @Column(name="Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="Nombre")
     private String nombre;

     @Column(name="Apellido1")
     private String apellido1;

     @Column(name="Apellido2")
     private String apellido2;

     @OneToMany(mappedBy="profesor", cascade= CascadeType.ALL)
     private Set<CorreoElectronico> correosElectronicos;


     public Profesor(){
     }

     public Profesor(String nombre, String apellido1, String apellido2) {
         this.nombre = nombre;
         this.apellido1 = apellido1;
         this.apellido2 = apellido2;
     }
     
     public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApe1() {
		return apellido1;
	}

	public void setApe1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApe2() {
		return apellido2;
	}

	public void setApe2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public Set<CorreoElectronico> getCorreoElectronico(){
    	 return correosElectronicos;
     }
     
     public void setCorreosElectronicos(Set<CorreoElectronico> correosElectronicos) {
    	 this.correosElectronicos = correosElectronicos;
     }
 }