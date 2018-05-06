package com.peter.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Demo290 {
    public static void main(String[] args) {
        String pattern = "abba";
        String str = "dog cat cat dog";
        System.out.println(wordPattern(pattern, str));
    }

    public static boolean wordPattern(String pattern, String str) {
        char[] chars = pattern.toCharArray();
        String[] strings = str.split("\\s");

        if (chars.length != strings.length) {
            return false;
        }

        Map<Character, String> mapping = new HashMap<>();
        int size = chars.length;
        for (int i = 0; i < size; i++) {
            //如果存在Key,但是对应的Value不一样
            if (mapping.containsKey(chars[i])) {
                if (!strings[i].equals(mapping.get(chars[i]))) {
                    return false;
                }
            //如果没有key，但是有相同的Value
            } else if (mapping.containsValue(strings[i])) {
                return false;

            } else {
                mapping.put(chars[i], strings[i]);
            }
        }

        return true;
    }
}
