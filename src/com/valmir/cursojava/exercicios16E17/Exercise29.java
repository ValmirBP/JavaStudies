package com.valmir.cursojava.exercicios16E17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise29 {

    /*
Encontrar números primos é uma tarefa difícil. Faça um programa que
gera uma lista dos números primos existentes entre 1 e um número
inteiro informado pelo usuário.
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int num;
        boolean prime = true;

        System.out.println(" Entre com um numero ");
        num = s.nextInt();

        for (int i = 1; i <= num; i++) {

            prime = true;

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {

                    //System.out.println(" nao primo divisivel por " + i);
                    prime = false;

                }
            }

            if (prime) {

                System.out.println(i);

            }
        }
    }
}
