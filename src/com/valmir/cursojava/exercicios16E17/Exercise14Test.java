package com.valmir.cursojava.exercicios16E17;

import java.util.Scanner;

public class Exercise14Test {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;
        int pares = 0;
        int impares = 0;

        for (int i=0; i<10; i++){

            System.out.println("Entre com um número:");
            num = scan.nextInt();

            if (num % 2 == 0){
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("QNTD de numeros Pares: " + pares);
        System.out.println("QNTD de numeros Impares: " + impares);

    }
}
