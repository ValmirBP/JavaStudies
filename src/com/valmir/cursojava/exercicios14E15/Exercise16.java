package com.valmir.cursojava.exercicios14E15;

import java.util.Scanner;

public class Exercise16 {
    /*
        Faça um programa que calcule as raízes de uma equação do segundo
grau, na forma ax2 + bx + c. O programa deverá pedir os valores de a,
b e c e fazer as consistências, informando ao usuário nas seguintes
situações:
a. Se o usuário informar o valor de A igual a zero, a equação não é
do segundo grau e o programa não deve fazer pedir os demais
valores, sendo encerrado;
b. Se o delta calculado for negativo, a equação não possui raizes
reais. Informe ao usuário e encerre o programa;
c. Se o delta calculado for igual a zero a equação possui apenas
uma raiz real; informe-a ao usuário;
d. Se o delta for positivo, a equação possui duas raiz reais;
informe-as ao usuário;
         */
    public static void main(String[] args ){
        double var1,var2,var3,delta,root1,root2;
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o valor de A");
        var1=s.nextDouble();

        if ( var1 == 0 ){
            System.out.println(" o valor de A nao pode ser 0");
            System.out.println("nao caracteriza uma equacao de sogundo grau");
            System.out.println("digitado"+ var1);
        }else {

            System.out.println("Digite o valor de B");
            var2=s.nextDouble();
            System.out.println(" digitado "+ var2);

            System.out.println("Digite o valor de C");
            var3=s.nextDouble();
            System.out.println(" digitado "+ var3);

            delta = (var2 * var2) - (4 * var1 * var3);

            if (delta<0){

                System.out.println("O valor de Δ eh " + delta);
                System.out.println("A equacao nao possui raizes reais ");
            }else{

                System.out.println("Δ " + delta);

                root1 = ((-var2)+ Math.sqrt(delta)) / (2*var1);
                root2 = ((-var2)- Math.sqrt(delta)) / (2*var1);

                System.out.println("X1 = " + root1);
                System.out.println("X2 = " + root2);
            }
        }
    }
}
