package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Aufgabe 1: ");

        int[] array1 = new int[10];

        for (int i = 0; i < array1.length; i++) {
            array1[i] =  i+1;
            System.out.println(array1[i]);
        }
        System.out.println("Aufgabe 2: ");

        int sum1 = 0;
        for (int number : array1) {
            sum1 = sum1 + number;
        }
        System.out.println("Die Summe ist: " + sum1);

        System.out.println("Aufgabe 3: ");

        int max = 0;

        for (int i = 0; i <= array1.length; i++) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Die größte Zahl ist: " + max);

        System.out.println("Aufgabe 4: ");

        int[] array2 = new int[10];

        for (int i = 0; i < array2.length; i++) {
            array2[i] = i+11;
            System.out.println(array2[i]);
        }

        System.out.println("Aufgabe 5: ");


        int[] array3 = new int[10];

        for (int i = 0; i < array3.length; i++) {
            array3[i] = array1[i] + array2[i];
            System.out.println("Summe: " + array3[i]);
        }
    }
}