package hexlet.code.utills;

import java.util.Random;

public class ExpressionGenerator {
    private static final char[] OPERATORS = {'+', '-', '*'};
    private static final Random RANDOM = new Random();
    private static final int FIRST_ODD_DIVISOR = 3;

    public static int generateNumber(int min, int max) {
        return RANDOM.nextInt(min, max);
    }
    public static char generateOperator() {
        return OPERATORS[RANDOM.nextInt(OPERATORS.length)];
    }
    public static int calculate(int a, int b, char operator) {
        return switch (operator) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int[] generateProgression(int start, int step, int length) {
        int[] progression = new int[length];
        for (int i = 0; i < length; i++) {
            progression[i] = start + i * step;
        }
        return progression;
    }
    public static String isPrime(int number) {
        if (number < 2) {
            return "false";
        }
        if (number == 2) {
            return "true";
        }
        if (number % 2 == 0) {
            return "false";
        }
        for (int i = FIRST_ODD_DIVISOR; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return "false";
            }
        }
        return "true";
    }
}
