package com.company.projects.Loja;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pessoa {
    
    private String nome;
    private int idade;
    private int cpf;

}
