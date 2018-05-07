package com.peter.leetcode.exercise.string;

//颠倒整数
public class String002 {
    public static void main(String[] args) {

        System.out.println(reverse(1222222999));
    }

    public static int reverse(int x) {
        int newNum = 0;
        int i = 0;

        while (x != 0) {
            newNum = i * 10 + x % 10;
            x = x / 10;
            if (newNum / 10 != i) {
                return 0;
            }

            i = newNum;
        }

        return newNum;
    }
}
