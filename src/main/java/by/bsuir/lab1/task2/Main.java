package by.bsuir.lab1.task2;

import by.bsuir.lab1.ManagerIO;

public class Main {
    public static void main(String[] args) {
        ManagerIO<Double> managerIO = new ManagerIO<>();
        double x = managerIO.inputValue(ManagerIO.MESSAGE_INPUT_VALUE_X, Double.class);
        double y = managerIO.inputValue(ManagerIO.MESSAGE_INPUT_VALUE_Y, Double.class);
        boolean res = PointBelongsChecker.isBelong(x, y);
        managerIO.showResult(res, ManagerIO.MESSAGE_OUTPUT_RESULT);
    }

}
