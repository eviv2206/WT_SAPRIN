package by.bsuir.lab1.task9_11;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasketTest {

    private static Basket basket;
    private static Ball blueBall;
    private static Ball yellowBall;
    private static Ball greenBall;
    private static Ball redBall1;
    private static Ball redBall2;

    @BeforeAll
    static void beforeAll() {
        blueBall = new Ball(Color.BLUE, 1);
        yellowBall = new Ball(Color.YELLOW, 2);
        greenBall = new Ball(Color.GREEN, 3);
        redBall1 = new Ball(Color.RED, 4);
        redBall2 = new Ball(Color.RED, 5);
        basket = new Basket(new ArrayList<>(Arrays.asList(blueBall, yellowBall, greenBall, redBall1, redBall2)));
    }

    @Test
    void getBalls() {
        ArrayList<Ball> expectedBalls = new ArrayList<>(Arrays.asList(blueBall, yellowBall, greenBall, redBall1, redBall2));
        ArrayList<Ball> actualBalls = basket.getBalls();
        assertEquals(expectedBalls, actualBalls);
    }

    @Test
    void addBall() {
        Ball ball = new Ball(Color.RED, 6);
        basket.addBall(ball);
        ArrayList<Ball> expectedBalls = new ArrayList<>(Arrays.asList(blueBall, yellowBall, greenBall, redBall1, redBall2, ball));
        ArrayList<Ball> actualBalls = basket.getBalls();
        assertEquals(expectedBalls, actualBalls);
    }

    @Test
    void addBalls() {
        ArrayList<Ball> balls = new ArrayList<>(Arrays.asList(new Ball(Color.RED, 6), new Ball(Color.RED, 7)));
        basket.addBalls(balls);
        ArrayList<Ball> expectedBalls = new ArrayList<>(Arrays.asList(blueBall, yellowBall, greenBall, redBall1, redBall2, balls.get(0), balls.get(1)));
        ArrayList<Ball> actualBalls = basket.getBalls();
        assertEquals(expectedBalls, actualBalls);
    }

    @Test
    void removeBall() {
        Ball ball = new Ball(Color.RED, 6);
        basket.removeBall(ball);
        ArrayList<Ball> expectedBalls = new ArrayList<>(Arrays.asList(blueBall, yellowBall, greenBall, redBall1, redBall2));
        ArrayList<Ball> actualBalls = basket.getBalls();
        assertEquals(expectedBalls, actualBalls);
    }

    @Test
    void getSummaryWeight() {
        double expectedWeight = blueBall.getWeight() + yellowBall.getWeight() + greenBall.getWeight() + redBall1.getWeight() + redBall2.getWeight();
        double actualWeight = basket.getSummaryWeight();
        assertEquals(expectedWeight, actualWeight);
    }

    @Test
    void getNumOfBallsByColor() {
        int expectedNumOfRedBalls = 2;
        int actualNumOfRedBalls = basket.getNumOfBallsByColor(Color.RED);
        assertEquals(expectedNumOfRedBalls, actualNumOfRedBalls);

        int expectedNumOfBlueBalls = 1;
        int actualNumOfBlueBalls = basket.getNumOfBallsByColor(Color.BLUE);
        assertEquals(expectedNumOfBlueBalls, actualNumOfBlueBalls);
    }
}
