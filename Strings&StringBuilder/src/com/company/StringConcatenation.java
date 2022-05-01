package com.company;

import java.sql.Array;
import java.util.ArrayList;

public class StringConcatenation {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println((char)('a'+4));
        System.out.println("a"+4);
        System.out.println("Aniket"+new ArrayList<>());
//        System.out.println(new Integer(45)+new ArrayList<>());//requires atleast a string or primitives fro concatenation
        String ans = new Integer(45)+""+new ArrayList<>();
        System.out.println(ans);

    }
}
