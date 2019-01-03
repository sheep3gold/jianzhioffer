package com.ittest.leetcode.test;

/* -----------------------------------
 *  WARNING:
 * -----------------------------------
 *  Your code may fail to compile
 *  because it contains public class
 *  declarations.
 *  To fix this, please remove the
 *  "public" keyword from your class
 *  declarations.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int reverse(long x) {
        boolean f = true;
        if (x < 0) {
            f = false;
            x = -x;
        }
        String s = x + "";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String reverse=sb.toString();
        long i = Long.parseLong(reverse);
        if (!f){
            i = -i;
        }
        if (i > Math.pow(2, 31) - 1 || i < -Math.pow(2, 31)) {
            return 0;
        }else
            return (int) i;
    }
}

public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {

            long x = Long.parseLong(line);

            int ret = new Solution().reverse(x);

            String out = String.valueOf(ret);

            System.out.print(out);
        }
    }
}