package com.sau.flowcontrol;

public class MyclassCF03 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5){
            System.out.print(".Hi.");
            i = i+1;
        }
        System.out.println();
        System.out.println("----------------------------");

        int j = 1;
        do {
            System.out.print(".Hey.");
            j = j + 1 ;
        }while (j <= 5);
        System.out.println();
        System.out.println("----------------------------");


        for ( int x = 1; x <= 5; x = x + 1){
            System.out.print(".Hoo.");
        }
    }
}
