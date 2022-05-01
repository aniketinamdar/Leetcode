package com.company.staticExample;

import java.util.Scanner;

public class InnerClasses {
    static class Test
    {
        //only inner classes can be static and not outer classes
        String name ;

        public Test(String name)
        {
            this.name = name ;
        }
    }

    public static void main(String[] args) {
        Test a =new Test("Aniket");
        Test b =new Test("Ram");
        System.out.println(a.name);
        System.out.println(b.name);

    }
}
