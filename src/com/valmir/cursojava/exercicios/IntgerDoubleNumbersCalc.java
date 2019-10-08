package com.valmir.cursojava.exercicios;

import java.util.Scanner;

public class IntgerDoubleNumbersCalc {

    /* 11. Faça um Programa que peça 2 números inteiros e um número real.
Calcule e mostre:
a. o produto do dobro do primeiro com metade do segundo .
b. a soma do triplo do primeiro com o terceiro.
c. o terceiro elevado ao cubo.*/

    public static void main (String[] args){

        int value1,value2;
        double value3, result1,result2,result3;

        Scanner s = new Scanner(System.in);

        System.out.println("Digite 2 números interos");
        value1 = s.nextInt();
        value2 = s.nextInt();

        System.out.println("Digite 1 número Real");
        value3 = s.nextDouble();

        //letra a
        result1 = ((value1*2)*(value2/2));
        // letra b
        result2 = ((value1*3)+(value3*3));
        // letra c
        result3 = value3*value3*value3;

        System.out.println("o produto do dobro do primeiro com metade do segundo = "+ result1);
        System.out.println("a soma do triplo do primeiro com o terceiro = "+ result2);
        System.out.println("o terceiro elevado ao cubo = "+ result3);
    }
}
