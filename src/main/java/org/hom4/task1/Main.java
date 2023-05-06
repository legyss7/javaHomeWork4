package org.hom4.task1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    /**
     * Вывести список на экран в перевернутом виде (без массивов и ArrayList)
     * Пример:
     * 1->2->3->4
     * Вывод:
     * 4->3->2->1
     */

    public static void main(String[] args) {
        LinkedList<Integer> list
                = new LinkedList<>(Arrays.asList(1, 2, 3, 4));
        System.out.println("list = " + list);
        Collections.reverse(list);
        System.out.println("list inversion = " + list);
    }
}
