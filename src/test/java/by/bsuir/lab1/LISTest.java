package by.bsuir.lab1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LISTest {
    @Test
    void findMinRemove() {
        int[] arr1 = {2, 3, 4, 5, 1, 6};
        int res1 = LIS.findMinRemove(arr1);
        assertEquals(1, res1);

        int[] arr2 = {9, 1, 2, 3, 0};
        int res2 = LIS.findMinRemove(arr2);
        assertEquals(2, res2);

        int[] arr3 = {1, 2, 3, 4, 5, 6};
        int res3 = LIS.findMinRemove(arr3);
        assertEquals(0, res3);
    }

    @Test
    void mergeLIS() {
        double[] arr1 = {1, 3, 5};
        double[] arr2 = {2, 4};

        double[] expectedResult = {1, 2, 3, 4, 5};
        double[] result = LIS.mergeLIS(arr1, arr2);

        assertEquals(Arrays.toString(expectedResult), Arrays.toString(result));
    }
}
