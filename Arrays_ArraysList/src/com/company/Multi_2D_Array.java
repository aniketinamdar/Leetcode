package com.company;

import java.util.Scanner;

public class Multi_2D_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr2D = new int[3][3];
        for (int row = 0; row < arr2D.length ; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                arr2D[row][col] = input.nextInt();
            }
        }
        for (int row = 0; row < arr2D.length ; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                System.out.print(arr2D[row][col]+" ");
            }
            System.out.println();
        }

    }
}
