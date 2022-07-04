package com.creditos.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table (name = "solicitud_credito")
@Entity
public class SolicitudCredito {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private int monto;
	private String plazo;

	public SolicitudCredito(int monto, String plazo){
		super();
		this.monto = monto;
		this.plazo = plazo;

	}

	public SolicitudCredito(){
		

	}

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getMonto(){
		return monto;
	}

	public void setMonto(int monto){
		this.monto = monto;
	}

	public String getPlazo(){
		return plazo;
	}

	public void setId(String plazo){
		this.plazo = plazo;
	}
}
