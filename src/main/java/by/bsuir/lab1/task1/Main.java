package by.bsuir.lab1.task1;

import by.bsuir.lab1.FunctionEvaluator;
import by.bsuir.lab1.ManagerIO;

public class Main {
    public static void main(String[] args) {
        ManagerIO<Double> manager = new ManagerIO<>();
        double x = manager.inputValue(ManagerIO.MESSAGE_INPUT_VALUE_X, Double.class);
        double y = manager.inputValue(ManagerIO.MESSAGE_INPUT_VALUE_Y, Double.class);
        double res = FunctionEvaluator.calculateFraction(x, y);
        manager.showResult(res, ManagerIO.MESSAGE_OUTPUT_RESULT);
    }
}