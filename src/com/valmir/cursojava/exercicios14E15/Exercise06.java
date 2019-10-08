package com.valmir.cursojava.exercicios14E15;

import java.util.Scanner;

public class Exercise06 {

    public static void main(String[] args){

        //6. Faça um Programa que leia três números e mostre o maior deles.

        int nu1, nu2, nu3;

        Scanner s = new Scanner(System.in);

        System.out.println("Digite 3 numeros Inteiros");

        nu1 = s.nextInt();
        nu2 = s.nextInt();
        nu3 = s.nextInt();

        if(nu1>nu2 && nu1>nu3){
            System.out.println("O maior eh o 1st \t"+ nu1);
        } else if (nu2>nu1 && nu2>nu3){
            System.out.println("O maior eh o 2nd \t"+ nu2);
        }else if (nu3>nu1 && nu3>nu2){
            System.out.println("O maior eh o 3rd \t"+ nu3);
        }else {
            System.out.println("numeros iguais");
        }
    }
}
