package com.valmir.cursojava.exercicios18E19;

import java.util.Scanner;

public class Exercise15 {

    /*
Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
que defina o percentual de elementos pares e ímpares,
respectivamente, armazenados neste vetor.
     */

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        float odd = 0, even = 0;
        int[] vetA = new int[4];

        for (int i = 0; i < vetA.length; i++) {

            System.out.println(" Digite o valor para a posicao " + i);
            vetA[i] = s.nextInt();

        }

        System.out.print(" Vetor A  = ");

        for (int i = 0; i < vetA.length; i++) {

            if (vetA[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        for (int i=0;i<vetA.length;i++){
            System.out.print( vetA[i] + ",");
        }

        System.out.println("\n Persentagem de pares eh " + ((even * 100) / vetA.length) + "%");
        System.out.println("\n Persentagem de impares eh " + ((odd * 100) / vetA.length)+ "%");
    }
}

