package com.company.Lambda;

import java.util.Arrays;

public class DeclarativaXImperativa {
    public static void main(String[] args) {
        int[] valores = {1,2,3,4};

//        Arrays.stream(valores)                          //declarativa
//                .filter(numero -> numero % 2 == 0)
//                .map(numero -> numero * 2)
//                .forEach(value -> System.out.println(value));


        for (int i = 0; i < valores.length; i++) {       //imperativa
            int multplicacao = 0;
            if (valores[i] % 2 == 0){
                multplicacao = valores[i] * 2;
            }
            if(!(multplicacao == 0))
                System.out.println(multplicacao);
        }
    }
}
