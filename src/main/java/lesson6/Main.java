package lesson6;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        int[] arr = new int[]{1, 2, 4, 8, 7, 9, 6, 5, 4, 5, 7};
        int[] returnedArr = arrayDivide4(arr);
        for (int i : returnedArr) {
            System.out.print(i + " ");
        }
        System.out.println();
        // Задание 2
        boolean included1or4 = included1or4(arr);
        System.out.println(included1or4);
    }

    public static int[] arrayDivide4(int[] arr) {
        if (arr.length < 4) {
            throw new RuntimeException();
        }
        int sizeNewArr = arr.length % 4;
        int[] returnedArray = new int[sizeNewArr];
        for (int i = 0; i < sizeNewArr; i++) {
            returnedArray[i] = arr[arr.length - 1 - i];
        }
        returnedArray = reverse(returnedArray);
        return returnedArray;
    }

    // Реверс массива
    private static int[] reverse(int[] returnedArray) {
        int temp;
        for (int i = 0; i < returnedArray.length / 2; i++) {
            temp = returnedArray[i];
            returnedArray[i] = returnedArray[returnedArray.length - 1 - i];
            returnedArray[returnedArray.length - 1 - i] = temp;
        }
        return returnedArray;
    }

    public static boolean included1or4(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1 || arr[i] == 4) {
                return true;
            }
        }
        return false;
    }
}
