package com.example.ficha7.dto;

import com.example.ficha7.model.Pessoa;


public class GetPessoaResponse extends SimpleResponse{
    private Pessoa pessoa;

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
