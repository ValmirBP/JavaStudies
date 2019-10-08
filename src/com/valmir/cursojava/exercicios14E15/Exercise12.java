package com.valmir.cursojava.exercicios14E15;

import java.util.Scanner;

public class Exercise12 {
    /*
    12. Faça um programa para o cálculo de uma folha de pagamento,
sabendo que os descontos são do Imposto de Renda, que depende dosalário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o
FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é
a empresa que deposita). O Salário Líquido corresponde ao Salário
Bruto menos os descontos. O programa deverá pedir ao usuário o
valor da sua hora e a quantidade de horas trabalhadas no mês.
o Desconto do IR:
o Salário Bruto até 900 (inclusive) - isento
o Salário Bruto até 1500 (inclusive) - desconto de 5%
o Salário Bruto até 2500 (inclusive) - desconto de 10%
o Salário Bruto acima de 2500 - desconto de 20% Imprima na tela
as informações, dispostas conforme o exemplo abaixo. No
exemplo o valor da hora é 5 e a quantidade de hora é 220.
Salário Bruto: (5 * 220) : R$ 1100,00
(-) IR (5%) : R$ 55,00
(-) INSS ( 10%) : R$ 110,00
FGTS (11%) : R$ 121,00
Total de descontos : R$ 165,00
Salário Liquido : R$ 935,00
     */
    public static void main(String[] args) {

        double time, valueHour, grossSalary, netSalary, tradeUnion;
        double discount5, discount10, discount20, guaranteeFund, inss;
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o valor da hora trabalhada");
        time = s.nextDouble();

        System.out.println("Digite  total  de horas trabalhadas no mes ");

        valueHour = s.nextDouble();

        grossSalary = time * valueHour;
        tradeUnion = grossSalary * 3 / 100;
        guaranteeFund = grossSalary * 11 / 100;
        inss = grossSalary * 10/100;

        System.out.println("Salario bruto de\t R$" + grossSalary);
        System.out.println("O valor do FGTS eh de 11% depisitado pela empresa no valor de  \t R$ " + guaranteeFund);
        System.out.println("O valor descontado pelo sindicato eh de \t R$ " + tradeUnion);
        System.out.println("O valor do INSS  eh de \t R$ " + inss);


        if (grossSalary <= 900) {

            netSalary = grossSalary - tradeUnion - inss;

            System.out.println("voce está isento do IR");
            System.out.println(" Seu salario liquido eh de \t R$ " + netSalary);

        } else if (grossSalary > 900 && grossSalary <= 1500) {

            discount5 = grossSalary * 5 / 100;
            netSalary = grossSalary - tradeUnion - discount5 - inss;

            System.out.println("Seu desconto no IR eh de 5% no valor de /t R$ " + discount5);
            System.out.println(" Seu salario liquido eh de \t R$ " + netSalary);

        } else if (grossSalary > 1500 && grossSalary <= 2500) {

            discount10 = grossSalary * 10 / 100;
            netSalary = grossSalary - tradeUnion - discount10 -inss;

            System.out.println("Seu desconto no IR eh de 10% no valor de /t R$ " + discount10);
            System.out.println(" Seu salario liquido eh de \t R$ " + netSalary);

        } else if (grossSalary > 2500) {

            discount20 = grossSalary * 20 / 100;
            netSalary = grossSalary - tradeUnion - discount20 - inss;

            System.out.println("Seu desconto no IR eh de 20% no valor de /t R$ " + discount20);
            System.out.println(" Seu salario liquido eh de \t R$ " + netSalary);
        }
    }
}
