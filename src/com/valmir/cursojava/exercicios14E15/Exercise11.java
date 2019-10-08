package com.valmir.cursojava.exercicios14E15;

import java.util.Scanner;

public class Exercise11 {
    /*
    11. As Organizações Tabajara resolveram dar um aumento de salário aos
seus colaboradores e lhe contraram para desenvolver o programa que
calculará os reajustes.

    * Faça um programa que recebe o salário de um colaborador e o
reajuste segundo o seguinte critério, baseado no salário atual:

    * salários até R$ 280,00 (incluindo) : aumento de 20%
    * salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
    * salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
    * salários de R$ 1500,00 em diante : aumento de 5% Após
aumento ser realizado, informe na tela:

    * O salário antes do reajuste;
    * O percentual de aumento aplicado;
    * O valor do aumento;
    * O novo salário, após o aumento.
     */

    public static void main ( String[] args){

        double wage_bef,wage_aft, increase20,increase15,increase10,increase5;
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o salario do funcionario");
        wage_bef = s.nextDouble();

        if ( wage_bef <= 280) {
            increase20 = wage_bef * 20 / 100;
            wage_aft = wage_bef + increase20;

            System.out.println("Salario antes do reajuste \t R$ " + wage_bef);
            System.out.println("Percentual aplicado 20% ");
            System.out.println("Valor do aumento \t R$ " + increase20);
            System.out.println("Novo salario \t R$ " + wage_aft);

        } else if ( wage_bef >= 280 && wage_bef <= 700){

            increase15 = wage_bef * 15 / 100;
            wage_aft = wage_bef +  increase15;

            System.out.println("Salario antes do reajuste \t R$ " + wage_bef);
            System.out.println("Percentual aplicado 15% ");
            System.out.println("Valor do aumento \t R$ " + increase15);
            System.out.println("Novo salario \t R$ " + wage_aft);

        }else if ( wage_bef >= 700 && wage_bef <= 1500){

            increase10 = wage_bef * 10 / 100;
            wage_aft = wage_bef +  increase10;

            System.out.println("Salario antes do reajuste \t R$ " + wage_bef);
            System.out.println("Percentual aplicado 10% ");
            System.out.println("Valor do aumento \t R$ " + increase10);
            System.out.println("Novo salario \t R$ " + wage_aft);

    }else if ( wage_bef <= 1500){

            increase5 = wage_bef * 5 / 100;
            wage_aft = wage_bef +  increase5;

            System.out.println("Salario antes do reajuste \t R$ " + wage_bef);
            System.out.println("Percentual aplicado 5% ");
            System.out.println("Valor do aumento \t R$ " + increase5);
            System.out.println("Novo salario \t R$ " + wage_aft);
        }
    }
}