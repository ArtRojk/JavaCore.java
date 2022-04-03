package com.company;

import java.util.Arrays;

public class Lesson03 {

    static String[] arrayString = {"1", "2", "3", "4"};
    static Integer[] arrayInteger = {1, 2, 3};
    static Double[] arrayDouble = {1d, 2d, 3d, 4d};


    public static void main(String[] args) {
        SwapArrayClass<Object> swapArrayClass = new SwapArrayClass<>();
        try {
            System.out.println(Arrays.toString(swapArrayClass.swapElements(arrayString, 0, 3)));
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }
        try {
            System.out.println(Arrays.toString(swapArrayClass.swapElements(arrayInteger, 0, 3)));
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }
        try {
            System.out.println(Arrays.toString(swapArrayClass.swapElements(arrayDouble, 0, 3)));
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }

    }
}
        class SwapArrayClass<T> {
            T intermediate;

            public T[] swapElements(T[] array, int indexA, int indexB) {
                intermediate = array[indexA];
                array[indexA] = array[indexB];
                array[indexB] = intermediate;
                return array;
            }
        }



