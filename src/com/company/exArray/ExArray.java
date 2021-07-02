package com.company.exArray;


import java.util.Scanner;

public class ExArray {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Aluguel[] vect = new Aluguel[10];

        System.out.println("quantos quartos deseja alugar?");
        int qtdeQuartos = leitor.nextInt();

        for (int i = 0; i < qtdeQuartos; i++) {
            leitor.nextLine();
            String name = leitor.nextLine();
            String email = leitor.nextLine();
            int room = leitor.nextInt();
            vect[room] = new Aluguel(name, email, room);

        }
        System.out.println(vect[1].getEmail());
        System.out.println(vect[2].getEmail());

    }
}
