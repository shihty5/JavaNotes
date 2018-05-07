package com.peter.leetcode.exercise.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Array004 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = {1, 2, 3, 4};
        int[] empty = {};
        System.out.println(containsDup(arr2));
    }

    public static boolean containsDuplicate(int[] nums) {
        if (nums.length == 0) {
            return false;
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            list.add(i);
        }

        return new HashSet<>(list).size() != nums.length;
    }

    public static boolean containsDup(int[] nums){
        if (nums.length == 0) {
            return false;
        }
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1]){
                return true;
            }
        }

        return false;
    }
}
