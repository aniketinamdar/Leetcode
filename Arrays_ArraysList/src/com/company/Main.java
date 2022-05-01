package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Declaration syntax of array
//        data_type[] var_name = new data_type[size]
        int[] arr = new int[10]; //declaration & initialization
        // int[] arr -->declaration compile time
        // arr = new int[5] -->initialization in heap memory
        //runtime(dynamic memory allocation)
        for (int i = 0; i < 10 ; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < 10 ; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int num : arr){
            System.out.println(num);

        }


    }


}

