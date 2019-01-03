package com.ittest.leetcode;

public class Reverse {
    public static void main(String[] args) {
        int x = 123;
        int reverse = reverse(x);
        System.out.println(reverse);
    }

    public static int reverse(int x) {
        boolean f = true;
        if (x > Math.pow(2, 31) - 1 || x < -Math.pow(2, 31)) {
            return 0;
        }
        if (x < 0) {
            f = false;
            x = -x;
        }
        String s = x + "";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String reverse=sb.toString();
        int i = Integer.parseInt(reverse);
        if (f){
            return i;
        }else {
            return 0 - i;
        }
    }
}
