package com.valmir.cursojava.exercicios18E19;

import java.util.Scanner;

public class Exercise1 {
    /*
Criar um vetor A com 5 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou
seja, B[i] = A[i].
     */

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int vetA[] = new int[5];
        int vetB[] = new int[vetA.length];

        for (int i = 0; i < vetA.length; i++) {

            System.out.println(" entre com um valor da posicao " + i);
            vetA[i] = s.nextInt();

            vetB[i] = vetA[i];
        }

        System.out.print("Vetor A = ");

        for (int i = 0; i < vetA.length; i++) {
            System.out.print(vetA[i] + " ");
        }

        System.out.println();

        System.out.print("Vetor B = ");

        for (int i = 0; i < vetB.length; i++) {
            System.out.print(vetB[i] + " ");
        }

        System.out.println();
    }
}