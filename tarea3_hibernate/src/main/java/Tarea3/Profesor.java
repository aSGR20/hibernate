package Tarea3;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="Profesor")
public class Profesor implements Serializable  {

    @Id
    @Column(name="IDProfesor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IDProfesor;

    @Column(name="Nombre")
     private String nombre;

     @Column(name="Apellido1")
     private String ape1;

     @Column(name="Apellido2")
     private String ape2;

     @OneToMany(mappedBy="profesor", cascade= CascadeType.ALL)
     private Set<CorreoElectronico> correosElectronicos;


     public Profesor(){
     }

     public Profesor(String nombre, String ape1, String ape2) {
         this.nombre = nombre;
         this.ape1 = ape1;
         this.ape2 = ape2;
     }
     
     public int getId() {
		return IDProfesor;
	}

	public void setId(int id) {
		this.IDProfesor = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApe1() {
		return ape1;
	}

	public void setApe1(String ape1) {
		this.ape1 = ape1;
	}

	public String getApe2() {
		return ape2;
	}

	public void setApe2(String ape2) {
		this.ape2 = ape2;
	}

	public Set<CorreoElectronico> getCorreoElectronico(){
    	 return correosElectronicos;
     }
     
     public void setCorreosElectronicos(Set<CorreoElectronico> correosElectronicos) {
    	 this.correosElectronicos = correosElectronicos;
     }
 }