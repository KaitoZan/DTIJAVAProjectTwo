package com.sau.flowcontrol;

public class MyClassCF01 {
    public static void main(String[] args) {

        int a = 50;
        if (a > 35){
            System.out.println("Hello...");
        }
        System.out.println("--------------------------");

        String b = "xyz";

        if (b.equals("SAU") ){
            System.out.println("Southeast Asia University");
        }else {
            System.out.println("NO.");
        }
    }
}
