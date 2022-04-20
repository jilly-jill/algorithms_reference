package com.algorithms;
import java.util.Arrays;
public class BubbleSort {


    public static void main(String[] args) {

        int[] numbers = {4, 15, 2, 6, 9, 22, 13};
        Arrays.toString(numbers);
        improve(numbers);
        String improved = Arrays.toString(numbers);
        System.out.println(improved);


    }

    public static void improve(int[] numbers) {
        if (numbers != null) {
            for (int i = 1; i < numbers.length; i++) {
                for (int j = 0; j < numbers.length - 1; j++) {
                    if (numbers[j] > numbers[j + 1]) {
                        swap(numbers, j, j + 1);
                    }
                }
            }
        }
    }


    private static void swap(int[] numbers, int j, int k) {
        int temp = numbers[j];
        numbers[j] = numbers[k];
        numbers[k] = temp;

    }
}
