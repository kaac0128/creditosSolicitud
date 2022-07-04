package com.creditos.dto;

import java.io.Serializable;

public class CreditoDto implements Serializable{
	
	private int id;
	private int monto;
	private String plazo;

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
