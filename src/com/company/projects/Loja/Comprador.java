package com.company.projects.Loja;

import lombok.AllArgsConstructor;
import lombok.Data;


public class Comprador extends Pessoa {


    public Comprador(String nome, int idade, int cpf) {
        super(nome, idade, cpf);
    }
}
