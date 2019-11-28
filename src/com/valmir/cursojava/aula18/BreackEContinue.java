package com.valmir.cursojava.aula18;

import java.util.Scanner;

public class BreackEContinue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println(" entre com um numero");
        int num =s.nextInt();

        System.out.println(" entre com um limite ");
        int max = s.nextInt();

        for ( int i = num ; i<= max; i++){

            if (i%7 ==0){
                System.out.println(" O valor de i eh : " + i);
                break;
            }
        }
    }
}
