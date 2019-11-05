package com.valmir.cursojava.exercicios16E17;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
/*
Escreva um programa que receba a entrada do número inteiro N, seguido por N mais números inteiros.
Para cada número inteiro. Emita o próximo número de fibonacci depois dele.

Número de Fibonacci: qualquer número que pertence à série de fibonacci.

A série Fibonacci é definida como: F (0) = 0; F (1) = 1; F (n) =
F (n – 1) + F (n – 2) quando n> 1

• Suas linhas de saída não devem ter espaços em branco à direita ou à esquerda

• Em caso de erro, sua saída deve ser 0

Restrições:

• Seu programa deve ser executado corretamente nos primeiros 60 números de Fibonacci

Entrada
3
1
9
22

Resultado
2
13
34

Explicação: 2 é o próximo número de fibonacci maior que 1,
o número de fibonacci que vem depois de 9 é 13.
34 é o próximo número de fibonacci após 22

 */
Scanner s = new Scanner(System.in);

int number, fib;

        System.out.println(" entra com um numero da sequencia de Fibonacci");
        number = s.nextInt();

        if (number > 1) {

            fib = ((number - 1) + (number - 2));
            System.out.println(fib);
        } else{
            System.out.println(0);
        }
        for (int i =0; i< 30; i++ ){

            fib = ((i - 1)+ (i-2));
            System.out.println(fib);
        }
    }
}