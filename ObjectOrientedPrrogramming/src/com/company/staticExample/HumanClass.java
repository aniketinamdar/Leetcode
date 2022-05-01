package com.company.staticExample;

public class HumanClass {
    int age ;
    String name ;
    int salary ;
    boolean married ;
    static long population ;

    static void message()
    {
        System.out.println("Hello World !");
//        System.out.println(this.age); will not work
    }

    public HumanClass(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        HumanClass.population += 1 ;

        HumanClass.message();
    }
}
