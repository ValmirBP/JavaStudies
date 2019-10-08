package com.valmir.cursojava.aula15;

import java.util.Scanner;

public class MultipleIfElses {

    public static void main(String[] args) {

        int age;
        double price;

        Scanner s = new Scanner(System.in);

        System.out.println("Qual sua idade");
        age = s.nextInt();

        if (age >= 18) {
            System.out.println("Maior de iadade, Parabéns já pode tirar sua carteira, porém não recomnedo beber");
        } else {
            System.out.println("Você ainda é uma criança");
        }

        System.out.println("digite o valor de algo");
        price=s.nextDouble();

        if(price<=10){
            System.out.println("preço bom");
        }else if(price > 10 && price < 15){
            System.out.println("pechinchar");
        }else if(price>=15 && price <17){
            System.out.println("pesquise");
        }else{
            System.out.println("Perigo!!! Muito caro");
        }
    }
}

