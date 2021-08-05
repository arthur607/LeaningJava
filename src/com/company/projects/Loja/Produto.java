package com.company.projects.Loja;

import lombok.Data;

@Data
public class Produto {
    private String nome;
    private int quantity;
    private Double price;
    private int stock;


    public void setStock(int stock) {
        this.stock = stock;
    }
}
