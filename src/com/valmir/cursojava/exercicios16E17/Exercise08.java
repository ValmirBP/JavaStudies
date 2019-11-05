package com.valmir.cursojava.exercicios16E17;

import java.util.Scanner;

public class Exercise08 {

    /*
    Faça um programa que leia 5 números e informe a soma e a média
dos números.
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int num;
        double arithmeticMean, sum = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Digite uma nota");
            num = s.nextInt();

            sum += num;
        }

        System.out.println("A soma entre as notas eh /t " + sum);

        arithmeticMean = sum / 5;

        System.out.println("A media das notas eh " + arithmeticMean);

        if (arithmeticMean >= 5.0 || arithmeticMean > 50.0) {

            System.out.println(" APROVADO");

        } else {

            System.out.println("REPROVADO");
        }
    }
}