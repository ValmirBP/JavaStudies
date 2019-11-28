package com.valmir.cursojava.exercicios18E19;

import java.util.Scanner;

public class Exercise6 {
    /*
    Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
um vetor C, onde cada elemento de C é a soma dos respectivos
elementos em A e B, ou seja:
C[i] = A[i] + B[i].
     */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] vetA = new int[10];
        int[] vetB = new int[vetA.length];
        int[] vetC = new int[vetA.length];

        System.out.println(" Entrada para vetor A");

        for (int i = 0; i < vetA.length; i++) {

            System.out.println(" entre com um valor");
            vetA[i] = s.nextInt();
        }

        System.out.println(" entrada para vetor B");

        for (int i = 0; i < vetB.length; i++) {

            System.out.println(" entre com um valor");
            vetB[i] = s.nextInt();

            vetC[i] = vetA[i] + vetB[i];
        }

        System.out.print(" Vetor A = ");

        for (int value : vetA) {

            System.out.print(value + " ");
        }

        System.out.println();

        System.out.print(" Vetor B = ");

        for (int value : vetB) {

            System.out.print(value + " ");
        }

        System.out.println();

        System.out.print(" Vetor C = ");

        for (int value : vetC) {

            System.out.print(value + " ");
        }
    }
}
