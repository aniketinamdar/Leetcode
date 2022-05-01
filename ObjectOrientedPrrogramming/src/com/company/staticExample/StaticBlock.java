package com.company.staticExample;

//show initialization of static block
public class StaticBlock {
    static int a = 4 ;
    static int b ;

    //static block used for initialization & will only run once when first obj is created
    static
    {
        System.out.println("I am in static block");
        b= a *4 ;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
        StaticBlock.b += 3 ;
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);

    }


}
