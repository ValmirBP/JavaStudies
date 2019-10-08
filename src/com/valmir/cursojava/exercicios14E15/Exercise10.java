package com.valmir.cursojava.exercicios14E15;

import java.util.Scanner;
/*
10. Faça um Programa que pergunte em que turno você estuda. Peça
para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
Inválido!", conforme o caso.
 */
public class Exercise10 {
    public static void main (String[]args){

        String dayPeriod;
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o periodo que voce estuda M-matutino ou V-Vespertino ou N-Noturno");
        dayPeriod = s.next();
        switch (dayPeriod){
            case "m":
            case "M":
                System.out.println("Seu periodo eh matutino");
                System.out.println("Entao Bom Dia!");break;
            case "v":
            case "V":
                System.out.println("Seu periodo eh vespetino");
                System.out.println("Entao Boa Tarde!");break;
            case "n":
            case "N":
                System.out.println("Seu periodo eh noturno");
                System.out.println("Entao Boa Noite!");break;
            default:
                System.out.println("Valor Invalido!");
                System.out.println("apenas aceitamos M, V ou N. ");break;
        }
    }
}
