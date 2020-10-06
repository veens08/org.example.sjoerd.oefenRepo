package org.example.sjoer.oefenRepo.domain;

import java.util.Random;

public class Histogram {

    public static int[] randomArray(int size) {
        Random random = new Random();
        int [] a = new int [size];
        for (int index1 = 0; index1 < a.length; index1++) {
            a[index1] = random.nextInt (100);
        }
        return a;
    }

    public static int inRange(int[] a, int low, int high) {
        int count = 0;
        for (int index2 = 0; index2 <a.length; index2++) {
            if (a[index2] >= low && a[index2] < high) {
                count++;
            }
        }
        return count;
    }
}
