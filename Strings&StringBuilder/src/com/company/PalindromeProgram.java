package com.company;

import java.util.Locale;
import java.util.Scanner;

public class PalindromeProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.next();
        System.out.println(check_palindrome(a));

    }
    static public boolean check_palindrome(String a)
    {
        if(a==null || a.length() == 0)
        {
            return true;
        }
        a = a.toLowerCase();
        for (int i = 0; i <= a.length()/2; i++) {
            char start = a.charAt(i);
            char end = a.charAt(a.length()-i-1);
            if (start != end)
            {
                return false;
            }
        }
    return true;
    }
}
