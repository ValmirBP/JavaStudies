package com.valmir.cursojava.exercicios16E17;

import java.util.Scanner;

public class Exercise21 {
    /*
    Faça um programa que calcule o número médio de alunos por turma.
Para isto, peça a quantidade de turmas e a quantidade de alunos para
cada turma. As turmas não podem ter mais de 40 alunos.
     */

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double average = 0;
        double sum = 0;
        int qtyclass, qtydStud;
        boolean valid;

        System.out.println(" entre com a quantidade de tumas");
        qtyclass = s.nextInt();

        for (int i = 1; i <= qtyclass; i++) {

            valid = true;

            do {

                System.out.println(" entre com o nomero de alunos da turma " + i);
                qtydStud = s.nextInt();

                if (qtydStud <= 40) {
                    valid = false;
                } else {
                    System.out.println(" Atencao: Quantidade superior, a quantidade de alunos nao pode ser maior que 40 Digite novamente ");
                }

            } while (valid);

            sum += qtydStud;
            average = sum / qtyclass;

        }

        System.out.println(" a media de alunos eh " + average);
    }
}
