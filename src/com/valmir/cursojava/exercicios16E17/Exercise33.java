package com.valmir.cursojava.exercicios16E17;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Exercise33 {

    /*
33. Faça um programa que mostre os n termos da Série a seguir:
o S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m.
     */

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n, sum = 0;

        System.out.println("digite um valor para n");
        n = s.nextInt();

        for (int i = 1, j = 1; i <= n; i++, j += 2) {
            System.out.println(i + "/" + j);

            sum += i / j;

        }
        System.out.println(" soma = " + sum);
    }
}
