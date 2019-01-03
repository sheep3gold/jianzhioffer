package com.ittest.leetcode;

public class LenghthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "bbbbb";
        int i = lengthOfSub(s);
        System.out.println(i);
    }

    public static int lengthOfSub(String s) {
        int num0 = 0;
        int num = 0;
        char[] chars = s.toCharArray();
        int i = 0;
        for (int j = i ; j < chars.length; j++) {
            num = j - i + 1;
            for (int k = j-1; k >=i ; k--) {

                if (chars[k] == chars[j]) {
                    num = j - k;
                    i = k + 1;
                    break;
                }
            }
            if (num0 < num) {
                num0 = num;
            }
        }

        return num0;
    }
}
