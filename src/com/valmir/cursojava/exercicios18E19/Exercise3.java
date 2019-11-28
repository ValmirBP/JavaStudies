package com.valmir.cursojava.exercicios18E19;

import java.util.Scanner;

public class Exercise3 {
    /*
Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o quadrado do respectivo elemento de A, ou seja:
B[i] = A[i] * A[I].
     */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] vetA = new int[15];
        int[] vetB = new int[vetA.length];

        for (int i = 0; i < vetA.length; i++) {

            System.out.println(" digite um valor para" + i);
            vetA[i] = s.nextInt();

            vetB[i] = vetA[i] * vetA[i];
        }

        System.out.println();
        System.out.print("Vetor A = ");

        for (int i = 0; i < vetA.length; i++) {

            System.out.print(vetA[i] + " ");
        }

        System.out.println();
        System.out.print("Vetor B = ");

        for (int i = 0; i < vetB.length; i++) {

            System.out.print(vetB[i] + " ");
        }
    }
}