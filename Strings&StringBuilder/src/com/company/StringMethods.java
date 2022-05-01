package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Aniket Inamdar";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println("    A".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
