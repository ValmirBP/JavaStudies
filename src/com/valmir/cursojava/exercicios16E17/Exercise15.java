package com.valmir.cursojava.exercicios16E17;

import java.util.Scanner;

public class Exercise15 {

    /*A série de Fibonacci é formada pela seqüência
1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz de gerar a série
até o n−ésimo termo.*/

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int maximumDigits;
        int next;
        int first = 1;
        int second = 2;

        System.out.println(" Digite o numero maximo de algorismos para a sequencia de fibonacci ");
        maximumDigits = s.nextInt();


        for (int i = 3; i <= maximumDigits; i++) {

            next = first + second;
            first = second;
            second=next;

            System.out.println("proximo \t" + next);
        }
    }
}
