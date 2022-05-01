package com.company;

public class smallestLetter {
    public static void main(String[] args) {

    }
    static public char nextGreatestLetter(char[] letters, char target) {
        int start = 0 ;
        int end = letters.length - 1;
        int ans = 0;
        while (start <= end)
        {
            int mid = start + (end - start) / 2 ;
            if (letters[mid] > target)
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return letters[start%letters.length];
    }
}
