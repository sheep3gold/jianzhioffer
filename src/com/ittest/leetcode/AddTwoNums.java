package com.ittest.leetcode;

import java.util.LinkedList;

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

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode1 = l1;
        ListNode listNode2 = l2;
//        iterListNode(listNode1);
//        iterListNode(listNode2);
        ListNode listNode = new ListNode(0);
        int num = 0;
        int n = 0;
        ListNode listNode3=null;
        while (listNode1 != null || listNode2 != null) {
            int i = 0, j = 0;
            if (n == 0) {
                listNode3 = listNode;
            }
            while (n > 0) {
                listNode3.next = new ListNode(0);
                listNode3 = listNode3.next;
                n--;
            }
            if (listNode1 != null) {
                i = listNode1.val;
            }
            if (listNode2 != null) {
                j = listNode2.val;
            }
            int m = i + j;
            if (m >= 10) {
                listNode3.val = m % 10 + num;
                num = 1;
            } else {
                if (m % 10 + num >= 10) {
                    listNode3.val = 0;
                    num = 1;
                }else {
                    listNode3.val = m % 10 + num;
                    num = 0;
                }
            }
            n++;
            if (listNode1 != null) {
                listNode1 = listNode1.next;
            }
            if (listNode2 != null) {
                listNode2 = listNode2.next;
            }
        }
        if (num == 1) {
            listNode3.next = new ListNode(1);
        }
        return listNode;
    }

}

public class AddTwoNums {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static ListNode stringToListNode(String input) {
        // Generate array from the input
        int[] nodeValues = stringToIntegerArray(input);

        // Now convert that list into linked list
        ListNode dummyRoot = new ListNode(0);
        ListNode ptr = dummyRoot;
        for(int item : nodeValues) {
            ptr.next = new ListNode(item);
            ptr = ptr.next;
        }
        return dummyRoot.next;
    }

    public static String listNodeToString(ListNode node) {
        if (node == null) {
            return "[]";
        }

        String result = "";
        while (node != null) {
            result += Integer.toString(node.val) + ", ";
            node = node.next;
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            ListNode l1 = stringToListNode(line);
            line = in.readLine();
            ListNode l2 = stringToListNode(line);

            ListNode ret = new Solution().addTwoNumbers(l1, l2);

            String out = listNodeToString(ret);

            System.out.print(out);
        }
    }
}
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}