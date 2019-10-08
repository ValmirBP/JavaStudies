package com.valmir.cursojava.exercicios;

import java.util.Scanner;

public class TemperatureConversion2 {

    public static void main(String[] args) {

        /*10. Faça um Programa que peça a temperatura em graus Celsius,
transforme e mostre em graus Farenheit.o ( °C × 9/5) + 32 = °F*/

        double celcius, farenheit;

        Scanner s = new Scanner(System.in);

        System.out.println("Digite a temperatua em Celcius");
        celcius = s.nextDouble();

        farenheit = (celcius * 9/5) +32;

        System.out.println("A tempreatura em Farenheit é:");
        System.out.println(farenheit);
    }
}