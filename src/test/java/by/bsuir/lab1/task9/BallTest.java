package by.bsuir.lab1.task9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BallTest {

    @Test
    void getColor() {
        Ball ball = new Ball(Color.BLUE, 1);
        assertEquals(Color.BLUE, ball.getColor());
    }

    @Test
    void getWeight() {
        Ball ball = new Ball(Color.BLUE, 1);
        assertEquals(1, ball.getWeight());
    }
}
