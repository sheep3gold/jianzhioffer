package com.ittest.offer;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * 输入个链表的头结点，从尾到头反过来打印出每个结点的值。
 */
public class Test05 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        list.add("h");
        ListIterator<String> it = list.listIterator();
        while (it.hasNext()) {
            System.out.print(it.next());
        }
        System.out.println();
        while (it.hasPrevious()) {
            System.out.print(it.previous());
        }
    }
}
