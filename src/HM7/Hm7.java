package HM7;

import java.util.Arrays;

public class Hm7 {

    public static void main(String[] args) {

        // ==================== ЗАДАЧА 1 ====================
        int[] integers = new int[3];
        integers[0] = 1;
        integers[1] = 2;
        integers[2] = 3;

        double[] fractions = {1.57, 7.654, 9.986};

        int[] customArray = {10, 20, 30, 40};


        // ==================== ЗАДАЧА 2 ====================
        for (int i = 0; i < integers.length; i++) {
            System.out.print(integers[i]);
            if (i < integers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < fractions.length; i++) {
            System.out.print(fractions[i]);
            if (i < fractions.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < customArray.length; i++) {
            System.out.print(customArray[i]);
            if (i < customArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();


        // ==================== ЗАДАЧА 3 ====================
        for (int i = integers.length - 1; i >= 0; i--) {
            System.out.print(integers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = fractions.length - 1; i >= 0; i--) {
            System.out.print(fractions[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = customArray.length - 1; i >= 0; i--) {
            System.out.print(customArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();


        // ==================== ЗАДАЧА 4 ====================
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 != 0) {
                integers[i] += 1;
            }
        }

        System.out.println(Arrays.toString(integers));
    }
}
