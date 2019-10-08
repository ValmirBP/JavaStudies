package com.valmir.cursojava.aula16;

public class LoopWhile {
    public static void main(String[]args){

        int i =1;// count ou cont
        int max =10;

        System.out.println("Contando ate" + max);

        while (i <= max){
            System.out.println("Valor de i\t" + i);
            i++; // i=i+1; ou i+=1;
        }
        System.out.println(i); // VAlor de 11

        do {
            i++;
            System.out.println("Valor de i\t" + i);
        }while (i<15);
        System.out.println(i);
    }
}
