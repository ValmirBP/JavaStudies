package com.valmir.cursojava.exercicios14E15;

import java.util.Scanner;

public class Exercise19 {
    /*
    Faça um Programa que leia 2 números e em seguida pergunte ao
usuário qual operação ele deseja realizar. O resultado da operação
deve ser acompanhado de uma frase que diga se o número é:
. par ou ímpar;
a. positivo ou negativo;
     */

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num1, num2;

        System.out.println("Digite dois numeros");
        num1 = s.nextInt();
        num2 = s.nextInt();
        System.out.println("entre com a operacao + - * / ");
        String operation = s.next();

        double result = 0;
        boolean validOp = true;

        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.println("Operacao invalida");
                validOp = false;
        }

        if (validOp){

            System.out.println("Resultado " + result);

            if (result>= 0 )
                System.out.println("resultado positivo");
        }else {
            System.out.println("resultado negativo");
        }
        if (result%2 == 0 ){
            System.out.println("Valor par");
        }else {
            System.out.println(" Valor impar");
        }
    }
}
