package com.valmir.cursojava.exercicios18E19;

import java.util.Scanner;

public class Exercise9 {
    /*
Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
um vetor C, onde cada elemento de C é a divisão dos respectivos
elementos em A e B, ou seja:C[i] = A[i] / float(B[i]).
     */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        float[] vetA = new float[3];
        float[] vetB = new float[vetA.length];
        float[] vetC = new float[vetA.length];
        boolean valid = true;

        System.out.println(" entrada para o grupo A ");

        for (int i = 0; i < vetA.length; i++) {

            System.out.println("Digite um valor para A " + i);
            vetA[i] = s.nextFloat();
        }

        System.out.println(" Entrada para o vetor B");

        do {
            for (int i = 0; i < vetB.length; i++) {

                System.out.println("Digite um valor para B " + i);
                vetB[i] = s.nextFloat();
                valid = true;

                if (vetB[i] == 0) {
                    System.out.println(" Digite um valor diferente de 0 ");
                    valid = false;
                }
            }
        } while (valid);


        System.out.println();
        System.out.print(" Vetor A =");

        for (int i = 0; i < vetA.length; i++) {
            System.out.println(vetA[i] + " ");
        }

        System.out.print(" Vetor B =");

        for (int i = 0; i < vetB.length; i++) {
            System.out.println(vetB[i] + " ");

        }

        System.out.print(" Vetor C =");

        for (int i = 0; i < vetC.length; i++) {
            System.out.println(vetC[i] + " ");

        }
    }
}


