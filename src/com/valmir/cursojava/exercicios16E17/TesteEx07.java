package com.valmir.cursojava.exercicios16E17;

import java.util.Scanner;

public class TesteEx07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {

            System.out.println("Entre com um número:");
            num = scan.nextInt();

            if (num > maior) {
                maior = num;
                System.out.println("o número maior mudou: " + maior);
            }
        }

        System.out.println("O maior número digitado foi: " + maior);
    }

}

