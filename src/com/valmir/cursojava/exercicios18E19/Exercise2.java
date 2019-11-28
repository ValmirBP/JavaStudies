package com.valmir.cursojava.exercicios18E19;

import java.util.Scanner;

public class Exercise2 {
    /*
    Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho e com os elementos do vetor A multiplicados
por 2, ou seja: B[i] = A[i] * 2.
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int vetA[] = new int[8];
        int vetB[] = new int[vetA.length];

        for (int i = 0; i < vetA.length; i++) {

            System.out.println("entre como valor " + i);
            vetA[i] = s.nextInt();

            vetB[i] = vetA[i]*2;
        }
        System.out.print(" Vetor A = ");

        for (int i = 0; i < vetA.length; i++) {

            System.out.print(vetA[i] + " ");
        }
        System.out.println();
        System.out.println("Vetor B = ");

        for (int i = 0; i < vetB.length; i++) {

            System.out.println(vetB[i] + " ");
        }
    }
}
