package com.valmir.cursojava.exercicios16E17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise32 {
    /*
O cardápio de uma lanchonete é o seguinte:

o Especificação Código Preço
o Cachorro Quente 100 R$ 1,20
o Bauru Simples 101 R$ 1,30
o Bauru com ovo 102 R$ 1,50
o Hambúrguer 103 R$ 1,20
o Cheeseburguer 104 R$ 1,30
o Refrigerante 105 R$ 1,00

Faça um programa que leia o código dos itens pedidos e as
quantidades desejadas. Calcule e mostre o valor a ser pago por
item (preço * quantidade) e o total geral do pedido. Considere
que o cliente deve informar quando o pedido deve ser
encerrado.
     */

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,#.000");

        int cod, qnty;
        String output = "";
        double total = 0;
        boolean dontStop = true;


        System.out.println("Digite o item Desejado e a sua quantidade, para fianlizar digite 0");
        System.out.println("Cachorro quente = 100");
        System.out.println(" Bauru Simples = 101");
        System.out.println("Bauru com ovo = 102");
        System.out.println("Hamburguer = 103");
        System.out.println("Cheeseburguer = 104");
        System.out.println("Refrigerante = 105");


        do {
            cod = s.nextInt();
            qnty = s.nextInt();

            if (cod == 0 && qnty == 0) {

                dontStop = false;
                output += "Total a pagar = R$ " + df.format( total);

            } else if (cod == 100) {

                output += "Cachorro quente -> R$ 1,20 x " + qnty;
                output += " =  R$" + (1.20 * qnty) + "\n";
                total += 1.20 * qnty;

            } else if (cod == 101) {

                output += "Bauru Simples -> R$ 1,30 x " + qnty;
                output += " =  R$" + (1.30 * qnty) + "\n";
                total += 1.30 * qnty;

            } else if (cod == 102) {

                output += "Bauru com Ovo -> R$ 1,50 x " + qnty;
                output += " =  R$" + (1.50 * qnty) + "\n";
                total += 1.50 * qnty;

            } else if (cod == 103) {

                output += "Hamburger -> R$ 1,20 x " + qnty;
                output += " =  R$" + (1.20 * qnty) + "\n";
                total += 1.20 * qnty;

            } else if (cod == 104) {

                output += "Cheeseburger -> R$ 1,30 x " + qnty;
                output += " =  R$" + (1.30 * qnty) + "\n";
                df.format(total += 1.30 * qnty);

            } else if (cod == 105) {

                output += "Refrigerante -> R$ 1,00 x " + qnty;
                output += " =  R$" + (1.00 * qnty) + "\n";
              df.format(total +=  1.00 * qnty);

            }

        } while (dontStop);

        System.out.println(output);

    }
}
