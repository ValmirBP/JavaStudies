package com.valmir.cursojava.exercicios14E15;

import java.util.Scanner;

public class Exercise08 {

    //Faça um programa que pergunte o preço de três produtos e informe
    //qual produto você deve comprar, sabendo que a decisão é sempre
    //pelo mais barato.

    public static void main(String[] args) {

        double price1, price2, price3;
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o valor do produto 01");
        price1 = s.nextDouble();
        System.out.println("Digite o valor do produto 02");
        price2 = s.nextDouble();
        System.out.println("Digite o valor do produto 03");
        price3 = s.nextDouble();

        if (price1 < price2 && price1 < price3) {
            System.out.println("o produto mais barato eh o 1 $" + price1);
        } else if (price2 < price1 && price2 < price3) {
            System.out.println("o produto mais barato eh o 2  $" + price2);
        } else if (price3 < price1 && price3 < price2) {
            System.out.println("o produto mais barato eh o 3 $ " + price3);
        } else {
            System.out.println("Valores iguais" +"\t" + price1 + " " + price2 + " " + price3);
        }
    }
}
