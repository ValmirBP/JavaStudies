package com.valmir.cursojava.exercicios;

import java.util.Scanner;

public class Internet {

    public static void main ( String [] args){

        /*14. Faça um programa que peça o tamanho de um arquivo para download
(em MB) e a velocidade de um link de Internet (em Mbps), calcule e
informe o tempo aproximado de download do arquivo usando este link
(em minutos).*/

        double size,mbps,min,time;

        Scanner s = new Scanner(System.in);

        System.out.println("Qual o tamanho do arquivo (MB)");
        size = s.nextDouble();
        System.out.println("Qual a velocidade da rede (MB)");
        mbps = s.nextDouble();

        time = size/mbps;
        min = time/60;
        System.out.println("Tempo estimado é  = " + min + " min");
    }
}
