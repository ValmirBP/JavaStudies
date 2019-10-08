package com.valmir.cursojava.exercicios14E15;

import java.util.Scanner;

public class Exercise07 {

    //7. Faça um Programa que leia três números e mostre o maior e o menor
    //deles.

    public static void main(String[] args){

        int n1, n2, n3;

        Scanner s = new Scanner(System.in);

        System.out.println("digite tres numeros inteiros");

        n1 = s.nextInt();
        n2 = s.nextInt();
        n3 = s.nextInt();

        if(n1>=n2 && n1>=n3){
            System.out.println("o maior eh " + n1 );
        }else if (n2>=n1 && n2>=n3){
            System.out.println("o maior eh " + n2 );
    } else if (n3>=n1 && n3>=n2){
            System.out.println("o maior eh " + n3 );
        }

        if(n1<=n2 && n1<=n3){
            System.out.println("o menor eh " + n1 );
        }else if (n2<=n1 && n2<=n3){
            System.out.println("o menor eh " + n2 );
        } else if (n3<=n1 && n3<=n2) {
            System.out.println("o menor eh " + n3);
        }
    }
}