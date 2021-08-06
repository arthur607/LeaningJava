package com.company.projects.Loja;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Scanner;


public class Comprador extends Pessoa {

    Scanner sc = new Scanner(System.in);
    public Comprador(String nome, int idade, int cpf) {
        super(nome, idade, cpf);
    }

    public void comprarProduct(List<Produto> p){
        Produto pr = new Produto();
        System.out.println("digite o produto que deseja comprar:");
        pr.setNome(sc.nextLine());
        if (p.contains(pr.getNome())){
        p.stream().map(produto -> produto.getStock() -1 );
        }
        p.forEach(System.out :: println);
    }
}
