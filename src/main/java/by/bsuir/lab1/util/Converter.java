package by.bsuir.lab1.util;

public class Converter {
    public static Double[][] convertDoubleMatrixToObjectDouble(double[][] doubleMatrix){
        Double[][] matrix = new Double[doubleMatrix.length][doubleMatrix[0].length];
        for (int i = 0; i < doubleMatrix.length; i++){
            for (int j = 0; j < doubleMatrix[i].length; j++){
                matrix[i][j] = doubleMatrix[i][j];
            }
        }
        return matrix;
    }

    public static double[] convertObjectDoubleArrayToDouble(Double[] doubleArray){
        double[] array = new double[doubleArray.length];
        for (int i = 0; i < doubleArray.length; i++){
            array[i] = doubleArray[i];
        }
        return array;
    }

    public static Double[] convertDoubleArrayToObjectDouble(double[] doubleArray){
        Double[] array = new Double[doubleArray.length];
        for (int i = 0; i < doubleArray.length; i++){
            array[i] = doubleArray[i];
        }
        return array;
    }

    public static int[] convertObjectIntegerArrayToInt(Integer[] integerArray){
        int[] array = new int[integerArray.length];
        for (int i = 0; i < integerArray.length; i++){
            array[i] = integerArray[i];
        }
        return array;
    }
}
