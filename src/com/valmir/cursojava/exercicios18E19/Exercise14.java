package com.valmir.cursojava.exercicios18E19;

import java.util.Scanner;

public class Exercise14 {

    /*
    Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a média aritmética simples dos elementos
ímpares armazenados neste vetor
     */

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        float sum = 0;
        int odd = 0;
        int[] vetA = new int[10];

        for (int i = 0; i < vetA.length; i++) {

            System.out.println("entre com os valores da posicao " + i);
            vetA[i] = s.nextInt();
        }

        System.out.print("Vetor A = ");

        for (int i = 0; i < vetA.length; i++) {
            if (vetA[i] % 2 != 0) {

                sum += vetA[i];
                odd++;
            }
        }
        for (int i = 0; i < vetA.length; i++) {

            System.out.print(vetA[i] + " ");
        }

        System.out.println("\n O resultado eh");
        System.out.println(" Soma " + sum);
        System.out.println(" Media " + (sum/odd));
        }
    }
