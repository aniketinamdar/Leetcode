package com.company;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        //fibonacci series
//        int a = 0 , b = 1 ;
//        int count = 2 ;
//        while (count <= n)
//        {
//            int temp = b ;
//            b = b + a ;
//            a = temp ;
//            count++;
//        }

        //System.out.println(b);

    //Reverse Number
//        int rev = 0 ;
//        while(n != 0)
//        {
//            int rem = n % 10 ;
//            rev = rev * 10 + rem ;
//            n /= 10 ;
//        }
//        System.out.println(rev);

        //Switch Cases
//        switch (n){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4 :
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("1-7");
//                break;
//        }
        //Enhanced Switch
//        switch (n) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//            default -> System.out.println("1-7");
//        }
    }
}
