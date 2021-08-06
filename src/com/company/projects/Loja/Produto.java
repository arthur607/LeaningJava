package com.company.projects.Loja;

import com.company.Lambda.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produto {
    private String nome;
    private int quantity;
    private Double price;
    private int stock;


    public void setStock(int stock) {
        this.stock = stock;
    }

    public void removeProduct(){
        final int i = getStock() - 10;
    }
}
