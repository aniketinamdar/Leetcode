package com.company.staticExample;

public class Main {
    public static void main(String[] args) {
        HumanClass Aniket = new HumanClass(22,"Aniket",10000,false);
        HumanClass Rahul = new HumanClass(34,"Rahul",15000,true);
        HumanClass Arpit = new HumanClass(34,"Arpit",15000,true);

        //this will also run but convention is accurate and its working is if population is in the object, no then whether it exists in Class yes coz its static variable
        System.out.println(Aniket.population);
        System.out.println(Rahul.population);
        System.out.println(Arpit.population);

        //convention
        System.out.println(HumanClass.population);
        System.out.println(HumanClass.population);
        System.out.println(HumanClass.population);
        fun();
    }
    static void fun()
    {
        //object refernicing is a must for non static in static as it(non static) will require an instance
        Main obj = new Main();
        obj.greeting();
    }
    //static is must as psvm is static and we cannot initialize non static member in static member
    void greeting()
    {
        System.out.println("Hello World");
    }
}
