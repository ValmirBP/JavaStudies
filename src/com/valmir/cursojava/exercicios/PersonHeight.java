package com.valmir.cursojava.exercicios;

import java.util.Scanner;

public class PersonHeight {

    public static void main(String[]args){

        /* 12. Tendo como dados de entrada a altura de uma pessoa, construa um
algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
(72.7*altura) - 58*/

        double height, result;

        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua altura");
        height = s.nextDouble();

        result = (72.7*height)-58;

        System.out.println("seu peso ideal é " + result);

    }
}
