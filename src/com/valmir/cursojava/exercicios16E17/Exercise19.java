package com.valmir.cursojava.exercicios16E17;

import java.util.Scanner;

public class Exercise19 {

    /*Faça um programa que calcule o mostre a média aritmética de N
notas.
     */

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        float num, result =0 ,sum =0 ;

        System.out.println(" entre com un numero");
        num = s.nextInt();

        for (int i = 1; i <= num; i++){

            sum += i;

        }

        result = sum/num;

        System.out.println(" a  soma dos numeros eh \t" + sum);
        System.out.println(" resultado eh : \t " + result);
    }
}
