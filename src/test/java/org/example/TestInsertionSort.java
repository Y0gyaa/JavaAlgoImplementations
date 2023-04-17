package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestInsertionSort {
    @Test
    public void test(){
        int[]  expected = new int[] { 1,2,3,4,5};

        int[]  unsorted = new int[] { 3,2,5,1,4};

        InsertionSort is = new InsertionSort();
        Assertions.assertArrayEquals(expected,is.sort(unsorted));
    }
}