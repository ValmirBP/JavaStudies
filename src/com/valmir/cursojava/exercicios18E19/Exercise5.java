package com.valmir.cursojava.exercicios18E19;

import java.util.Scanner;

public class Exercise5 {
    /*
    Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o respectivo elemento de A multiplicado por sua posição (ou
índice), ou seja:
B[i] = A[i] * i.
     */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int vetA[] = new int[10];
        int vetB[] = new int[vetA.length];

        for (int i = 0; i < vetA.length; i++) {

            System.out.println("entre com o valor para " + i);
            vetA[i] = s.nextInt();

            vetB[i] = vetA[i] * i;
        }

        System.out.println("");
        System.out.print("Vetor A = ");

        for (int i = 0; i < vetA.length; i++) {

            System.out.print(vetA[i] + " ");
        }

        System.out.println();
        System.out.print(" Vetor B = ");

        for (int i = 0; i < vetB.length; i++) {

            System.out.print(vetB[i] + " ");
        }
    }
}

