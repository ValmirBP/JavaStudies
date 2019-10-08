package com.valmir.cursojava.exercicios14E15;

import java.util.Scanner;

public class Exercise14 {
    /*
    14. Faça um programa que lê as duas notas parciais obtidas por um aluno
numa disciplina ao longo de um semestre, e calcule a sua média. A
atribuição de conceitos obedece à tabela abaixo:
o Média de Aproveitamento Conceito
o Entre 9.0 e 10.0 A
o Entre 7.5 e 9.0 B
o Entre 6.0 e 7.5 C
o Entre 4.0 e 6.0 D
o Entre 4.0 e zero E
O algoritmo deve mostrar na tela as notas, a média, o conceito
correspondente e a mensagem “APROVADO” se o conceito for
A, B ou C ou “REPROVADO” se o conceito for D ou E.
     */
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        double grade1,grade2,result;
        String letter = "";

        System.out.println(" digite a primeira nota parcial");
        grade1= s.nextDouble();
        System.out.println(" digite a segunda nota parcial");
        grade2 = s.nextDouble();

        result = (grade1+grade2)/2;

        if (result >= 9.0 && result < 10.0){
            letter = "A";
        }else if ( result >= 7.5 && result < 9.0){
            letter = "B";
        }else if ( result >= 6.1 && result < 7.5){
            letter = "C";
        }else if ( result >= 4.1 && result < 6.0){
            letter = "D";
        }else if ( result < 4.0){
            letter = "E";
        }
        System.out.println("Primeira nota \t" + grade1);
        System.out.println("Seguda nota \t" + grade2);
        System.out.println("Media \t" + result);
        System.out.println("Conceito \t" + letter);

        switch (letter){
            case"A":
            case"B":
            case"C":
                System.out.println("Aprovado");break;
            case"D":
            case"E":
                System.out.println("Reprovado");break;
        }
    }
}
