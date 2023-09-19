package by.bsuir.lab1.task3;

import by.bsuir.lab1.FunctionEvaluator;
import by.bsuir.lab1.ManagerIO;

public class Main {
    public static void main(String[] args) {
        ManagerIO<Double> managerIO = new ManagerIO<>();
        double a = managerIO.inputValue(ManagerIO.MESSAGE_INPUT_VALUE_A, Double.class);
        double b = managerIO.inputValue(ManagerIO.MESSAGE_INPUT_VALUE_B, Double.class);
        double h = managerIO.inputValue(ManagerIO.MESSAGE_INPUT_VALUE_H, Double.class);
        Double[][] result = FunctionEvaluator.calcTngWithStep(a, b, h);
        managerIO.showTable(result);
    }
}
