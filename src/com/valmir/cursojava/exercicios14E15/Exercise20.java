package com.valmir.cursojava.exercicios14E15;

import java.util.Scanner;

public class Exercise20 {
    /*
    Faça um programa que faça 5 perguntas para uma pessoa sobre um
crime. As perguntas são:
. "Telefonou para a vítima?"
a. "Esteve no local do crime?"
b. "Mora perto da vítima?"
c. "Devia para a vítima?"
d. "Já trabalhou com a vítima?" O programa deve no final emitir
uma classificação sobre a participação da pessoa no crime. Se
a pessoa responder positivamente a 2 questões ela deve ser
classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5
como "Assassino". Caso contrário, ele será classificado como
"Inocente".
     */
    public static void main(String[]args ){
        Scanner scan = new Scanner(System.in);
        String quest1,quest2,quest3,quest4,quest5;
        int posAnwr =0;

        System.out.println("Telefonou paara a vitima");
        quest1= scan.next();
        System.out.println("Esteve no local do crime");
        quest2= scan.next();
        System.out.println("Mora perto da vitima");
        quest3= scan.next();
        System.out.println("Trabalho com a vitima ");
        quest4= scan.next();
        System.out.println("Devia para a vitima");
        quest5= scan.next();

        if (quest1.equalsIgnoreCase("S")){
            posAnwr++;

        }if (quest2.equalsIgnoreCase("S")){
            posAnwr++;

        }if (quest3.equalsIgnoreCase("S")){
            posAnwr++;

        }if (quest4.equalsIgnoreCase("S")){
            posAnwr++;

        }if (quest5.equalsIgnoreCase("S")){
            posAnwr++;

        }if (posAnwr == 2){
            System.out.println("suspeito");

        }else if (posAnwr == 3 || posAnwr == 4){
            System.out.println("Cumplice");

        }else if (posAnwr == 5 ){
            System.out.println("assassino clebs");

        }else {
            System.out.println(" inocente");
        }

    }
}
