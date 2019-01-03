package com.ittest.offer;

import java.util.Scanner;

/**
 * 请实现一个函数，把字符串中的每个空格替换成"%20"，例如“We are happy.“，则输出”We%20are%20happy.“
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input a string:");
        String s = sc.nextLine();
        //使用String内置函数
        /*String s1 = s.replaceAll(" ", "%20");
        System.out.println(s1);*/

        StringBuilder sb = new StringBuilder();
        String[] s1 = s.split(" ");
        for (int i = 0; i < s1.length; i++) {
            StringBuilder sb1 = new StringBuilder(s1[i]);
            if (i!=s1.length-1) {
                sb.append(sb1).append("%20");
            }else {
                sb.append(sb1);
            }
        }
        System.out.println(sb);
    }
}
