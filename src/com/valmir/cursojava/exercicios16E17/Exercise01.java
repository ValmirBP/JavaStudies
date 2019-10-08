package com.valmir.cursojava.exercicios16E17;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        boolean valid = false;
        do {
            System.out.println("Entre com a nota ");

            double nota = s.nextDouble();
            if (nota >= 0 && nota <= 10) {
                valid = true;
                System.out.println("giitou " + nota);
            } else {
                System.out.println("nota isnvalida");
            }
        } while (!valid);
    }
}

