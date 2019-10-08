package com.valmir.cursojava.aula14;

import java.util.Scanner;

public class Adult {

    public static void main( String[] args){

        int age;

        Scanner s = new Scanner(System.in);

        System.out.println("Qual sua idade");
        age = s.nextInt();

        if (age >=18){
            System.out.println("Maior de iadade, Parabéns já pode tirar sua carteira, porém não recomnedo beber");
        }else{
            System.out.println("Você ainda é uma criança");
        }
    }
}
