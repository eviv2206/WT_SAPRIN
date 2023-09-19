package by.bsuir.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerIOTest {

    @Test
    void inputValue() {
        // Test case 1: Test with a positive integer input
        ManagerIO<Integer> integerManagerIO = new ManagerIO<>();
        String input1 = "10";
        Integer result1 = integerManagerIO.inputValue("Enter an integer:", Integer.class);
        assertEquals(Integer.valueOf(input1), result1);

        // Test case 2: Test with a negative integer input
        ManagerIO<Double> doubleManagerIO = new ManagerIO<>();
        String input2 = "-5";
        Double result2 = doubleManagerIO.inputValue("Enter an integer:", Double.class);
        assertEquals(Double.valueOf(input2), result2);

        // Test case 3: Test with zero as input
        ManagerIO<String> stringManagerIO = new ManagerIO<>();
        String input3 = "0";
        String result3 = stringManagerIO.inputValue("Enter an integer:", String.class);
        assertEquals(input3, result3);
    }

    @Test
    void inputArray() {
    }

    @Test
    void showResult() {
    }

    @Test
    void testShowResult() {
    }

    @Test
    void showArr() {
    }

    @Test
    void showTable() {
    }
}