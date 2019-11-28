package com.valmir.cursojava.exercicios18E19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise4 {
    /*
    Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
mesmo tamanho, sendo que cada elemento do vetor B deverá ser a
raiz quadrada do respectivo elemento de A, ou seja:
B[i] = sqrt(A[i]).
     */

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        DecimalFormat df  = new DecimalFormat("#,##.00");

        double vetA[] = new double[3];
        double vetB[] = new double[vetA.length];

        for (int i = 0; i < vetA.length; i++) {

            System.out.println(" digite o valor para" + i );
            vetA[i] = s.nextInt();

            vetB[i] = Math.sqrt(vetA[i]);
        }

        System.out.println();
        System.out.print(" Vetor A = ");

        for (int i = 0; i < vetA.length; i++) {

            System.out.print(df.format(vetA[i] )+ " ");
        }

        System.out.println();
        System.out.print(" Vetor B = ");

        for (int i = 0; i < vetB.length; i++) {

            System.out.print(df.format(vetB[i]) + " ");
        }
    }
}
