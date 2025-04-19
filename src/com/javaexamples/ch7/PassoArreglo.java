package com.javaexamples.ch7;

public class PassoArreglo {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("The values of the orogoma; va;ies om the array are:");
        for (int i = 0 ; i < array.length ; i++)
            System.out.printf(" %d ", array[i]);

        moodifyArray(array);
        System.out.println("\nThe values of the arry modified are: ");
        for (int element : array)
            System.out.printf(" %d ", element);

        System.out.println();
        System.out.printf("array[3] before modifyingElement: %d", array[3]);
        modifyElement(array[3]);
        System.out.printf("array[3] after modifyingElement: %d", array[3]);
        System.out.println();
    }

    public static void moodifyArray(int[] array2) {
        for (int i = 0 ; i < array2.length ; i++)
            array2[i] *= 2;
    }

    public static void modifyElement(int element) {
        element *= 2;
        System.out.printf("\nValue of element in modifyElement: %d\n", element);
    }
}
