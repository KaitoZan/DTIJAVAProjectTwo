package com.sau.flowcontrol;

public class MyClassCF04 {
    public static void main(String[] args) {
        for ( int x = 1; x <= 5; x++){
            if (x == 3){
                break;
            }
            System.out.print(x+".Hoo.");
        System.out.println("+++++++++++++++++++");
        } for ( int x = 1; x <= 5; x++){
            if (x == 3){
                continue;
            }
            System.out.print(x+".Hoo.");
        }
    }
}
