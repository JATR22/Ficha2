package com.example.ficha8.dto;

import java.util.ArrayList;
import java.util.List;

import com.example.ficha8.model.CentroComercial;



public class SimpleResponseCentroComercial extends SimpleResponse {
    
	List<CentroComercial> centros;

	public SimpleResponseCentroComercial() {
		this.centros = new ArrayList<>();
	}

	public List<CentroComercial> getCentros() {
		return centros;
	}

	public void setCentros(List<CentroComercial> centros) {
		this.centros = centros;
	}
	
}