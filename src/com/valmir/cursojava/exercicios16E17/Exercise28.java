package com.valmir.cursojava.exercicios16E17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise28 {
    /*
Os números primos possuem várias aplicações dentro da
Computação, por exemplo na Criptografia. Um número primo é aquele
que é divisível apenas por um e por ele mesmo. Faça um programa
que peça um número inteiro e determine se ele é ou não um número
primo
     */

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int num;
        boolean primo = true;

        System.out.println(" digite um numero qualquer");
        num = s.nextInt();

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                System.out.println(" nao primo divisivel por " + i);
                primo = false;
            }
        }
        if (primo) {

            System.out.println("Primo");
        }
    }
}
