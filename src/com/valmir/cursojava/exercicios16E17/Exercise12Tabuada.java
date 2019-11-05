package com.valmir.cursojava.exercicios16E17;

import java.util.Scanner;

public class Exercise12Tabuada {
    /*
Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
qualquer número inteiro entre 1 a 10. O usuário deve informar de qual
numero ele deseja ver a tabuada. A saída deve ser conforme o
exemplo abaixo:
o Tabuada de 5:
o 5 X 1 = 5
o 5 X 2 = 10
o ...
o 5 X 10 = 50
     */

    public static void main(String[] args) {
        int tableNum, result;

        Scanner s = new Scanner(System.in);

        System.out.println("Digite o numero da tabuada que deseja criar ");
        tableNum = s.nextInt();

        System.out.println(" Tabuada de \t " + tableNum);

        for (int i = 0; i <= 10; i++) {

            result = tableNum * i;

            System.out.println(tableNum + " x " + i + " = " + result);
        }
    }
}
