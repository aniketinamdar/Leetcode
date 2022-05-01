package com.company;

public class Main {
    public static void main(String[] args) {
        //compile time     run time
	    Student Aniket = new Student();
//	    Student Aniket = new Student(22,"Aniket",98.6f);
//        Aniket.id = 7;
//        Aniket.name = "Hi";
        System.out.println(Aniket.id);
        System.out.println(Aniket.name);
        System.out.println(Aniket.marks);
    }

}
class Student
{
    int id ;
    String name ;
    float marks;
    //default constructor
    Student()
    {
        this.id = 0 ;
        this.name = "User";
        this.marks = 88.6f;
    }
    //parametrized constructor
    Student(int r_no , String name_ , float marks_)
    {
        this.id = r_no;
        this.name = name_;
        this.marks = marks_;
    }
}