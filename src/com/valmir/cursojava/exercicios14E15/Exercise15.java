package com.valmir.cursojava.exercicios14E15;

import java.util.Scanner;

public class Exercise15 {
    /*
Faça um Programa que peça os 3 lados de um triângulo. O programa
deverá informar se os valores podem ser um triângulo. Indique, caso
os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou
escaleno.
o Dicas:
o Três lados formam um triângulo quando a soma de quaisquer
dois lados for maior que o terceiro;
o Triângulo Equilátero: três lados iguais;
o Triângulo Isósceles: quaisquer dois lados iguais;
o Triângulo Escaleno: três lados diferentes;
     */
    public static void main (String [] args){

        int side1,side2,side3;
        Scanner s = new Scanner(System.in);

        System.out.println(" entre com a medidida do lado A do trinagulo");
        side1 = s.nextInt();

        System.out.println(" entre com a medidida do lado B do trinagulo");
        side2 = s.nextInt();

        System.out.println(" entre com a medidida do lado C do trinagulo");
        side3 = s.nextInt();

        if( (side1+side2)> side3 ||
                (side1+ side3)> side2 ||
                (side3+side2)>side1){

            System.out.println(" Eh um triangulo");

            if(side1 == side2 && side1 == side3 && side2 == side3){
                System.out.println("Trangulo equilatero");
            }else if (side1 != side2 && side1 != side3 && side2 != side3){
                System.out.println(" Trangulo Escaleno");
            }else if ( side1 == side2 || side1 == side3 || side2 == side3){
                System.out.println("Traingulo Isoceles");
            }

        }else {
            System.out.println(" não é um triangulo");
        }
    }
}
