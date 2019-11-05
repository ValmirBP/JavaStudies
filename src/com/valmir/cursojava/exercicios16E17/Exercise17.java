package com.valmir.cursojava.exercicios16E17;

import java.util.Scanner;

public class Exercise17 {
    /*
Faça um programa que calcule o fatorial de um número inteiro
fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num;
        int result = 1;

        System.out.println("digite um numero");
        num = s.nextInt();

        for (int i = num; i > 0; i--) {
            // não interessa se o i = a num ( var) pois meu i é sempre meou contador

            result *= i;
            // se usar o num ( var) sera minha var multplicada pela mesma quantidade de vezes que a var e não pelo contador
        }

        System.out.println(" O fatorial de " + num + "! eh ");
        System.out.println(result);
    }
}