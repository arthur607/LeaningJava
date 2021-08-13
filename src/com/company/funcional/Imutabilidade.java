package com.company.funcional;

import java.util.function.UnaryOperator;

public class Imutabilidade {
    public static void main(String[] args) {

        int valor = 10;                //value or object immutable
        UnaryOperator<Integer> returnDoubleValue = param -> param * 2;

        System.out.println(returnDoubleValue.apply(valor));
        System.out.println(valor);
    }
}
