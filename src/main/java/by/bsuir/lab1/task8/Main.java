package by.bsuir.lab1.task8;

import by.bsuir.lab1.LIS;
import by.bsuir.lab1.ManagerIO;
import by.bsuir.lab1.util.Converter;

public class Main {
    public static void main(String[] args) {
        ManagerIO<Double> managerIO = new ManagerIO<>();
        int n = managerIO.inputValue(ManagerIO.MESSAGE_INPUT_VALUE_N, Double.class).intValue();
        int m = managerIO.inputValue(ManagerIO.MESSAGE_INPUT_VALUE_N, Double.class).intValue();
        Double[] arr1 = managerIO.inputArray(n, ManagerIO.MESSAGE_INPUT_ARR, Double.class);
        Double[] arr2 = managerIO.inputArray(m, ManagerIO.MESSAGE_INPUT_ARR, Double.class);
        double[] result = LIS.mergeLIS(Converter.convertObjectDoubleArrayToDouble(arr1), Converter.convertObjectDoubleArrayToDouble(arr2));
        managerIO.showArr(Converter.convertDoubleArrayToObjectDouble(result), ManagerIO.MESSAGE_OUTPUT_RESULT);
    }
}
