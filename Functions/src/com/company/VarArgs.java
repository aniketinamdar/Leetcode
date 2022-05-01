package com.company;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun( 2 , 4 , 6 , 10); //Variable length arguments
    }
    static void fun(int ...v) //Variable length arguments
            //string ...s
    {
        System.out.println(Arrays.toString(v));
    }
}
