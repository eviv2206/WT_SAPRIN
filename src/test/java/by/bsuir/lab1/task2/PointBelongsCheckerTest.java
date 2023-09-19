package by.bsuir.lab1.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PointBelongsCheckerTest {

    @Test
    void isBelong() {
        PointBelongsChecker<Integer> integerPointBelongsChecker = new PointBelongsChecker<>();
        assertTrue(integerPointBelongsChecker.isBelong(1, 1));
        assertTrue(integerPointBelongsChecker.isBelong(-2, -2));
        assertFalse(integerPointBelongsChecker.isBelong(100, 100));
        assertFalse(integerPointBelongsChecker.isBelong(-100, -100));

        PointBelongsChecker<Double> doublePointBelongsChecker = new PointBelongsChecker<>();
        assertTrue(doublePointBelongsChecker.isBelong(1.5, 1.5));
        assertTrue(doublePointBelongsChecker.isBelong(-2.5, -2.5));
        assertFalse(doublePointBelongsChecker.isBelong(100.22, 100.22));
        assertFalse(doublePointBelongsChecker.isBelong(-100.22, -100.22));
    }
}
