package com.valmir.cursojava.exercicios;

import java.util.Scanner;

public class SquareAreaDouble {

  public static void main(String[] args) {

    // Faça um Programa que calcule a área de um quadrado, em seguida
    // mostre o dobro desta área para o usuário.

    double base;
    double area;
    double sqd;

    try (Scanner s = new Scanner(System.in)) {

      System.out.println("Digite a base do quadrado");
      base = s.nextDouble();

      area = base * base;

      System.out.println(" área = " + area);

      sqd = area * area;

      System.out.println(" Quadrado da área = " + sqd);
    }
  }
}
