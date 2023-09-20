package by.bsuir.lab1.task6;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatrixTest {

    @Test
    void createShiftedMatrix() {
        double[] arr = {1, 2, 3};
        double[][] matrix = Matrix.createShiftedMatrix(arr);
        double[][] expectedMatrix = {{1, 2, 3}, {2, 3, 1}, {3, 1, 2}};
        assertEquals(Arrays.deepToString(expectedMatrix), Arrays.deepToString(matrix));
    }
}
