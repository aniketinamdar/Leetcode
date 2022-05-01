package com.company.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box(4);
//
//        System.out.println(box.l+" "+ box.h+" "+box.w);

//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(1,2,3,4);
//        System.out.println(box3.h+ " "+box3.weight);

        Box box5 = new BoxWeight(2,3,4,5);
//        class is box but object is boxweight
//        System.out.println(box5.weight);-->not work as refernece variable i.e box5 is of type of box and thus box5 will be able to access to box variables

//        BoxWeight box6 = new Box(2,3,4,6);//box has no constructor with weigth in it so error
            //trying to refernce a child to a parent so just parent attributes used
    }
}
