package com.valmir.cursojava.exercicios;

import java.util.Scanner;

public class SumOfTwoNumbers {

  public static void main(String[] args) {

    // 3. Faça um Programa que peça dois números e imprima a soma.

    double num1;
    double num2;
    double result;

    try (Scanner scan = new Scanner(System.in)) {

      System.out.print("Digite o primeiro Número: ...\n");
      num1 = scan.nextDouble();

      System.out.print("Numero digitado:\t" + num1);
      System.out.print("\nArmazenado com sucesso...\n\n");

      System.out.print("Digite o segundo Número: ...\n");
      num2 = scan.nextDouble();

      System.out.print("Numero digitado: \n\n" + num2);
      System.out.print("\nArmazenado com sucesso ...\n\n");
      System.out.print("Calculando a soma...\n\n");

      result = num1 + num2;

      System.out.print("A soma entre os números é:\n");
      System.out.print(result);
    }
  }
}
