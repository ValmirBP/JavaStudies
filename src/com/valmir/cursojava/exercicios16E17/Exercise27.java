package com.valmir.cursojava.exercicios16E17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise27 {
    /*
    O Departamento Estadual de Meteorologia lhe contratou para
desenvolver um programa que leia as um conjunto indeterminado de
temperaturas, e informe ao final a menor e a maior temperaturas
informadas, bem como a média das temperaturas.
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.00");

        double temp, qntytemp, averageTemp;
        double sumTemp = 0;
        double higherTemp  = Double.MIN_VALUE; // na primeira condição o valor já é trocado
        double lowerTemp = Double.MAX_VALUE; // na primeira condição o valor já é trocado

        System.out.println(" Quantidade de dias medidos");
        qntytemp = s.nextDouble();

        for ( int i = 1; i<=qntytemp; i++){

            System.out.println(" Entre com a tempretura do dia " + i);
            temp = s.nextDouble();

            sumTemp += temp;

            if ( temp > higherTemp){

                higherTemp = temp;
            }

            if (temp < lowerTemp){

                lowerTemp = temp;

            }
        }

        averageTemp = sumTemp/qntytemp;

        System.out.println("A media das tempreturas foram de: " + df.format(averageTemp));
        System.out.println("A alta foi de: " + higherTemp);
        System.out.println("A baixa foi de  " + lowerTemp);

    }
}
