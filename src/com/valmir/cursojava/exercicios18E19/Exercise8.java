
package com.valmir.cursojava.exercicios18E19;

import java.util.Scanner;

public class Exercise8 {
    /*
Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
um vetor C, onde cada elemento de C é a multiplicação dos
respectivos elementos em A e B, ou seja:
C[i] = A[i] * B[i].
     */

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] vetA = new int[10];
        int[] vetB = new int[vetA.length];
        int[] vetC = new int[vetA.length];

        System.out.println(" entrada Vetor A ");

        for (int i = 0; i < vetA.length; i++) {

            System.out.println(" digite um valor para " + i);
            vetA[i] = s.nextInt();
        }

        System.out.println(" entrada Vetor B ");

        for (int i = 0; i < vetB.length; i++) {

            System.out.println(" digite um valor para " + i);
            vetB[i] = s.nextInt();

            vetC[i] = vetB[i] * vetA[i];
        }

        System.out.println();
        System.out.print(" vetor A = ");

        for (int i = 0; i < vetA.length; i++) {

            System.out.print(vetA[i] + " ");
        }

        System.out.println();
        System.out.print("Vetor B = ");

        for (int i = 0; i < vetB.length; i++) {

            System.out.print(vetB[i] + " ");
        }

        System.out.println();
        System.out.print("Vetor C = ");

        for (int i = 0; i < vetC.length; i++) {

            System.out.print(vetC[i] + " ");
        }
    }
}
