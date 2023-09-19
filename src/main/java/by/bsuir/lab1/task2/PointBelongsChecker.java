package by.bsuir.lab1.task2;

public class PointBelongsChecker<T extends Number>  {
    private static final int firstRectX1 = -4;
    private static final int firstRectX2 = 4;
    private static final int firstRectY1 = 0;
    private static final int firstRectY2 = 5;

    private static final int secondRectX1 = -6;
    private static final int secondRectX2 = 6;
    private static final int secondRectY1 = -3;
    private static final int secondRectY2 = 0;

    public boolean isBelong(T xValue, T yValue){
        double x = xValue.doubleValue();
        double y = yValue.doubleValue();

        return ((x >= secondRectX1 && x <= secondRectX2 && y >= secondRectY1 && y <= secondRectY2)
                ||
                (x >= firstRectX1 && x <= firstRectX2 && y >= firstRectY1 && y <= firstRectY2));
    }
}
