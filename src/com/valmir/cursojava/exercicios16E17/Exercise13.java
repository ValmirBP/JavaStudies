package com.valmir.cursojava.exercicios16E17;

import java.util.Scanner;

public class Exercise13 {

    /*
    Faça um programa que peça dois números, base e expoente, calcule e
mostre o primeiro número elevado ao segundo número. Não utilize a
função de potência da linguagem.
     */

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int base, exponent, result;

        System.out.println(" Digite um numeri inteiro para a base");
        base = s.nextInt();

        System.out.println("Digite um numero inteiro para o expoente");
        exponent = s.nextInt();

        if (exponent == 0) {

            result = 1;

            System.out.println(" O numero " + base + "elevado " + exponent + " eh \t" + result);

        } else {

            result = base;

            for (int i = 1; i < exponent; i++) {

                result *= base;
            }

            System.out.println("O resultado é " + result);
        }
    }
}
