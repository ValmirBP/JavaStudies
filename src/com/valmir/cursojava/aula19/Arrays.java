package com.valmir.cursojava.aula19;

/*
Armazenar a temperatura diaria
 */

public class Arrays {
    public static void main(String[] args) {

        double dayTemp001 = 31.3;
        double dayTemp002 = 32;
        double dayTemp003 = 33.7;
        double dayTemp004 = 34;
        double dayTemp005 = 33.1;
        double dayTemp006 = 32.8;
        double dayTemp007 = 30;
        double dayTemp008 = 29.8;
        double dayTemp009 = 31.5;

        double temp[] = new double[365];
        temp[0] = 31.3;
        temp[1] = 31.3;
        temp[2] = 31.3;
        temp[3] = 33.1;
        temp[4] = 34;
        temp[5] = 33.3;
        temp[6] = 32.1;
        temp[7] = 30;
        temp[8] = 31.8;
        temp[9] = 31.5;

        System.out.println(" temperatura do dia 3 " + temp[2]);

        System.out.println("Tamanho do array " + temp.length);

        System.out.println(" valores do arrey");

        /*for (int i = 0; i <= temp.length; i++) { // conseguimos verificar a a posição da iteração

            System.out.println("valor da temperatura do dia " + (i + 1) + " eh " + temp[i]);

        } */

        for (double tempe : temp){
            System.out.println( tempe);
        }
    }
}
