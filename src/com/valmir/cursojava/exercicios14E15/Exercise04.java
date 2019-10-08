package com.valmir.cursojava.exercicios14E15;

import java.util.Scanner;

public class Exercise04 {

    //4. Faça um Programa que verifique se uma letra digitada é vogal ou
    //consoante.

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Digite uma letra");
        String value1 = s.next();

        /*if (value1.equalsIgnoreCase("a")||value1.equalsIgnoreCase("e")
        ||value1.equalsIgnoreCase("i")||value1.equalsIgnoreCase("o")||
        value1.equalsIgnoreCase("u")){

            System.out.println("é vogal");

        }else {
            System.out.println("é  consoante");

        }*/
        switch (value1) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println("Vogal");
                break;
            default:
                System.out.println("Consoante");
        }
    }
}