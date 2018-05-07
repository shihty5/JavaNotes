package com.peter.leetcode.exercise;

public class Array001 {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 3, 3, 4, 5};
        System.out.println(getLength(a));
    }

    public static int getLength(int[] nums) {
        int length = nums.length;
        if (length == 1) {
            return 1;
        }

        int len = 1;
        for (int i = 1; i < length; i++) {
            if (nums[i - 1] == nums[i]) {
                continue;
            } else {
                nums[len++] = nums[i];
            }
        }

        return len;
    }
}
