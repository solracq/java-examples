package com.javaexamples.ch1;

public class ForTest {

    public static void main( String[] args ){
        String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        
        for (String letter : letters) 
            System.out.printf("%s ", letter);
        System.out.println();
    }
    
}
