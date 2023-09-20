package by.bsuir.lab1.task7;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BubbleSortTest {

    @Test
    void sort(){
        double[] arr1 = {3, 2, 1};
        double[] expectedArr1 = {1, 2, 3};
        BubbleSort.sort(arr1);
        assertEquals(Arrays.toString(expectedArr1), Arrays.toString(arr1));

        double[] arr2 = {1, 2, 3};
        double[] expectedArr2 = {1, 2, 3};
        BubbleSort.sort(arr2);
        assertEquals(Arrays.toString(expectedArr2), Arrays.toString(arr2));
    }
}
