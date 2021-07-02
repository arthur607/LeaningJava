package com.company.matriz;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {

        Scanner n =new Scanner(System.in);

        System.out.println("enter a number:");
        int x = n.nextInt();

        int[][] matriz = new int[x][x];

        for (int i = 0;i < x;i++){
            for (int j=0;j<x;j++){
                matriz[i][j] = n.nextInt();
            }
        }

        System.out.println("diagonal principal");
        for (int i=0;i < x;i++){
            System.out.print(matriz[i][i]+ " ");
        }

        int count = 0;
        for (int i=0;i<x;i++){
            for (int j=0;j<x;j++){
                if (matriz[i][j] < 0){
                    count++;
                }
            }
        }
        System.out.println("negative numbers: " + count);

    }





}
