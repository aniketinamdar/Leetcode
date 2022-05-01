package com.company;

public class SQRT {
    public static void main(String[] args) {

    }
    static public int mySqrt(int x) {
            int start = 0, end = x, ans = 0;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (mid * mid == x) {
                    ans = mid;
                    break;
                }
                if (mid * mid < x) {
                    ans = mid;
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return ans;
        }
    }
