package com.company;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter roll number : ");
        int roll_num = input.nextInt();
        System.out.println("Roll number = "+ roll_num );
    }
}
