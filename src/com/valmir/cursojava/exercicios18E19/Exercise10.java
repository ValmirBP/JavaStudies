package com.valmir.cursojava.exercicios18E19;

import java.util.Scanner;

public class Exercise10 {
    /*
    10. Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o resto da divisão do respectivo elemento de A por 2 (dois), ou
seja: B[i] := A[i] % 2.
     */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] vetA = new int[3];
        int[] vetB = new int[vetA.length];

        for ( int i = 0; i< vetA.length; i++ ){
            System.out.println(" Digite um valor para A " + i );
            vetA[i] = s.nextInt();

            vetB[i] = vetA[i] % 2;

        }

        System.out.println();
        System.out.print("vetor A =");

        for ( int i = 0; i< vetA.length;i++){

            System.out.print(vetA[i] + " ");
        }

        System.out.println();
        System.out.print("vetor B =");

        for ( int i = 0; i< vetB.length;i++){

            System.out.print(vetB[i] + " ");
        }
    }
}
