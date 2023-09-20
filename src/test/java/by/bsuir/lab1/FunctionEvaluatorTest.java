package by.bsuir.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionEvaluatorTest {

    @Test
    void calculateFraction() {
        double a1 = 0;
        double b1 = 0;
        double result1 = FunctionEvaluator.calculateFraction(a1, b1);
        assertEquals(0.5, result1);

        double a2 = 0.5;
        double b2 = 0.5;
        double result2 = FunctionEvaluator.calculateFraction(a2, b2);
        assertEquals(1.25, Math.round(result2 * 100.00)/ 100.00);
    }

    @Test
    void calcTngWithStep() {
        double a = 1;
        double b = 2;
        double h = 0.5;
        Double[][] resArr = FunctionEvaluator.calcTngWithStep(a, b, h);
        Double[][] expectedArr = new Double[][]{{1.0, 1.56}, {1.5, 14.1}, {2.0, -2.19}};
        for (int i = 0; i < resArr.length; i++) {
            assertEquals(expectedArr[i][0], resArr[i][0]);
            assertEquals(expectedArr[i][1], Math.round(resArr[i][1] * 100.00) / 100.00);
        }

    }

}
