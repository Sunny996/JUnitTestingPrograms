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

    public static double tempConversion(double temp) {
        System.out.println("Type A for C to F conversion");
        System.out.println("Type B for F to C conversion");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch == 'A' || ch == 'a')
            temp = temp * 9.0 / 5 + 32;
        else if (ch == 'B' || ch == 'b')
            temp = (temp - 32) * 5.0 / 9;
        return temp;
    }

    public static double monthlyPayment(double P, double Y, double R) {
        double r = R / (12 * 100);
        double n = 12 * Y;
        double payment = P * r / (1 - Math.pow(1 + r, -n));
        return payment;
    }

    public static double sqrt(int c) {
        double t = c;
        do t = (c / t + t) / 2;
        while (Math.abs(t - c / t) > Math.exp(-15) * t);
        return t;
    }

    public static String toBinary(int num) {
        int i = 10;
        int[] arr = new int[8];
        String str = "";
        do {
            if (Math.pow(2, i) <= num) {
                num = (num - ((int) Math.pow(2, i)));
                arr[i] = 1;
            }
            i--;
        }
        while (i >= 0 && num > 0);
        for (int b=arr.length-1;b>=0;b--)
            str += Integer.toString(arr[b]);
        return str;
    }
}
