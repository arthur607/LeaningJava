package com.company.projects.Loja;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Vendedor extends Pessoa{
        private Produto produto;

    public Vendedor(String nome, int idade, int cpf) {
        super(nome, idade, cpf);
    }




}
