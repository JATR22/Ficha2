package com.example.ficha7.dto;

import com.example.ficha7.model.Empresa;


public class GetEmpresaResponse extends SimpleResponse{
    private Empresa empresa;

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}