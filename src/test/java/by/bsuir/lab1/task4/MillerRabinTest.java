package by.bsuir.lab1.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MillerRabinTest {

    @Test
    void isPrime() {
        int num = 1;
        int k = 5;
        assertFalse(MillerRabin.isPrime(num, k));

        num = 2;
        assertTrue(MillerRabin.isPrime(num, k));

        num = 4;
        assertFalse(MillerRabin.isPrime(num, k));
    }

}
