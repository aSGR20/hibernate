package Modelo;
// Generated 31 ene. 2021 20:57:12 by Hibernate Tools 5.4.21.Final

/**
 * Clavesanteriores generated by hbm2java
 */
public class Clavesanteriores implements java.io.Serializable {

	private Integer numero;
	private String nombre;
	private String clave;

	public Clavesanteriores() {
	}

	public Clavesanteriores(String nombre, String clave) {
		this.nombre = nombre;
		this.clave = clave;
	}

	public Integer getNumero() {
		return this.numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

}
