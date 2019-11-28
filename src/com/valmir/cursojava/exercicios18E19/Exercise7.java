package com.valmir.cursojava.exercicios18E19;

import java.util.Scanner;

public class Exercise7 {
    /*
Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
um vetor C, onde cada elemento de C é a subtração dos respectivos
elementos em A e B, ou seja:
C[i] = A[i] – B[i].
     */

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] vetA = new int[3];
        int[] vetB = new int[vetA.length];
        int[] vetC = new int[vetA.length];

        System.out.println(" entrada para o vetor A ");

        for (int i = 0; i < vetA.length; i++) {

            System.out.println(" Digite um valor para " + i);
            vetA[i] = s.nextInt();
        }

        System.out.println(" entrada para o vetor B");

        for (int i = 0; i < vetB.length; i++) {

            System.out.println(" Digite um valor para " + i);
            vetB[i] = s.nextInt();

            vetC[i] = vetA[i] - vetB[i];
        }

        System.out.print(" Vetor A = ");

        for (int i = 0; i < vetA.length; i++) {

            System.out.print(vetA[i] + " ");
        }

        System.out.print(" Vetor B = ");

        for (int i = 0; i < vetB.length; i++) {

            System.out.print(vetB[i] + " ");
        }

        System.out.print(" Vetor C = ");

        for (int i = 0; i < vetC.length; i++) {

            System.out.print(vetC[i] + " ");

        }
    }
}
