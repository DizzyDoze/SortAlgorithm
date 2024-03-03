package test;

import java.util.Random;

public class TestUtil {

    public static boolean isSorted(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] > arr[i]){
                return false;
            }
        }
        return true;
    }

    public static int[] generateRandomArray(int size){
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }
}
