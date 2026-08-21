package com.valmir.cursojava.exercicios;

import java.util.Scanner;

public class ReadingNumber {

  public static void main(String[] args) {

    // 2. Faça um Programa que peça um número e então mostre a
    // mensagem O número informado foi [número].

    Scanner scan = new Scanner(System.in);

    System.out.println("digite um número");
    double number = scan.nextDouble();
    System.out.println("Seu número digitado foi: " + number);
  }
}
