package com.valmir.cursojava.exercicios16E17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise31Pt2 {
    /*
    PT2

 Após
concluir isto, altere o programa permitindo que o usuário digite o
salário inicial do funcionário.
     */

    public static void main(String[] args) {

        //Pt 1
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,##0.00");

        int year;
        double wage = 1000.00;
        double percentage = 1.5;

        System.out.println("Entre com o ano de contratacao");
        year = s.nextInt();

        if (year < 1996) {

            System.out.println("Salario em " + year + " = R$ " + df.format(wage));

        } else if (year == 1996) {

            System.out.println(" Salario na contratacao R$ " +  wage);
            System.out.println(" Almento "+ percentage + " %");

            wage += (wage / 100) * percentage;

            System.out.println(" Salario em 1996 = R$ " + df.format(wage));

        } else {

            System.out.println("Salario na contratacao R$ " +  wage);
            System.out.println("Almento "+ percentage + " %");
            System.out.println(" \nSalario a apartir dos proximos anos até ano 2019 com 2x "+ percentage + " ao ano \n");

            for (int i = year; i <= 2019; i++) {

                percentage *= 2;

                wage += (wage / 100) * percentage;

                System.out.println("salario em " + i + " = " + df.format(wage) + "\n percentagem de almento do ano " + i + " " + percentage + "\n");

            }
        }
    }
}
