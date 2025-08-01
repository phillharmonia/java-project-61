package hexlet.code.utills;

import java.util.Random;

public class ExpressionGenerator {
    private static final char[] Operators = {'+', '-', '*'};
    private static final Random Random = new Random();

    public static int generateNumber(int min, int max) {
        return Random.nextInt(min, max);
    }
    public static char generateOperator() {
        return Operators[Random.nextInt(Operators.length)];
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
}
