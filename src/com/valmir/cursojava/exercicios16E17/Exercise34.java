package com.valmir.cursojava.exercicios16E17;

import java.util.Scanner;

public class Exercise34 {
    /*
34. Sendo H= 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, Faça um programa que
calcule o valor de H com N termos.
     */

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n;
        double sumH = 0;
        System.out.println("Entre com o valor para n ");
        n = s.nextInt();

        for (int i = 1; i <= n; i++) {

            sumH += 1 / i;
        }

        System.out.println(sumH);
    }
}
