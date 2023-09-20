package by.bsuir.lab1.task7;

import by.bsuir.lab1.ManagerIO;
import by.bsuir.lab1.util.Converter;

public class Main {
    public static void main(String[] args) {
        ManagerIO<Double> managerIO = new ManagerIO<>();
        int n = managerIO.inputValue(ManagerIO.MESSAGE_INPUT_VALUE_N, Double.class).intValue();
        Double[] inputArray = managerIO.inputArray(n, ManagerIO.MESSAGE_INPUT_ARR, Double.class);
        double[] arr = Converter.convertObjectDoubleArrayToDouble(inputArray);
        BubbleSort.sort(arr);
        managerIO.showArr(Converter.convertDoubleArrayToObjectDouble(arr), ManagerIO.MESSAGE_OUTPUT_RESULT);
    }
}
