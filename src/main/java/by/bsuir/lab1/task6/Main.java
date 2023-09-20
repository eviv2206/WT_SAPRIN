package by.bsuir.lab1.task6;

import by.bsuir.lab1.ManagerIO;
import by.bsuir.lab1.util.Converter;

public class Main {
    public static void main(String[] args) {
        ManagerIO<Double> managerIO = new ManagerIO<>();
        int n = managerIO.inputValue(ManagerIO.MESSAGE_INPUT_VALUE_N, Double.class).intValue();
        Double[] inputArray = managerIO.inputArray(n, ManagerIO.MESSAGE_INPUT_ARR, Double.class);
        double[] arr = Converter.convertObjectDoubleArrayToDouble(inputArray);
        double[][] matrix = Matrix.createShiftedMatrix(arr);
        managerIO.showTable(Converter.convertDoubleMatrixToObjectDouble(matrix));
    }
}
