package com.valmir.cursojava.exercicios18E19;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Exercise12 {
        /*
        Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a soma de todos os elementos armazenados
neste vetor.
         */

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] vetA = new int[3];
        int sum = 0;

        for (int i = 0; i < vetA.length; i++) {

            System.out.println(" Entre com o valor do da posicao " + i);
            vetA[i] = s.nextInt();
        }

        System.out.print(" Vetor A = ");

        for (int i = 0; i < vetA.length; i++) {

            sum += vetA[i];
        }

        for (int i = 0; i < vetA.length; i++) {

            System.out.print(vetA[i] + " ");
        }

        System.out.println();
        System.out.println(" A soma eh ");
        System.out.println(sum);
    }
}