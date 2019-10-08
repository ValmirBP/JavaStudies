package com.valmir.cursojava.aula17;

public class LoopFor {

    public static void main (String[] args){
// somando
        /*
        for( int i = 0 ;i<5;i++){
            System.out.println("i tem valor de\t" + i);
        }
        // diminuindo
        for( int i = 5; i >  0; i--){
            System.out.println("i tem valor de\t" + i);
        }//associando dus var
        for (int i=0, j=10 ; i<j; i++, j--){
            System.out.println ("i = " + i + " \tj = " + j);
        } //contando de dois em dois
        for (int cont =0; cont<10; cont+=2 ){
            System.out.println(cont);
        }//argumantos separados*/
        int soma = 0;
        for (int i=1; i<5 ; soma += i++);
            System.out.println("o valor da soma eh" +soma);
        }
    }