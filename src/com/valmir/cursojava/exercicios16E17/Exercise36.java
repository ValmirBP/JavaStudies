package com.valmir.cursojava.exercicios16E17;

import java.util.Scanner;

public class Exercise36 {
    /*
    36. Sendo H= 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, Faça um programa que
calcule o valor de H com N termos.
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n, sum = 0;

        System.out.println("digite um valor para n");
        n = s.nextInt();

        for (int i = 1, j = 1; i <= n; i++, j += 2) {
            System.out.println(i + "/" + j);

            sum += i / j;

        }

        System.out.println(" soma = " + sum);

    }
}

