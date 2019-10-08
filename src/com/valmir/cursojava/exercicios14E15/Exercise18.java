package com.valmir.cursojava.exercicios14E15;

import java.util.Scanner;

public class Exercise18 {
    /*
    18. Faça um Programa que peça um número inteiro e determine se ele é
par ou impar. Dica: utilize o operador módulo (resto da divisão).
     */
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int num;

        System.out.println("Digite um numero que te digo se ele eh par ou impar");
        num = s.nextInt();

        if (num % 2 == 0){
            System.out.println("Numero eh par");
        }else{
            System.out.println("Numero eh impar");
        }
    }
}
