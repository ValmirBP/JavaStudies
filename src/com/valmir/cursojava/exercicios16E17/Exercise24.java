package com.valmir.cursojava.exercicios16E17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise24 {
    /*
O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende
implantar a metodologia da tabelinha, que já é um sucesso na sua loja
de 1,99. Você foi contratado para desenvolver o programa que monta
a tabela de preços de pães, de 1 até 50 pães, a partir do preço do pão
informado pelo usuário, conforme o exemplo abaixo:

Preço do pão: R$ 0.18
o Panificadora Pão de Ontem - Tabela de preços
o 1 - R$ 0.18
o 2 - R$ 0.36
o ...
o 50 - R$ 9.00
     */

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,##0.00");

        double breadValue;

        System.out.println("Qual o preco do pao");
        breadValue = s.nextDouble();
        System.out.println("preco do pao R$ " + breadValue);

        for (int i = 1; i <= 50; i++) {

            System.out.println(i + " - R$ " + df.format(i * breadValue));
        }
    }
}
