package com.valmir.cursojava.exercicios16E17;

import java.util.Scanner;

public class Exercise16UsingFor {
    /*
    A série de Fibonacci é formada pela seqüência
0,1,1,2,3,5,8,13,21,34,55,... Faça um programa que gere a série até
que o valor seja maior que 500.
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int first = 1;
        int second = 1;
        int next = 0 ;

        for (int i = next; i <= 500; i++) {

            next = first + second;
            first = second;
            second = next;

            System.out.println(next + " ");
        }

    }
}
