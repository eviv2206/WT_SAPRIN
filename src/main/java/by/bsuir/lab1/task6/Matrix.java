package by.bsuir.lab1.task6;

public class Matrix {
    public static double[][] createShiftedMatrix(double[] arr){
        double[][] matrix = new double[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                matrix[i][j] = arr[(i + j) % arr.length];
            }
        }
        return matrix;
    }
}
