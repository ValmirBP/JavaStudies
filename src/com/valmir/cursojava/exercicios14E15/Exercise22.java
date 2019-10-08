package com.valmir.cursojava.exercicios14E15;

import java.util.Scanner;

public class Exercise22 {
    /*
22. Uma fruteira está vendendo frutas com a seguinte tabela de preços:

   Até 5 Kg                     Acima de 5 Kg
Morango R$ 2,50 por         Kg R$ 2,20 por Kg
Maçã R$ 1,80 por            Kg R$ 1,50 por Kg

Se o cliente comprar mais de 8 Kg em frutas ou o valor total da
compra ultrapassar R$ 25,00, receberá ainda um desconto de
10% sobre este total. Escreva um algoritmo para ler a
quantidade (em Kg) de morangos e a quantidade (em Kg) de
maças adquiridas e escreva o valor a ser pago pelo cliente.
     */

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double appledwn5 = 2.50;
        double appleup5 = 2.20;
        double strwdwn5 = 1.80;
        double strwup5 = 1.50;
        double pricePay, pricedisc, discout, pricePayAp,
                pricePaySt, total, disAp, disSt;
        int weight;

        String fruit;


        System.out.println("quais frutas ");
        System.out.println("Morarango (Mo) Maça(M) ou as duas (MMo)");
        fruit = s.next();

        System.out.println("Quantos KG comprados");
        weight = s.nextInt();

// SOMMENTE MAÇA

        // MAÇÃ ABAIXO DE 5 Kg
        if (fruit.equalsIgnoreCase("M") && weight > 0 && weight <= 5) {

            pricePay = weight * appledwn5;
            System.out.println("Valor a ser pago eh R$\t" + pricePay);

            // MAÇÃ ACIMA DE 5Kg

        } else if (fruit.equalsIgnoreCase("M") && weight > 5 && weight < 8) {

            pricePay = weight * appleup5;
            System.out.println("Valor a ser pago eh R$\t" + pricePay);

            // MAÇÃ ACIMA DE 8Kg

        } else if (fruit.equalsIgnoreCase("M") && weight >= 8) {

            pricePay = weight * appleup5;
            discout = 10 / 100 * pricePay;
            pricedisc = pricePay - discout;

            System.out.println("Valor total eh R$\t" + pricePay);
            System.out.println("Valor do desconto eh R$\t" + discout);
            System.out.println("Valor a ser pago eh R$\t" + pricedisc);

            // PREÇO ACIMA DE 25

            if (pricePay >= 25) {
                System.out.println("Valor total eh R$\t" + pricePay);
                System.out.println("Valor do desconto eh R$\t" + discout);
                System.out.println("Valor a ser pago eh R$\t" + pricedisc);
            }

            // SOMENTO MORANGO

        } else if (fruit.equalsIgnoreCase("Mo") && weight > 0 && weight <= 5) {

            pricePay = weight * strwdwn5;
            System.out.println("Valor a ser pago eh R$\t" + pricePay);

        } else if (fruit.equalsIgnoreCase("Mo") && weight > 5 && weight < 8) {

            pricePay = weight * strwup5;
            System.out.println("Valor a ser pago eh R$\t" + pricePay);

        } else if (fruit.equalsIgnoreCase("Mo") && weight >= 8) {

            pricePay = weight * strwup5;
            discout = 10 / 100 * pricePay;
            pricedisc = pricePay - discout;

            System.out.println("Valor total eh R$\t" + pricePay);
            System.out.println("Valor do desconto eh R$\t" + discout);
            System.out.println("Valor a ser pago eh R$\t" + pricedisc);

            if (pricePay >= 25) {
                System.out.println("Valor total eh R$\t" + pricePay);
                System.out.println("Valor do desconto eh R$\t" + discout);
                System.out.println("Valor a ser pago eh R$\t" + pricedisc);
            }

            // DUAS FRUTAS

        } else if (fruit.equalsIgnoreCase("MMo") && weight > 0 && weight <= 5) {

            pricePayAp = weight * appledwn5;
            pricePaySt = weight * strwdwn5;
            total = pricePayAp + pricePaySt;

            System.out.println("Valor do peso da maca R$\t" + pricePayAp);
            System.out.println("Valor do peso do morango R$\t" + pricePaySt);
            System.out.println("Valor a ser pago eh R$\t" + total);

        } else if (fruit.equalsIgnoreCase("MMo") && weight > 5 && weight < 8) {

            pricePayAp = weight * appleup5;
            pricePaySt = weight * strwup5;
            total = pricePayAp + pricePaySt;

            System.out.println("Valor do peso da maca R$\t" + pricePayAp);
            System.out.println("Valor do peso do morango \t" + pricePaySt);
            System.out.println("Valor a ser pago eh R$\t" + total);

        } else if (fruit.equalsIgnoreCase("MMo") && weight >= 8) {

            pricePayAp = weight * appleup5;
            pricePaySt = weight * strwup5;
            disAp = 10 / 100 * pricePayAp;
            disSt = 10 / 100 * pricePaySt;
            total = disAp + disSt;

            System.out.println("Valor do peso da maca R$\t" + pricePayAp);
            System.out.println("Valor do peso do morango \t" + pricePaySt);
            System.out.println("Valor do desconto do morango \t" + disAp);
            System.out.println("Valor do desconto do morango \t" + disSt);
            System.out.println("Valor a ser pago eh R$\t" + total);

            if (pricePayAp >= 25 && pricePaySt >= 25) {

                System.out.println("Valor do peso da maca R$\t" + pricePayAp);
                System.out.println("Valor do peso do morango \t" + pricePaySt);
                System.out.println("Valor do desconto do morango \t" + disAp);
                System.out.println("Valor do desconto do morango \t" + disSt);
                System.out.println("Valor a ser pago eh R$\t" + total);
            }
        }
    }
}