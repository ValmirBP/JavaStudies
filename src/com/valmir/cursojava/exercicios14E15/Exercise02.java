package com.valmir.cursojava.exercicios14E15;

//2. Faça um Programa que peça um valor e mostre na tela se o valor é
//positivo ou negativo.

import java.util.Scanner;

public class Exercise02 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Digite um numero");
        int value1 = s.nextInt();

        if (value1 >= 0) {
            System.out.println("positivo " + value1);
        } else {
            System.out.println("negativo");
        }
    }
}
