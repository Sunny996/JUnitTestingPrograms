package main;

import java.util.Arrays;
import java.util.Scanner;

public class JUnitTestingPrograms {
    public static int minNoOfNotes(int n) {
        int minNoOfNotes = 0;
        int[] arr = {1000, 500, 100, 50, 10, 5, 2, 1};
        int[] arr1 = new int[8];
        while (n > 0) {
            if (n >= arr[0]) {
                arr1[0]++;
                n -= arr[0];
            }
            for (int i = 0; i < 7; i++) {
                if (n >= arr[i + 1] && n < arr[i]) {
                    arr1[i + 1]++;
                    n -= arr[i + 1];
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

    public static String dayOfWeek(int m, int d, int y) {
        String day = "";
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;
        switch (d0) {
            case 0:
                day = "Sunday";
                break;
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
        }
        return day;
    }
}
