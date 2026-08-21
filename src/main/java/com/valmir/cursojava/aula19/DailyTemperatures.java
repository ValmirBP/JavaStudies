package com.valmir.cursojava.aula19;

/*
Armazenar a temperatura diaria
 */

public class DailyTemperatures {
  public static void main(String[] args) {

    double temp[] = new double[365];
    temp[0] = 31.3;
    temp[1] = 31.3;
    temp[2] = 31.3;
    temp[3] = 33.1;
    temp[4] = 34;
    temp[5] = 33.3;
    temp[6] = 32.1;
    temp[7] = 30;
    temp[8] = 31.8;
    temp[9] = 31.5;

    System.out.println(" temperatura do dia 3 " + temp[2]);

    System.out.println("Tamanho do array " + temp.length);

    System.out.println(" valores do array");

    for (double tempe : temp) {
      System.out.println(tempe);
    }
  }
}
