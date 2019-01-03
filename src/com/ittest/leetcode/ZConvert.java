package com.ittest.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ZConvert {
    public static void main(String[] args) {
        String s = "LEETCODEISHIRING";
        String convert = convert(s, 3);
        System.out.println(convert);
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        char[] chars = s.toCharArray();
        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, chars.length); i++) {
            rows.add(new StringBuilder());
        }
        boolean flag = false;
        int row = 0;
        for (char c : chars) {
            rows.get(row).append(c);
            if (row == 0 || row == numRows - 1) {
                flag = !flag;
            }
            row += flag ? 1 : -1;
        }
        StringBuilder sb = new StringBuilder();
        for (StringBuilder stringBuilder : rows) {
            sb = sb.append(stringBuilder);
        }
        return sb.toString();
    }

}
