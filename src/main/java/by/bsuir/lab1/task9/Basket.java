package by.bsuir.lab1.task9;

import java.util.ArrayList;

public class Basket {
    private final ArrayList<Ball> balls;

    public Basket() {
        balls = new ArrayList<>();
    }

    public Basket(ArrayList<Ball> balls) {
        this.balls = balls;
    }

    public ArrayList<Ball> getBalls() {
        return balls;
    }

    public void addBall(Ball balls) {
        this.balls.add(balls);
    }

    public void addBalls(ArrayList<Ball> balls) {
        this.balls.addAll(balls);
    }

    public void removeBall(Ball balls) {
        this.balls.remove(balls);
    }

    public double getSummaryWeight() {
        double weight = 0;
        for (Ball ball : balls) {
            weight += ball.getWeight();
        }
        return weight;
    }

    public int getNumOfBallsByColor(Color color) {
        ArrayList<Ball> result = new ArrayList<>();
        for (Ball ball : balls) {
            if (ball.getColor().equals(color)) {
                result.add(ball);
            }
        }
        return result.size();
    }
}
