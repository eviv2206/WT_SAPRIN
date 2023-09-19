package by.bsuir.lab1;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ManagerIO<T> {

    public static final String MESSAGE_INPUT_VALUE_X = "Введите значение x:";
    public static final String MESSAGE_INPUT_VALUE_Y = "Введите значение y:";
    public static final String MESSAGE_INPUT_VALUE_A = "Введите значение a:";
    public static final String MESSAGE_INPUT_VALUE_B = "Введите значение b:";
    public static final String MESSAGE_INPUT_VALUE_H = "Введите значение h:";
    public static final String MESSAGE_INPUT_VALUE_N = "Введите значение n:";
    public static final String MESSAGE_INPUT_VALUE = "Введите значение: ";
    public static final String MESSAGE_INPUT_ARR = "Введите массив:";
    public static final String MESSAGE_OUTPUT_RESULT_ARR = "Массив: ";
    public static final String MESSAGE_OUTPUT_RESULT = "Результат: ";
    private final Scanner scanner;

    public ManagerIO() {
        this.scanner = new Scanner(System.in);
    }

    public T inputValue(String message, Class<T> clazz) {
        System.out.println(message);
        String input = this.scanner.nextLine();
        if (clazz == Integer.class) {
            return clazz.cast(Integer.parseInt(input));
        } else if (clazz == Double.class) {
            return clazz.cast(Double.parseDouble(input));
        } else if (clazz == String.class) {
            return clazz.cast(input);
        }
        return null;
    }

    public T[] inputArray(int numOfElem, String message, Class<T> clazz) {
        System.out.println(message);
        T[] arr = (T[]) Array.newInstance(clazz, numOfElem);

        for (int i = 0; i < numOfElem; i++) {
            arr[i] = inputValue(MESSAGE_INPUT_VALUE, clazz);
        }

        return arr;
    }


    public void showResult(Object result, String message){
        System.out.println(message);
        System.out.println(result);
    }

    public void showResult(Object result){
        System.out.println(result);
    }

    public void showArr(T[] arr, String message){
        System.out.println(message);
        for (T t : arr) {
            System.out.print(t + " ");
        }
        System.out.println('\n');
    }

    public void showTable(T[][] result) {
        for (T[] ts : result) {
            for (T t : ts) {
                System.out.print(t + " ");
            }
            System.out.println('\n');
        }
    }
}
