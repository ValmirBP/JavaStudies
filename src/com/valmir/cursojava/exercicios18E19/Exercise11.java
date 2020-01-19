package com.valmir.cursojava.exercicios18E19;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise11 {
    /*
    Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a quantidade de elementos armazenados neste
vetor que são pares.

     */

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] vetA = new int[5];
        int pair = 0;

        for (int i = 0; i < vetA.length; i++) {

            System.out.println("Entre com o " + i + " valor");
            vetA[i] = s.nextInt();
        }

        for (int i = 0; i < vetA.length; i++) {

            if (vetA[i] % 2 == 0) {
                pair++;
            }
        }

        System.out.println("Os numeros sao ");

        for (int i = 0; i < vetA.length; i++) {

            System.out.print(vetA[i] + " ");
        }

        System.out.println();
        System.out.println("A quantidade de numeros pares eh de ");
        System.out.println(pair);
    }
}

