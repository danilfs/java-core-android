package Hw2;

import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        anotherArray (arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(fillArrayWithStep(8, 3)));
        int[] arr1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        workWithSix(arr1);
        System.out.println(Arrays.toString(arr1));


    }

    //Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    //С помощью цикла и условия заменить 0 на 1, 1 на 0;
    static void anotherArray(int[] arr) {
        if (arr == null) return;
        for (int i = 0; i < arr.length; i++) {
            arr[i] ^= 1;
        }
    }

    //Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

    static int[] fillArrayWithStep(int size, int step) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * step;
        }
        return arr;
    }

    //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    static void workWithSix(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2; //arr[i] = arr[i] * 2
        }
    }


}
