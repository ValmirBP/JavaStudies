package com.valmir.cursojava.exercicios;

import java.util.Scanner;

public class Converter {

  public static void main(String[] args) {
    // 5. Faça um Programa que converta metros para centímetros.

    double centimeters;
    double convertion;

    try (Scanner scan = new Scanner(System.in)) {

      System.out.println("CONVERSOR DE cm PARA m\n\n");
      System.out.println("Digite a medida em cm");

      centimeters = scan.nextDouble();

      System.out.println("Convertendo\n\n");

      convertion = centimeters / 100;

      System.out.println(centimeters + " Centímetros equivale a " + convertion + " Metros.");
    }
  }
}
