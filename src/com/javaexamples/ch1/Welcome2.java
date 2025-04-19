/** A new welcome 2 program
 * Author: Carlos Q.
 */
package com.javaexamples.ch1;

public class Welcome2 {
    public static void main( String[] args ) {
        System.out.printf("%s\n\t\t%s", "Some \"basic\" operations: ", "Addition:");
        int x = 5;
        int y = 3;
        int z =  x + y;
        System.out.printf("%s%d%s%d%s%d%s", " \"Sum\" of ", x, " + ", y , " = ", z, " \\ ");
        System.out.println();
        System.out.printf("%s\n%s\n\t%d\n", "abc", "def", 1245);
    }
}
