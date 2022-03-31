package main;

import java.util.Arrays;
import java.util.Scanner;

public class JUnitTestingPrograms {
    public static int minNoOfNotes(int num) {
        int minNoOfNotes = 0;
        int[] arr = {1000, 500, 100, 50, 10, 5, 2, 1};
        int[] arr1 = new int[8];
        while (num > 0) {
            if (num >= arr[0]) {
                arr1[0]++;
                num -= arr[0];
            }
            for (int i = 0; i < 7; i++) {
                if (num >= arr[i + 1] && num < arr[i]) {
                    arr1[i + 1]++;
                    num -= arr[i + 1];
                }
            }
        }
        System.out.println("These notes are used for change");
        for (int j = 0; j < arr1.length; j++) {
            minNoOfNotes += arr1[j];
            if (arr1[j] > 0) {
                System.out.print(arr[j] + " ");
            }
        }
        System.out.println();
        return minNoOfNotes;
    }
}
