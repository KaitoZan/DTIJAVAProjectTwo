package com.sau.workshop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaProject01 {
    public static void main(String[] args) {
        int menu;
        double n1, n2, rs;

        DecimalFormat nm = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);

        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("      Shape Area Program");
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("1. Square Area");
        System.out.println("2. Triangle Area");
        System.out.println("3. Circle Area");
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.print("Select menu (1,2,3): ");
        menu = sc.nextInt();
        System.out.println("+++++++++++++++++++++++++++++++");
        if (menu == 1) {
            System.out.print("Input widths : ");
            n1 = sc.nextDouble();
            System.out.print("Input langs : ");
            n2 = sc.nextDouble();
            rs = n1 * n2;
            System.out.print("Area of Square is : "+nm.format(rs));
        }else if(menu == 2){
            System.out.print("Input bases : ");
            n1 = sc.nextDouble();
            System.out.print("Input hights : ");
            n2 = sc.nextDouble();
            rs = n1 * n2 / 2;
            System.out.print("Area of Triangle is : "+nm.format(rs));
        }else if (menu == 3){
            System.out.print("Input radius : ");
            n1 = sc.nextDouble();
            rs = (3.14* Math.pow(n1,2));
            System.out.println("Area of Circle is : "+nm.format(rs));
        }else {
            System.out.println("Thank you Bye bye ♥");
        }


    }
}
