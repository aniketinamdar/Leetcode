package com.company.singleton;

public class Main {
    public static void main(String[] args) {
        //all three ref variable point to one object
        Singleton obj = Singleton.getInstance();
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
    }
}
