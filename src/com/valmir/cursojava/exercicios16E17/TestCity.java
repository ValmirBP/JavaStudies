package com.valmir.cursojava.exercicios16E17;

public class TestCity {
    public static void main (String[] args ){

        int popa = 80000;
        int popb = 200000;
        int conta = 0;

        while (popa < popb) {

            popa += (popa / 100) * 3;
            popb += (popb / 100) * 1.5;
            conta++;
        }

        System.out.println("População A: " + popa);
        System.out.println("População B: " + popb);
        System.out.println("Qtd anos:     " + conta);
    }
    }
