package com.valmir.cursojava.exercicios16E17;

import java.util.Scanner;

public class Exercise20 {
    /*
Faça um programa que peça para n pessoas a sua idade, ao final o
programa devera verificar se a média de idade da turma varia entre 0 e
25,26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta
ou idosa, conforme a média calculada.
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double age, sum = 0, result, peopleQntd;

        System.out.println("Quantidade de alunos da tuma ");
        peopleQntd = s.nextInt();

        for (int i = 0; i < peopleQntd; i++) {

            System.out.println(" Entre com a idade");
            age = s.nextInt();

            sum += age;
        }

        result = sum / peopleQntd;
        System.out.println("Media de idade eh " + result);

        if (result > 0 && result <= 25) {
            System.out.println(" Turma jovem ");

        } else if (result > 26 && result <= 60) {
            System.out.println(" Turma adulta");

        } else if (result > 60) {
            System.out.println(" Velha guarda");

        }
    }
}
