package com.javaexamples.ch8;

// Import Enum module "EnumSet"
import java.util.EnumSet;

public class MoviesEnumTest {
    public static void main(String[] args) {
        System.out.println("All Movies: ");
        for (MoviesEnum movies : MoviesEnum.values())
        {
            System.out.printf("%s\t%s\t%s\t%s\n", movies, movies.getMovie1(), movies.getMovie2(), movies.getMovie3());
        }
        System.out.println();
    }
}
