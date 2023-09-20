package by.bsuir.lab1.task5;

import by.bsuir.lab1.LIS;
import by.bsuir.lab1.ManagerIO;
import by.bsuir.lab1.util.Converter;

public class Main {
    public static void main(String[] args) {
        ManagerIO<Integer> managerIO = new ManagerIO<>();
        int n = managerIO.inputValue(ManagerIO.MESSAGE_INPUT_VALUE_N, Integer.class);
        Integer[] arrObjects = managerIO.inputArray(n, ManagerIO.MESSAGE_INPUT_ARR, Integer.class);
        int[] arr = Converter.convertObjectIntegerArrayToInt(arrObjects);
        int res = LIS.findMinRemove(arr);
        managerIO.showResult(res, ManagerIO.MESSAGE_OUTPUT_RESULT);
    }
}
