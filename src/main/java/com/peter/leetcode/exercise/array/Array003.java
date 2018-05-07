package com.peter.leetcode.exercise.array;

public class Array003 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        rotate1(arr, 3);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        k %= len;
        for (int i = 0; i < k; i++) {
            int temp = nums[len - 1];
            for (int j = len - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = temp;
        }
    }


    //数组拷贝
    public static void rotate1(int[] nums, int k) {

        int[] num1 = new int[nums.length];
        k %= nums.length;

        System.arraycopy(nums, nums.length-k, num1, 0, k);
        System.arraycopy(nums, 0, num1, k, nums.length-k);
        System.arraycopy(num1, 0, nums, 0, nums.length);

    }
}
