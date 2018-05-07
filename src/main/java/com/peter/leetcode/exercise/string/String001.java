package com.peter.leetcode.exercise.string;

//翻转字符串
public class String001 {
    public static void main(String[] args) {

        System.out.println(reverseString("Hello"));
    }

    public static String reverseString(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[s.length() - i - 1];
            chars[s.length() - i - 1] = temp;
        }

        return new String(chars);
    }
}
