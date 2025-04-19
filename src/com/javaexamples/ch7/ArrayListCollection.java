package com.javaexamples.ch7;

/* Creating array lists, similarly to lists in Python, with dynamic size... only to store objects. */

import java.util.ArrayList;

public class ArrayListCollection {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("apple");
        System.out.println(list);
        System.out.println("Size of list = " + list.size());
        list.add("pineapple");
        list.add(0, "papaya");
        System.out.println(list);
        list.addFirst("mango");
        list.addLast("guava");
        System.out.println(list);
        System.out.println("Does the list contain 'apple'? " + list.contains("apple"));
        System.out.println("What fruit contains the index 3? " + list.get(3));
        System.out.println("What index is mango? " + list.indexOf("mango"));
        list.remove("apple");
        System.out.println(list);
        System.out.println("The size of the list of fruits is: " + list.size());
        list.trimToSize();
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }
}
