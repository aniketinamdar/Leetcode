package com.company;

public class StringPerformance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26 ; i++) {
            char ch = (char)('a' + i );
            System.out.printf("%c ",ch);
            series += ch;
        }
        System.out.println(series);
    }
}
