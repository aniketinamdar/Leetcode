package com.company;

public class Main {

    public static void main(String[] args) {
	    //a ^ 1 == a complement
        // a ^ 0 == a
        // a ^ a == 0
        //Left shift operator(<<)
        /*
            10 to base 10 = 1010 in binary
            10<<1 :
                1010 << 1 == 10100
                          == 20 in decimal
             so a << 1 = 2a
        */
        //Right Shift(>>)
        /*
            0011001 >> 1 == 001100
                         == 12
           so a >> 1 = a/2
        */
        //Is odd or not
        int a = 3;
//        isOdd(a);
        int[] arr = {1,4,2,5,7,1,5,7,2};
//        System.out.println(rem_num(arr));
//        System.out.println(findBit(4,3));
//        System.out.println(setBit(4,2));
//        System.out.println(resetBit(4,3));
//        System.out.println(rightFirstSetBit(180));
        //Negative Number
        /*
            1 byte = 8 bits
            10 in binary = 0 0 0 0 1 0 1 0
                           _ this shows if number is negative or not
                           0 -> positive
                           1 -> negative
            -10 :
                s 1 - Take complement of the number
                s 2 - + 1
                s1 and s2 is 2's complement
                s1 : 1 1 1 1 0 1 0 1
                s2 : 1 1 1 1 0 1 1 0 == -1
        */
        //Range of number
        /*
            1 byte : [-128,127] == 256
            for n bits : [-2^n-1,2^n-1 - 1]
        */
        int[] arr1 = {2,2,3,2,7,7,8,7,8,8};
        System.out.println(rem_3times(arr1));
    }

    public static int rem_num(int[] arr) {
        int ans = 0 ;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }

    public static void isOdd(int a)
    {
        if ((a & 1) == 1)
        {
            System.out.println("Odd");
        }
        else
        {
            System.out.println("Even");
        }
    }
    public static int findBit (int num , int pos)
    {
        if((num & (1 << (pos-1)))==0)
        {
            return 0;
        }
        return 1;
    }
    public static int setBit (int num , int pos)
    {
        int a = 1 << (pos-1);//mask creation
        return num | a ;
    }
    public static int resetBit(int num , int pos)
    {
        int a = ~(1 << (pos-1));//mask creation
        return num & a ;
    }
//    public static int rightFirstSetBit (int num)
//    {
//
//    }
    public static int rem_3times(int[] arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum = sum + arr[i];
        }
        int ans = sum % 3;
        return ans;
    }


}
