package com.valmir.cursojava.exercicios16E17;

import java.util.Scanner;

public class Exercise07 {
    /*
    Faça um programa que leia 5 números e informe o maior número.
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int num;
        int bigger = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {

            System.out.println("what is the first number ");
            num = s.nextInt();

            if (num > bigger) {
                bigger=num;
            }
            System.out.println("maior eh \t" + bigger);
        }
    }
}