package by.bsuir.lab1.task4;

import by.bsuir.lab1.ManagerIO;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int k = 10;
        ManagerIO<Integer> managerIO = new ManagerIO<>();
        int n = managerIO.inputValue(ManagerIO.MESSAGE_INPUT_VALUE_N, Integer.class);
        ArrayList<Integer> indexPrimeList = new ArrayList<>();
        Integer[] arr = managerIO.inputArray(n, ManagerIO.MESSAGE_INPUT_ARR, Integer.class);
        for (int i = 0; i < arr.length; i++){
            if (MillerRabin.isPrime(arr[i], k)){
                indexPrimeList.add(i);
            }
        }
        managerIO.showArr(indexPrimeList.toArray(new Integer[0]), ManagerIO.MESSAGE_OUTPUT_RESULT_ARR);
    }
}
