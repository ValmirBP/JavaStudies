package com.valmir.cursojava.exercicios16E17;

public class Exercise09 {
    /*
    Faça um programa que imprima na tela apenas os números ímpares
    entre 1 e 50.
     */
    public static void main(String[] args) {


        for (int odd = 0; odd <= 50; odd++) {

            if (odd % 2 != 0) {
                System.out.print(odd + " ");
            }
        }
    }
}
