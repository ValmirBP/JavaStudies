package com.valmir.cursojava.exercicios14E15;

import java.util.Scanner;

public class Exercise01 {

    public static void main(String[]args){

        Scanner s = new Scanner(System.in);

        System.out.println("Digite dois numeros");
        long value1 = s.nextLong();
        long value2 = s.nextLong();

        if (value1>value2){
            System.out.println("maior é " + value1);
        }else {
            System.out.println("maior é " + value2);
        }
    }
}
