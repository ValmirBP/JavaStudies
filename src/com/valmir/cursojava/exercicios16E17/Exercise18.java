package com.valmir.cursojava.exercicios16E17;

import java.util.Scanner;

public class Exercise18 {
    /*
    Faça um programa que peça um número inteiro e determine se ele é
ou não um número primo. Um número primo é aquele que é divisível
somente por ele mesmo e por 1.
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int num;

        System.out.println("Entre com um numero inteiro");
        num = s.nextInt();

        boolean prime = true;

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                System.out.println("nao e primo");
                prime = false;

            }
        }

        if (prime) {

            System.out.println("E primo");

        }
    }
}
