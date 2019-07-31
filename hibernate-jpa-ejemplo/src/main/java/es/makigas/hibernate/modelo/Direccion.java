package es.makigas.hibernate.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="DIRECCION")
public class Direccion implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@Column (name = "ID")
	private long id;
	@Column (name = "DIRECCION")
	private String direc;
	@Column (name = "LOCALIDAD")
	private String localidad;
	@Column (name = "PROVINCIA")
	private String provincia;
	@Column (name = "PAIS")
	private String pais;
	
	/*
	@OneToOne(mappedBy = "direccion", fetch = FetchType.LAZY )
	private Empleado empleado;
	*/
	//Para que JPA enganche el objeto
	public Direccion() {
		
	}

	public Direccion(long id, String direccion, String localidad, String provincia, String pais) {
		this.id = id;
		this.direc = direccion;
		this.localidad = localidad;
		this.provincia = provincia;
		this.pais = pais;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDireccion() {
		return direc;
	}

	public void setDireccion(String direccion) {
		this.direc = direccion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getDirec() {
		return direc;
	}

	public void setDirec(String direc) {
		this.direc = direc;
	}



	@Override
	public String toString() {
		return "Direccion [id=" + id + ", direccion=" + direc + ", localidad=" + localidad + ", provincia="
				+ provincia + ", pais=" + pais + "]";
	}
	
}
