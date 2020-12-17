package Tarea1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Parameter;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Matricula {
	@Id
	@GeneratedValue(generator = "foreigngen")
	@GenericGenerator(strategy = "foreign", name="foreigngen", 
		parameters = @Parameter(name = "property", value="alumno"))
	@Column
	private int idAlumno;
	
	@Column
	private String curso;
	
	@OneToOne(mappedBy = "matricula")
	private Alumno alumno;

	
	public Matricula() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Matricula(String curso, Alumno alumno) {
		this.curso = curso;
		this.alumno = alumno;
	}

	public int getIdAlumno() {
		return idAlumno;
	}
	
	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(int id) {
		this.curso = curso;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
}
