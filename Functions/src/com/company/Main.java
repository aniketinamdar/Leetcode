package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int[] arr = new int[a] ;
        for (int i = 0 ; i < a ; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0 ; i < a ; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }


}
