package com.valmir.cursojava.exercicios14E15;

import java.util.Scanner;

public class Exercise21 {
    /*
    Um posto está vendendo combustíveis com a seguinte tabela de
descontos:
. Álcool:
a. até 20 litros, desconto de 3% por litro
b. acima de 20 litros, desconto de 5% por litro
Gasolina:
c. até 20 litros, desconto de 4% por litro
d. acima de 20 litros, desconto de 6% por litro Escreva um
algoritmo que leia o número de litros vendidos, o tipo de
combustível (codificado da seguinte forma: A-álcool, Ggasolina),
calcule e imprima o valor a ser pago pelo clientesabendo-se que o preço do litro da gasolina é R$ 2,50 o preço
do litro do álcool é R$ 1,90.
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String fuel;
        double discoutEt, discoutGas, price;
        int gallons;
        boolean valid;

        System.out.println("Ola mei rei!!!");
        System.out.println("Qual o tipo de combustivel hoje?");
        fuel = s.next();
        System.out.println("Quantos litros?");
        gallons = s.nextInt();

        valid = true;

        switch (fuel) {
            case "G":
            case "g":
                System.out.println("OK! Gasolina");
                break;
            case "E":
            case "e":
                System.out.println("OK! Etanol");
                break;
            default:
                System.out.println("Me perdoe meu rei nao entendi.");
                System.out.println("Qual combustivel mesmo? Etanol ou Gasolina? ( E ou G)");
                valid = false;
                break;
        }
        if (valid) {
            System.out.println("Quantos litros??");

            if (fuel.equalsIgnoreCase("G") && gallons > 0 && gallons <= 20) {

                discoutGas = gallons * 2.50 * 4 / 100;
                price = gallons * 2.50 - discoutGas;
                System.out.println("O valor é R$\t" + price);
                System.out.println("Disconto de  R$\t" + discoutGas);
            } else if (fuel.equalsIgnoreCase("G") && gallons > 20) {

                discoutGas = gallons * 2.50 * 6 / 100;
                price = gallons * 2.50 - discoutGas;
                System.out.println("O valor é R$\t" + price);
                System.out.println("Disconto de  R$\t" + discoutGas);
            } else if (fuel.equalsIgnoreCase("E") && gallons > 0 && gallons <= 20) {

                discoutEt = gallons * 1.90 * 3 / 100;
                price = gallons * 1.90 - discoutEt;
                System.out.println("O valor é R$\t" + price);
                System.out.println("Disconto de  R$\t" + discoutEt);
            } else if (fuel.equalsIgnoreCase("E") && gallons > 20) {

                discoutEt = gallons * 1.90 * 5 / 100;
                price = gallons * 1.90 - discoutEt;
                System.out.println("O valor é R$\t" + price);
                System.out.println("Disconto de  R$\t" + discoutEt);
            }
        }
    }
}
