package com.javaexamples.ch8;

import java.util.EnumSet;

public class BookEnumTest {
    public static void main(String[] args) {
        System.out.println("All the books: \n");

        for (Book book : Book.values())
            System.out.printf("%-10s%-45s%s\n", book, book.getTitle(), book.getYearCopyright());

        System.out.println("\nShow range of enum constants:\n");

        // Print the first four books
        for (Book book : EnumSet.range(Book.JHTP, Book.CPPHTP))
            System.out.printf("%-10s%-45s%s\n", book, book.getTitle(), book.getYearCopyright());
    }
}
