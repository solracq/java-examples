package com.javaexamples.ch7;

/* Execution go to '/Users/carlosquiroz/dev/java/src/com/javaexamples/ch7', then  execute the following:
 * java UseArgsCommandRun.java 8 1 2
 */

public class UseArgsCommandRun {
    public static void main(String[] args) {
        // Checking the lenth of the input args via command
        if (args.length != 3)
            System.err.println("Error: Write again the complete commande including: size of the array, initial value and increment value.");
        else {
            // Get the size of the array from the first command argument
            int arrayLenght = Integer.parseInt(args[0]);
            int[] array = new int[arrayLenght];

            // Get the initial and increment values from the second and third command arguments
            int initialValue = Integer.parseInt(args[1]);
            int incrementValue = Integer.parseInt(args[2]);

            for (int i = 0; i < array.length ; i++)
                array[i] = initialValue + incrementValue * i;

            System.out.printf("%s%8s\n", "Index", "Value");

            for (int i = 0 ; i < array.length ; i++)
                System.out.printf("%5d%8d\n", i, array[i]);
        }
    }
    
}
