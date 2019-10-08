package com.valmir.cursojava.exercicios;

import java.util.Scanner;

public class Salary {

    public static void main (String[] args){

        /*8. Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês.*/

        int time;
        int days;
        double wage;
        double result;

        Scanner s = new Scanner(System.in);

        System.out.println("Digite o o valor de horas trabalhadas");
        time = s.nextInt();

        System.out.println("Digite valor da sua hora trabalhada ");
        wage = s.nextDouble();

        System.out.println("Digite  os disa trabalhados no mes");
        days = s.nextInt();

        result = wage*time*days;

        System.out.println("seu slário este mês é:");
        System.out.println(result);
    }
}
