package com.valmir.cursojava.exercicios16E17;

import java.util.Scanner;

public class Exercise02 {
    /*
    2. Faça um programa que leia um nome de usuário e a sua senha e não
aceite a senha igual ao nome do usuário, mostrando uma mensagem
de erro e voltando a pedir as informações.
     */
    public static void main(String[] args ) {

        Scanner s = new Scanner(System.in);

        String name, password;
        boolean valid = true;

        do {
            System.out.println("digite o usuário");
            name = s.next();
            System.out.println("senha");
            password = s.next();
            if (name.equalsIgnoreCase(password) && password.equalsIgnoreCase(name)) {
                valid =false;
                System.out.println("Invalido!");
                System.out.println("Nome e senha nao podem ser iguais");

            } else {
                System.out.println("Usuario: " + name);
                System.out.println("Senha: " + password);
            }
        } while (!valid);
    }
}
