package by.bsuir.lab1.task4;

import java.util.Random;

public class MillerRabin {
    public static boolean isPrime(int n, int k) {
        if (n <= 1 || n == 4) {
            return false;
        }
        if (n <= 3) {
            return true;
        }

        int d = n - 1;
        int s = 0;
        while (d % 2 == 0) {
            d /= 2;
            s++;
        }

        for (int i = 0; i < k; i++) {
            int a = 2 + new Random().nextInt(n - 4);
            int x = power(a, d, n);

            if (x == 1 || x == n - 1) {
                continue;
            }

            for (int j = 0; j < s - 1; j++) {
                x = (x * x) % n;
                if (x == 1) {
                    return false;
                }
                if (x == n - 1) {
                    break;
                }
            }

            if (x != n - 1) {
                return false;
            }
        }

        return true;
    }

    private static int power(int x, int y, int p) {
        int result = 1;
        x = x % p;
        while (y > 0) {
            if (y % 2 == 1) {
                result = (result * x) % p;
            }
            y = y >> 1; // y = y / 2
            x = (x * x) % p;
        }
        return result;
    }
}
