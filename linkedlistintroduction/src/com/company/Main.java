package com.company;

public class Main {

    public static void main(String[] args) {
//        Linked list introduction
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertFirst(1);
        list.insertLast(10);
        list.insertAtPos(100,2);
        list.display();
        System.out.println();
        list.deleteFirst();
        list.deleteLast();
        list.display();
        System.out.println();
        list.deleteAtPos(2);
        list.display();
        list.insert_recursion(1000,1);
        list.insert_recursion(1000,1);
        System.out.println();
        list.display();
        System.out.println();
        list.delete_duplicates();
        list.display();

        /*----------------------------*/
        //Doubly linked list:
//    DLL list = new DLL();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.insertFirst(1);
//        list.display();
//        System.out.println();
////        list.displayReverse();
//        list.insertLast(100);
//        list.display();
//        System.out.println();
//        list.insertAfterValue(8,50);
//        list.display();

        /*----------------------------------*/
        //Circular linked list
//        CLL list = new CLL();
//        list.insert(12);
//        list.insert(13);
//        list.insert(14);
//        list.insert(15);
//        list.insert(16);
//        list.display();
//        System.out.println();
//        list.delete(14);
//        list.display();


    }
}
