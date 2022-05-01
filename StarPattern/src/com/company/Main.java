package com.company;

public class Main {
//Patterns :
/*
    Approach :
                1. Run outer for loop for number of lines (Rows)
                2. Check number of columns / occurences in each row / Types of elements in column
                3. What to print
*/
    public static void main(String[] args) {
//        patter1(4);
//        patter2(4);
//        patter3(4);
//        patter4(4);
//        patter5(4);
//        patter6(4);
//        patter7(4);
//        patter8(4);
//        patter9(4);
//        patter10(4);
//        patter11(4);
//        patter12(4);
        patter13(4);
//        patter28(4);
//        patter30(4);
//        patter17(4);
//        patter31(4);
    }

    public static void patter13(int n) {
    }

    public static void patter12(int n) {
        for (int i = 1; i <= n; i++) {
            int num_spaces = i - 1;
            for (int spaces = 1; spaces <= num_spaces ; spaces++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i + 1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            int num_spaces = n - i ;
            for (int spaces = 1; spaces <= num_spaces ; spaces++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void patter11(int n) {
        for (int i = 1; i <= n; i++) {
            int num_spaces = i - 1;
            for (int spaces = 1; spaces <= num_spaces ; spaces++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i + 1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void patter10(int n) {
        for (int i = 1; i <= n; i++) {
            int num_spaces = n - i ;
            for (int spaces = 1; spaces <= num_spaces ; spaces++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void patter9(int n) {
        for (int i = 1; i <= n; i++) {
            int num_spaces = i - 1;
            for (int spaces = 1; spaces <= num_spaces; spaces++) {
                System.out.print(" ");
            }
            for (int j = 1 ; j <= n-i+1 ; j++) {
                System.out.print("*");
            }
            for (int j = 2 ; j <= n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patter8(int n) {
        for (int i = 1; i <= n ; i++) {
            int num_spaces = n-i;
            for (int j = 1; j <= num_spaces; j++) {
                System.out.print(" ");
            }
            for (int j = i ; j >= 1 ; j--) {
                System.out.print("*");
            }
            for (int j = 2 ; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patter7(int n) {
        for (int i = 1; i <= n; i++) {
            int num_spaces = i - 1 ;
            for (int j = 1; j <= num_spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n-i+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patter6(int n) {
        for (int i = 1 ; i <= n ; i++) {
            int n_spaces = n - i ;
            for (int spaces = 1; spaces <= n_spaces ; spaces++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patter1(int n)
    {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void patter2(int n)
    {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void patter3(int n)
    {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void patter4(int n)
    {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
    public static void patter5(int n)
    {
        for (int i = 1; i <= 2*n-1; i++) {
            int col = i > n ? 2 * n -i  : i;
            for (int j = 1; j <= col ; j++){
                    System.out.print("* ");
                }
                System.out.println();

        }
    }
    public static void patter28(int n)
    {
        for (int i = 1; i <= 2*n-1; i++) {
            int col = i > n ? 2 * n -i  : i;
            int number_spaces = n-col;
            for (int spaces = 0 ; spaces < number_spaces ; spaces++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= col ; j++){
                    System.out.print("* ");
                }
                System.out.println();
        }
    }
    public static void patter30(int n)
    {
        for (int i = 1; i <= n; i++) {
            int number_spaces = n-i;
            for (int spaces = 0 ; spaces < number_spaces ; spaces++)
            {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--){
                System.out.print(j+" ");
            }
            for (int j = 2 ; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void patter17(int n)
    {
        for (int i = 1; i <=2*n-1; i++) {
            int col = i > n ? 2 * n -i  : i;
            for (int spaces = 0 ; spaces < n - col ; spaces++)
            {
                System.out.print(" ");
            }
            for (int j = col; j >= 1; j--){
                System.out.print(j);
            }
            for (int j = 2 ; j <= col; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void patter31(int n)
    {
        int original = n;
        n = 2*n;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                int atIndex =original - Math.min(Math.min(i,j),Math.min(n-i,n-j));
                System.out.print(atIndex);
            }
            System.out.println();
        }
    }
}