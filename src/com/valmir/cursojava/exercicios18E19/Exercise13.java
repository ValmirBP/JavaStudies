package com.valmir.cursojava.exercicios18E19;

import java.util.Scanner;

public class Exercise13 {

    /*
    Criar um vetor A com 10 elementos inteiros. Implementar um programa
que determine a soma dos elementos armazenados neste vetor que
são múltiplos de 5.
     */

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] vetA = new int[10];
        int sum = 0;
        String end;

        for (int i = 0; i < vetA.length; i++) {

            System.out.println("Entre com o valor da posicao  " + i);

            vetA[i] = s.nextInt();
        }

        System.out.print("Vetor A = ");

        for (int i = 0; i < vetA.length; i++) {

            if (vetA[i] % 5 == 0) {
                sum += vetA[i];
            }
        }

        for (int i = 0; i < vetA.length; i++) {

            System.out.print(vetA[i] + " ");
        }

        System.out.print("\n Checando od Multiplos de 5 digitados...");
        System.out.print("\n Somando multiplos...");
        System.out.println(" \n A soma eh " + sum);
        System.out.println(" \n fim de programa....");
    }
}
