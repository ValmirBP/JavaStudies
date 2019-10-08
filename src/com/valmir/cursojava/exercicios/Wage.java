package com.valmir.cursojava.exercicios;

import java.util.Scanner;

public class Wage {

    public static void main(String[]args){
        /*13. Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês, sabendo-se que são descontados 11% para o
Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
programa que nos dê:
. salário bruto.
a. quanto pagou ao INSS.
b. quanto pagou ao sindicato.
c. o salário líquido.
d. calcule os descontos e o salário líquido, conforme a tabela
abaixo:
+ Salário Bruto : R$ - IR (11%) : R$ - INSS
(8%) : R$ - Sindicato ( 5%) : R$ = Salário
Liquido : R$
*/
        int time;
        int days = 30;
        double wage, brute,inss,ir,sindicate,liquid;

        Scanner s = new Scanner(System.in);

        System.out.println("Digite o o valor de horas trabalhadas");
        time = s.nextInt();

        System.out.println("Digite valor da sua hora trabalhada ");
        wage = s.nextDouble();

        brute = wage*time*days;
        System.out.println("O salário bruto é " + brute);

        inss = brute*0.08;
        System.out.println("Valor do inss de acordo com seu salário bruto = " + inss);

        ir = brute * 0.11;
        System.out.println("Valor do ir de acordo com seu salário bruto = " + ir);

        sindicate = brute*0.05;
        System.out.println("Valor a ser pago pelos ladrões de acordo com seu salário é = " + sindicate);

        liquid = brute-inss-ir-sindicate;
        System.out.println("Valor do seu slário liquido é  = " + liquid);
    }
}