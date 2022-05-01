package com.company;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 12.56789f;
        System.out.printf("%.1f",a);//printf is formatted string
        System.out.println();
        System.out.printf("%.2f",a);
        System.out.println();
        System.out.printf("%.3f",a);
        System.out.println();
        System.out.printf("%.4f",a);
        System.out.println();
        System.out.printf("%.3f",Math.PI);
//        System.out.printf("%d",Math.PI);
        System.out.println();
        System.out.println(Math.PI);
    }
}
