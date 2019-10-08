package com.valmir.cursojava.exercicios14E15;

import java.util.Scanner;

public class Exercise09 {
    /*
    Faça um Programa que leia três números e mostre-os em ordem
decrescente.
     */
    public static void main (String[] args) {


        int n1, n2, n3;
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um primeiro numero");
        n1 = s.nextInt();
        System.out.println("Digite um segundo numero");
        n2 = s.nextInt();
        System.out.println("Digite um terceiro numero");
        n3 = s.nextInt();

        if (n1 <= n2 && n1 <= n3 && n2 <= n3) {
            System.out.println("A ordem decrecente eh 1\t" + n3 + " " + n2 + " " + n1);

        } else if (n1 <= n2 && n1 <= n3 && n3 <= n2 ) {
            System.out.println("A ordem decrecente eh 2\t" + n2 + " " + n3 + " " + n1);

        }else if (n2 <= n1 && n2 <= n3 && n1 <= n3 ) {
            System.out.println("A ordem decrecente eh 3\t" + n3 + " " + n1 + " " + n2);

    }else if (n2 <= n1 && n2 <= n3 && n3 <= n1 ) {
            System.out.println("A ordem decrecente eh 4\t" + n1 + " " + n3 + " " + n2);

    }else if (n3 <= n1 && n3 <= n2 && n1 <= n2 ) {
            System.out.println("A ordem decrecente eh 5\t" + n2 + " " + n1 + " " + n3);

        }else if (n3 <= n1 && n3 <= n2 && n2 <= n1 ) {
            System.out.println("A ordem decrecente eh 6\t" + n1 + " " + n2 + " " + n3);
    }
  }
}
