package org.example;
public class InsertionSort {
    public int[] sort(int[] unsorted) {
        for (int j = 1; j < unsorted.length; j++) {
            int key = unsorted[j];
            int i = j - 1;
            while (i >= 0 && unsorted[i] > key) {
                unsorted[i + 1] = unsorted[i];
                i = i - 1;
            }
            unsorted[i + 1] = key;

        }
        return unsorted;
    }
}
