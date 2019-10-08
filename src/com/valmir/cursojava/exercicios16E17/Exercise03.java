package com.valmir.cursojava.exercicios16E17;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Exercise03 {
    /*
    Faça um programa que leia e valide as seguintes informações:
    a. Nome: maior que 3 caracteres;
    b. Idade: entre 0 e 150;
    c. Salário: maior que zero;
    d. Sexo: 'f' ou 'm';
    e. Estado Civil: 's', 'c', 'v', 'd';
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age;
        double wage;
        String name, sex, civilState;
        boolean valid = false;

        do {
            System.out.println("Entre com seu nome: ");
            name = s.next();

            if (name.length() >= 3) {

                valid = true;
            } else {
                System.out.println("Nome precisa no mínimo 3 caracteres.");
            }
        } while (!valid);

        do {
            System.out.println("Entre com sua idade: ");
            age = s.nextInt();

            if (age >= 0 && age <= 150) {

                valid = true;
            } else {
                valid = false;
                System.out.println("Idade invalida!");
                System.out.println(" Idade deve estar entre 0 e 150");

            }
        } while (!valid);

        do {
            System.out.println("Entre com seu sexo: ");
            sex = s.next();

            if (sex.equalsIgnoreCase("M") || sex.equalsIgnoreCase("F")) {

                valid = true;
            } else {
                valid = false;
                System.out.println("Sexo invalido!");
                System.out.println(" Sexo deve ser Masculino  (M) ou Feminino (F)");
            }
        } while (!valid);

        do {

            System.out.println("Entre com seu estado civil: ");
            civilState = s.next();

            if (civilState.equalsIgnoreCase("S") || civilState.equalsIgnoreCase("C") ||
                    civilState.equalsIgnoreCase("V") || civilState.equalsIgnoreCase("D")) {

                valid = true;

            } else {
                valid = false;
                System.out.println("Estado civil invalido!");
                System.out.println(" Estado civil deve ser Solteiro (S) ou Casado (C)" +
                        " Viuvo (V) ou Divorciado (D)");
            }
        } while (!valid);

        do {
            System.out.println("Entre com seu salario: ");
            wage = s.nextDouble();

            if (wage > 0) {

                valid = true;
            } else {
                valid = false;
                System.out.println("salario invalido!");
                System.out.println(" Salario deve ser maior que 0 ");
            }
        } while (!valid);
        System.out.println("INFORMACAO COMPLETA: ");
        System.out.println("NOME:\t" + name);
        System.out.println("IADADE:\t" + age);
        System.out.println("SEXO:\t" + sex);
        System.out.println("ESTADO CIVIL:\t" + civilState);
        System.out.println("SALARIO:\t" + wage);
    }
}

