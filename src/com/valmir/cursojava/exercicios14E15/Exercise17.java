package com.valmir.cursojava.exercicios14E15;

import java.util.Scanner;

public class Exercise17 {
    /*
    17. Faça um Programa que peça um número correspondente a um
determinado ano e em seguida informe se este ano é ou não bissexto.
     */

    public static void main(String[] args){

        int year;
        Scanner s = new Scanner(System.in);

        System.out.println("entre com o ano");
        year = s.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
            System.out.println("Ano Bissexto");
        }else {
            System.out.println("Nao eh Bissexto");
        }
    }
}
