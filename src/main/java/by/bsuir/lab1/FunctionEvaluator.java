package by.bsuir.lab1;

public class FunctionEvaluator {
    public static double calculateFraction(double x, double y) {
        double sinRes = Math.sin(x + y);
        double absRes = Math.abs(x - (2 * x)/(1 + x * x * y * y));
        return (1 + sinRes) / (2 + absRes) + x;
    }

    public static Double[][] calcTngWithStep(double a, double b, double h){
        int numOfSteps = (int) Math.floor(((b - a) / h));
        Double[][] resArr = new Double[2][numOfSteps];
        for (int i = 0; i < numOfSteps; i++){
            resArr[i][0] = a;
            resArr[i][1] = Math.tan(a);
            a += h;
        }
        return resArr;
    }

}
