package com.valmir.cursojava.exercicios14E15;

import java.util.Scanner;

public class Exercise05 {

    //5. Faça um programa para a leitura de duas notas parciais de um aluno.
    //O programa deve calcular a média alcançada por aluno e apresentar:
    //o A mensagem "Aprovado", se a média alcançada for maior ou
    //igual a sete;
    //o A mensagem "Reprovado", se a média for menor do que sete;
    //o A mensagem "Aprovado com Distinção", se a média for igual a
    //dez.

    public static void main(String[] args) {
        double grade1, grade2;
        double partialGrade;

        Scanner s = new Scanner(System.in);

        System.out.println("Digite duas notas");

        grade1 = s.nextDouble();
        grade2 = s.nextDouble();

        partialGrade = (grade1 + grade2) / 2;

        if (partialGrade == 10.00) {
            System.out.println("Aprovado com distinção");
        } else if (partialGrade >= 7.00) {
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
    }
}
