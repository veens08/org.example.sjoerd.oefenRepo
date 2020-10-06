package org.example.sjoerd.oefenRepo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static java.lang.System.out;

public class ArrayTesten {

    @Test
    void testHistogram () {
        int [] scores = randomArray (30);
        int aantalRandomGetallen = 10;
        int [] randomGetallen = scores;
        out.println (Arrays.toString (randomGetallen));
        int [] counts = new int [10];
        counts [0] = inRange (scores, 90,100);
        counts [1] = inRange (scores, 80,90);
        counts [2] = inRange (scores, 70,80);
        counts [3] = inRange (scores, 60,70);
        counts [4] = inRange (scores, 50,60);
        counts [5] = inRange (scores, 40,50);
        counts [6] = inRange (scores, 30,40);
        counts [7] = inRange (scores, 20,30);
        counts [8] = inRange (scores, 10,20);
        counts [9] = inRange (scores, 0,20);
        out.println (Arrays.toString (counts));
    }

    @Test
    void testHistogramWithScoresLoop () {
        int[] scores = randomArray (20);
        out.println (Arrays.toString (scores));

        int[] counts = new int[10];

        int factor1 = 1;
        for (int i=  0; i < counts.length; i++) {
            counts[i] = inRange (scores, 100 - (10 * factor1), 100 - (10 * (factor1 - 1)));
            factor1++;
        }
        out.println (Arrays.toString (counts));

        // Voor het betere begrip van een enhanced for loop
        for (int count : counts) {
            out.println (" inhoud " + count );
        }
    }

    @Test
    void testMaxInteger () {
        int[] scores = randomArray (20);
        out.println (Arrays.toString (scores));

        int maximum = maxIntegerEnhanced (scores);
        out.println (maximum);

    }

    @Test
    void testPrimeIntegers () {
        
        int[] primes = randomArray (20);
        out.println (Arrays.toString (primes));

        boolean[] arePrimeNumbers = primesArray (primes, 20);

        out.println (Arrays.toString (arePrimeNumbers));

    }
    @Test
    void testDoubleSquares () {
        double [] doubleArray = new double[5];
        doubleArray [0] = 1.8;
        doubleArray [1] = 23.75;
        doubleArray [2] = 445.7;
        doubleArray [3] = 0.098;
        doubleArray [4] = 10.0;
        double[] doubles = squaresArray (doubleArray);
        out.println (Arrays.toString (doubles));

    }

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

    public static int maxInteger(int [] a) {
        int max = 0;
        for (int index1 = 0; index1 < a.length; index1++) {
            if  (a[index1] > max) {
                max = a[index1];
            }
        }
        return max;
    }

    public static int maxIntegerEnhanced(int [] getallen) {
        int max = 0;
        for (int getal : getallen) {
            if  (getal > max) {
                max = getal;
            }
        }
        return max;
    }

    public static boolean[] primesArray(int [] primeNumbers, int size) {
        boolean [] isAPrimeNumber = new boolean[size];
        for (int index1 = 0; index1 < primeNumbers.length; index1++) {
            int getal = primeNumbers [index1];
            for (int index2 = 2; index2 < getal; index2++){
                isAPrimeNumber[index1] = true;
                int n = getal%index2;
                if (n==0) {
                    isAPrimeNumber[index1] = false;
                    // Forceer einde loop
                    index2 = 99;
                    }
                }
            }
        return isAPrimeNumber;
    }

    public static double[] squaresArray(double [] a) {
        for (int index1 = 0; index1 < a.length; index1++) {
            a[index1] = Math.pow (a[index1], 2.0);
        }
        return a;
    }
}
