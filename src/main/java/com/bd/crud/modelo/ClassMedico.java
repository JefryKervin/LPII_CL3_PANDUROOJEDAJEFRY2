package com.bd.crud.modelo;

import jakarta.persistence.Entity;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name="tbl_medicocl3")
public class ClassMedico {
	//declaramos sus atributos
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int imedicocl3;
	private String nombrecl3;
	private String apellidocl3;
	private String email;
	private String dnicl3;
	private String estadocivilcl3;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso=ISO.DATE)
	private Date fechanacimcl3;
	
	 // Constructor vacío
    public ClassMedico() {
    	//super();
    }//fin del constructor vacio....
    
    

	public ClassMedico(int imedicocl3, String nombrecl3, String apellidocl3, String email, String dnicl3,
			String estadocivilcl3, Date fechanacimcl3) {
		//super();
		this.imedicocl3 = imedicocl3;
		this.nombrecl3 = nombrecl3;
		this.apellidocl3 = apellidocl3;
		this.email = email;
		this.dnicl3 = dnicl3;
		this.estadocivilcl3 = estadocivilcl3;
		this.fechanacimcl3 = fechanacimcl3;
	}



	public int getImedicocl3() {
		return imedicocl3;
	}

	public void setImedicocl3(int imedicocl3) {
		this.imedicocl3 = imedicocl3;
	}

	public String getNombrecl3() {
		return nombrecl3;
	}

	public void setNombrecl3(String nombrecl3) {
		this.nombrecl3 = nombrecl3;
	}

	public String getApellidocl3() {
		return apellidocl3;
	}

	public void setApellidocl3(String apellidocl3) {
		this.apellidocl3 = apellidocl3;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDnicl3() {
		return dnicl3;
	}

	public void setDnicl3(String dnicl3) {
		this.dnicl3 = dnicl3;
	}

	public String getEstadocivilcl3() {
		return estadocivilcl3;
	}

	public void setEstadocivilcl3(String estadocivilcl3) {
		this.estadocivilcl3 = estadocivilcl3;
	}

	public Date getFechanacimcl3() {
		return fechanacimcl3;
	}

	public void setFechanacimcl3(Date fechanacimcl3) {
		this.fechanacimcl3 = fechanacimcl3;
	}

    
    
	
	
	
	
} // fin de la clase