package com.valmir.cursojava.exercicios16E17;

import java.lang.reflect.ParameterizedType;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise31 {
    /*
 PT1

 Um funcionário de uma empresa recebe aumento salarial anualmente:
Sabe-se que:
. Esse funcionário foi contratado em 1995, com salário inicial de
R$ 1.000,00;
a. Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
b. A partir de 1997 (inclusive), os aumentos salariais sempre
correspondem ao dobro do percentual do ano anterior. Faça um
programa que determine o salário atual desse funcionário.

PT2

 Após
concluir isto, altere o programa permitindo que o usuário digite o
salário inicial do funcionário.
     */

    public static void main(String[] args) {

        //Pt 1
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,##0.00");

        int year = 1995;
        double wage = 1000.00;
        double percentage = 1.5;

        System.out.println("salario em " + year + " = " + df.format(wage));

        wage += (wage/100) *percentage;

        System.out.println("salario em 1996 = " + df.format(wage));

        for (int i = 1997; i <= 2019; i++) {

            percentage *= 2;

            wage += (wage/100) *percentage;

            System.out.println("salario em " + i + " = " + df.format(wage));

        }
    }
}
