package com.valmir.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int weekDay;
        System.out.println("digite um numero de 1 a 7");
        weekDay = s.nextInt();
/*
        if (weekDay == 1) {
            System.out.println("Domingo");
        } else if (weekDay == 2) {
            System.out.println("Segunda");
        } else if (weekDay == 3) {
            System.out.println("Terca");
        } else if (weekDay == 4) {
            System.out.println("Quarta");
        } else if (weekDay == 5) {
            System.out.println("Quinta");
        } else if (weekDay == 6) {
            System.out.println("Sexta");
        } else if (weekDay == 7) {
            System.out.println("Sabado");
        } else {
            System.out.println("Dia incorreto. deve estar ompreendido entre 1 e 7\n digitado foi\t" + weekDay);
        }*/

        switch (weekDay){
            case 1: System.out.println("Domingo");break;// break é como o fechamento do parentesis do is else
            case 2: System.out.println("segunda");break;
            case 3: System.out.println("terça");break;
            case 4: System.out.println("quarta");break;
            case 5: System.out.println("quinta");break;
            case 6: System.out.println("sexta");break;
            case 7: System.out.println("sabado");break;
            default: System.out.println("Dia incorreto. deve estar ompreendido entre 1 e 7\n digitado foi\t" + weekDay);
            // defaut é o código caso nenhum dos cases seja valido.
        }

    }
}
