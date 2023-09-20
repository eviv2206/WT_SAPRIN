package by.bsuir.lab1.task9;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Ball blueBall1 = new Ball(Color.BLUE, 10);
        Ball blueBall2 = new Ball(Color.BLUE, 10);
        Ball redBall = new Ball(Color.RED, 20);
        Ball yellowBall = new Ball(Color.YELLOW, 30);
        Basket basket = new Basket(new ArrayList<>(Arrays.asList(blueBall1, blueBall2, redBall, yellowBall)));
        System.out.println("Кол-во синих мячиков: " + basket.getNumOfBallsByColor(Color.BLUE));
        System.out.println("Общий вес корзины: " + basket.getSummaryWeight());
    }
}
