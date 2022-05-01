package com.company.inheritance;

public class Box {
    double l ;
    double w ;
    double h ;
    Box()
    {
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }
    //cube
    Box(double side)
    {
        super();//all classes are inherited from object class so no error
        this.l=side;
        this.h=side;
        this.w=side;
    }

    Box(double l , double h , double w)
    {
        this.l=l;
        this.h=h;
        this.w=w;
    }

    Box(Box old)
    {
        this.h = old.h;
        this.w = old.w;
        this.l = old.l;
    }
    public void information()
    {
        System.out.println("Running the box");
    }
}
