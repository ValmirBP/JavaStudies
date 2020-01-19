package com.valmir.cursojava.exercicios18E19;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise16 {

    /*
    Criar um vetor A com 10 elementos inteiros. Escrever um programa
que calcule e escreva: a) a soma de elementos armazenados neste
vetor que são inferiores a 15; b) a quantidade de elementos
armazenados no vetor que são iguais a 15; e c) a média dos
elementos armazenados no vetor que são superiores a 15.
     */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] vetA = new int[4];
        float sum = 0;
        float qnty = 0;


        for (int i = 0; i < vetA.length; i++) {

            System.out.println(" Digite o valor para a posicao " + i);
            vetA[i] = s.nextInt();
        }

        System.out.print("Vetor A = ");
// Letra C
        for (int i = 0; i < vetA.length; i++) {

            if (vetA[i] > 15) {
                sum += vetA[i];
                qnty++;
            }

       }

// Letra B
//
//        for (int i = 0; i < vetA.length; i++) {
//
//            if (vetA[i] == 15) {
//                sum ++;
//            }
//
//        }

// letra A

//        for (int i = 0; i < vetA.length; i++) {
//            if (vetA[i] < 15) {
//
//                sum += vetA[i];
//            }
//        }
       for (int i = 0; i < vetA.length; i++) {

            System.out.print(vetA[i] + " ");
        }

//        System.out.println("\n\n Soma de menores que 15 eh " + sum); // resp. Letra A
//       System.out.println("\n\n A quantidade de numeros = 15 eh " + sum);// resp Letra B
       System.out.println("\n\n A Media eh " + (sum/ qnty)); // resp Letra C
    }
}
