package com.sau.workshop;

import java.util.Scanner;

public class SumProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double x1,x2,sum;

        do {
//            System.out.println("-----------------------");
            System.out.print("Input number 1 : ");
            x1 = sc.nextDouble();
            System.out.print("Input number 2 : ");
            x2 = sc.nextDouble();
            sum = x1 + x2;
            System.out.println(x1+" + "+x2+" = "+sum);
            System.out.println("-----------------------");
        }
            while (sum <= 500) ;

    }
}
