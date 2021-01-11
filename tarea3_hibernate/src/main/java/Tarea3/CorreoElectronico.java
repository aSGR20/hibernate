package Tarea3;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="CorreoElectronico")
public class CorreoElectronico implements Serializable {

    @Id
    @Column(name="IDCorreo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IDCorreo;

    @Column(name="CorreoElectronico")
     private String direccionCorreo;

     @ManyToOne
     @JoinColumn(name="IDProfesor")
     private Profesor profesor;

     public CorreoElectronico() {

     }

     public CorreoElectronico(String direccionCorreo, Profesor profesor) {
         this.direccionCorreo=direccionCorreo;
         this.profesor=profesor;
     }
     
     public int getIdCorreo() {
		return IDCorreo;
	}

	public void setIdCorreo(int idCorreo) {
		this.IDCorreo = idCorreo;
	}

	public String getDireccionCorreo() {
		return direccionCorreo;
	}

	public void setDireccionCorreo(String direccionCorreo) {
		this.direccionCorreo = direccionCorreo;
	}

	public Profesor getProfesor() {
    	 return profesor;
     }
     
     public void setProfesor(Profesor profesor) {
    	 this.profesor = profesor;
     }
 }