package com.valmir.cursojava.exercicios16E17;

import java.util.Scanner;

public class Exercise30 {
    /*
Desenvolva um programa que faça a tabuada de um número qualquer
inteiro que será digitado pelo usuário, mas a tabuada não deve
necessariamente iniciar em 1 e terminar em 10, o valor inicial e final
devem ser informados também pelo usuário, conforme exemplo
abaixo:

o Montar a tabuada de: 5
Começar por: 4
o Terminar em: 7
o
o Vou montar a tabuada de 5 começando em 4 e terminando em 7:
o 5 X 4 = 20
o 5 X 5 = 25
o 5 X 6 = 30
o 5 X 7 = 35
Obs: Você deve verificar se o usuário não digitou o final menor
que o inicial.
     */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double tabNum;
        double start;
        double finish;
        double result;
        boolean valid = true;

        System.out.println(" Qual tabuada deseja construir");
        tabNum = s.nextDouble();

        do {
            System.out.println(" Defina o limite inicial ");
            start = s.nextDouble();

            System.out.println(" Defina o limite final  ");
            finish = s.nextDouble();

            if (start < finish) {

                valid = false;
            }

        } while (valid);

        System.out.println("Tabuada de: " + tabNum);
        System.out.println("Comeca por: " + start);
        System.out.println("Termina com: " + finish + "\n");

        for (double i = start; i <= finish; i++) {

            result = tabNum * i;

            System.out.println(tabNum + " x " + i + " = " + result);

        }
    }
}
