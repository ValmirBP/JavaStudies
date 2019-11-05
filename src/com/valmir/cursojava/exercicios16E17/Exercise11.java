package com.valmir.cursojava.exercicios16E17;

import java.util.Scanner;

public class Exercise11 {
    /*
   10 Faça um programa que receba dois números inteiros e gere os
   números inteiros que estão no intervalo compreendido por eles.

11 Altere o programa anterior para mostrar no final a soma dos números.

     */
    public static void main(String[] args) {

        int num1, num2;
        int sum = 0;

        Scanner s = new Scanner(System.in);

        System.out.println("Digite um numero inteiro");
        num1 = s.nextInt();

        System.out.println("Digite um numero inteiro");
        num2 = s.nextInt();

        System.out.println("os numeros compreendidos entre " + num1 + " e " + num2 + " sao");

        for (int i = num1; i <= num2; i++) {

            System.out.print(i + " ");

            sum += i;
        }

        System.out.println("\nA soma entre os numeros eh \t"+ sum);
    }
}
