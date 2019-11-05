package com.valmir.cursojava.exercicios16E17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise25 {

    /*
    O Sr. Manoel Joaquim expandiu seus negócios para além dos
negócios de 1,99 e agora possui uma loja de conveniências. Faça um
programa que implemente uma caixa registradora rudimentar. O
programa deverá receber um número desconhecido de valores
referentes aos preços das mercadorias. Um valor zero deve ser
informado pelo operador para indicar o final da compra. O programa
deve então mostrar o total da compra e perguntar o valor em dinheiro
que o cliente forneceu, para então calcular e mostrar o valor do troco.
Após esta operação, o programa deverá voltar ao ponto inicial, para
registrar a próxima compra. A saída deve ser conforme o exemplo
abaixo:
o Lojas Tabajara
o Produto 1: R$ 2.20
o Produto 2: R$ 5.80
o Produto 3: R$ 0
o Total: R$ 9.00
o Dinheiro: R$ 20.00
o Troco: R$ 11.00
o ...
     */

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,##0.00");

        double qntyItens, value, total = 0, money, change;

        System.out.println("Digite a quantidade de itens");
        qntyItens = s.nextDouble();

        for (int i = 1; i <= qntyItens; i++) {

            System.out.println(" Valor do produto " + i);
            value = s.nextDouble();

            total += value;

            System.out.println("Produto " + i + " : R$ " + value + "\n");
        }
        System.out.println("Total: \t R$ " + total + "\n");

        System.out.println(" valor pago:");
        money = s.nextDouble();

        System.out.println("Dinheiro: \t R$ " + money + "\n");

        change = money - total;

        System.out.println(" Troco: \t R$ " + change);
    }
}
