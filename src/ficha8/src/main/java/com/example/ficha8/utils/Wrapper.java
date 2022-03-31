package com.example.ficha8.utils;

import com.example.ficha8.model.Andar;
import com.example.ficha8.model.CentroComercial;
import com.example.ficha8.model.Loja;

public class Wrapper {
	
	private CentroComercial cc;
	private Andar andar;
	private Loja loja;
	
	public Wrapper(CentroComercial cc, Andar andar, Loja loja) {
		this.cc = cc;
		this.andar = andar;
		this.loja = loja;
	}

	public CentroComercial getCc() {
		return cc;
	}

	public void setCc(CentroComercial cc) {
		this.cc = cc;
	}

	public Andar getAndar() {
		return andar;
	}

	public void setAndar(Andar andar) {
		this.andar = andar;
	}

	public Loja getLoja() {
		return loja;
	}

	public void setLoja(Loja loja) {
		this.loja = loja;
	}

}

