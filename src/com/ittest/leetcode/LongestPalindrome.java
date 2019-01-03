package com.ittest.leetcode;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "bb";
        String longest = longest(s);
        System.out.println(longest);
    }

    public static String longest(String s) {
        if (s.length() == 0) {
            return "";
        }
        int len0 = 1;
        String s0 = null;
        int len1 = 1;
        int len2 = 1;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int m = 1;
            while ((i - m) >= 0 && (i + m) < chars.length) {
                if (chars[i - m] != chars[i + m]) {
                    break;
                }
                m++;
                len1 = 2 * (m - 1) + 1;
            }
            if (len0 < len1) {
                len0 = len1;
                s0 = s.substring(i - m + 1, i + m);
            }
            int n = 0;
            while ((i - n) >= 0 && (i + n + 1) < chars.length) {
                if (chars[i - n] != chars[i + n + 1]) {
                    break;
                }
                n++;
                len2 = n * 2;
            }
            if (len0 < len2) {
                len0 = len2;
                s0 = s.substring(i - n + 1, i + n + 1);
            }
        }
        /*for (int i = 0; i < chars.length; i++) {
            int m = 0;
            while ((i - m) >= 0 && (i + m + 1) < chars.length) {
                if (chars[i - m] != chars[i + m + 1]) {
                    break;
                }
                m++;
                len2 = m * 2;
            }
            if (len0 < len2) {
                len0 = len2;
                s0 = s.substring(i - m + 1, i + m + 1);
            }
        }*/
        if (len0==1)
            s0 = s.substring(0, 1);
        return s0;
    }
}
