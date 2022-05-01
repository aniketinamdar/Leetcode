package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Syntax
//        ArrayList<Integer> list = new ArrayList<>(5);
//        list.add(78);
//        list.add(98);
//        list.add(23);
//        list.add(65);
//        list.add(12);
//        list.add(87);
//        System.out.println(list);

        //Multidimensional
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(input.nextInt());
            } 
        }
        System.out.println(list);

    }
}
