package com.valmir.cursojava.exercicios;

import java.util.Scanner;

public class TemperatureConvertion {

    public static void main (String[] args){

        /*9. Faça um Programa que peça a temperatura em graus Farenheit,
transforme e mostre a temperatura em graus Celsius.
o C = (5 * (F-32) / 9).*/

        double celcius,farenheit;

        Scanner s = new Scanner(System.in);

        System.out.println("Digite a temperatua em Farenheit");
        farenheit = s.nextDouble();

        celcius = (5*(farenheit-32)/9);

        System.out.println("A tempreatura em Celcius é:");
        System.out.println(celcius);
    }
}
