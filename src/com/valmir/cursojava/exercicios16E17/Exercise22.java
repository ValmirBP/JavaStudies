package com.valmir.cursojava.exercicios16E17;

import java.util.Scanner;

public class Exercise22 {

    /*
    Faça um programa que calcule o valor total investido por um
colecionador em sua coleção de CDs e o valor médio gasto em cada
um deles. O usuário deverá informar a quantidade de CDs e o valor
para em cada um.
     */

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        float qntyDisc, valueDisc,result;

        float sum = 0;

        System.out.println(" Entre com a quantidade de discos");
        qntyDisc = s.nextFloat();

        for (int i = 1; i <= qntyDisc; i++) {

            System.out.println(" Digite o Valor do disco " + i);
            valueDisc = s.nextFloat();

            sum += valueDisc;
        }

        result = sum / qntyDisc;

        System.out.println(" o valor medio gasto eh de \t R$ " + result );

    }
}
