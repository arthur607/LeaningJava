package com.company.projects.Loja;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

Comprador arthur = new Comprador("arthur",18,531);
        List<Produto> produto = new ArrayList<Produto>();

        produto.add(new Produto("camisa",4,10.0,2));
        arthur.comprarProduct(produto);

    }
}
