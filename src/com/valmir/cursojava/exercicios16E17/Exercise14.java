package com.valmir.cursojava.exercicios16E17;

import java.util.Scanner;

public class Exercise14 {
    /*
Faça um programa que peça 10 números inteiros, calcule e mostre a
quantidade de números pares e a quantidade de números impares.
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num;
        int pair = 0;
        int odd = 0;

        for (int i = 0; i < 10; i++) {

            System.out.println("digite um numero inteiro");
            num = s.nextInt();

            if (num % 2 == 0) {
                pair++;
            } else {
                odd++;
            }
        }

        System.out.println("QNTD NUMEROS PARES \t" + pair);
        System.out.println("QNTD NUMEROS IMPARES \t" + odd);

    }
}
