package com.ittest.leetcode;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {

    }
    public static int[] twoSum(int[] nums,int target) {
       /* int m = -1;
        int n = -1;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    m = i;
                    n = j;
                }
            }
        }
        if (m != -1 && n != -1) {
            return new int[]{m, n};
        }
        throw new IllegalArgumentException("no such sum solution");*/
       /* HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (map.containsKey(comp) && map.get(comp) != i) {
                return new int[]{i, map.get(comp)};
            }
        }
        throw new IllegalArgumentException("no such solution");*/
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (map.containsKey(comp)) {
                return new int[]{i, map.get(comp)};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("no such solution");
    }
}
