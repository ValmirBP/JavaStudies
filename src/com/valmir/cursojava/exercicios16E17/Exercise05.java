package com.valmir.cursojava.exercicios16E17;

import java.util.Scanner;

public class Exercise05 {
    /*
Altere o programa anterior permitindo ao usuário informar as
populações e as taxas de crescimento iniciais. Valide a entrada e
permita repetir a operação.
     */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Long popA,popB,increaseA,increaseB;
        int Year = 0;

        System.out.println("Qual a população da cidade A");
        popA = s.nextLong();
        System.out.println("Qual a população da cidade B");
        popB = s.nextLong();
        System.out.println("Qual taxa de crescimento da  população da cidade A");
        increaseA = s.nextLong();
        System.out.println("Qual taxa de crescimento da  população da cidade B");
        increaseB = s.nextLong();

        while (popA<popB){

            popA += (popA / 100) * increaseA;
            popB += (popB / 100) * increaseB;
            Year++;
        }

        System.out.println("Populacao de A " + popA);
        System.out.println("Crescimento da Populacao de A " + increaseA +"%");
        System.out.println("Populacao de B " + popB);
        System.out.println("Crescimento da Populacao de B " + increaseB+"%");
        System.out.println("Anos " + Year);

    }
}
