package com.valmir.cursojava.exercicios14E15;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String fuel;
        double discoutEt, discoutGas, price;
        int gallons;
        boolean valid;

        valid = false;
        System.out.println("Ola mei rei!!!");
        System.out.println("Qual combustivel hoje? Etanol ou Gasolina? ( E ou G)");

        do {

            fuel = s.next();

            switch (fuel) {
                case "G":
                case "g":
                    System.out.println("OK! Gasolina");
                    valid = true;
                    break;
                case "E":
                case "e":
                    System.out.println("OK! Etanol");
                    valid = true;
                    break;
                default:
                    System.out.println("Me perdoe meu rei nao entendi.");
                    System.out.println("Qual combustivel mesmo? Etanol ou Gasolina? ( E ou G)");
                    valid = false;
                    break;
            }

        } while (!valid);


        System.out.println("Quantos litros?");
        gallons = s.nextInt();

        if (fuel.equalsIgnoreCase("G") && gallons > 0 && gallons <= 20) {

            discoutGas = gallons * 2.50 * 4 / 100;
            price = gallons * 2.50 - discoutGas;
            System.out.println("O valor é R$\t" + price);
            System.out.println("Desconto de  R$\t" + discoutGas);
        } else if (fuel.equalsIgnoreCase("G") && gallons > 20) {

            discoutGas = gallons * 2.50 * 6 / 100;
            price = gallons * 2.50 - discoutGas;
            System.out.println("O valor é R$\t" + price);
            System.out.println("Desconto de  R$\t" + discoutGas);
        } else if (fuel.equalsIgnoreCase("E") && gallons > 0 && gallons <= 20) {

            discoutEt = gallons * 1.90 * 3 / 100;
            price = gallons * 1.90 - discoutEt;
            System.out.println("O valor é R$\t" + price);
            System.out.println("Desconto de  R$\t" + discoutEt);
        } else if (fuel.equalsIgnoreCase("E") && gallons > 20) {

            discoutEt = gallons * 1.90 * 5 / 100;
            price = gallons * 1.90 - discoutEt;
            System.out.println("O valor é R$\t" + price);
            System.out.println("Desconto de  R$\t" + discoutEt);
        }
    }
}
