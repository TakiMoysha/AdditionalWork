package ru.namedomen.lesson_1;

import java.util.Arrays;

public class Main5Array1 {
    public static void main(String[] args) {

        int[] numbers = {10, 3, 5, 22};
        System.out.println(numbers[3]);
        System.out.println(Arrays.toString(numbers));

        numbers[3] = 12;
        System.out.println(numbers[3]);
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }
//        for (String s: args) {
//            System.out.println(s);
//        }
    }
}
