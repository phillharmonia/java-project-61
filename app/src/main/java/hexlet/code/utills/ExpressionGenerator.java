package hexlet.code.utills;

import java.util.Random;

public class ExpressionGenerator {
    private static final char[] Operators = {'+', '-', '*'};
    private static final Random Random = new Random();

    public static int generateNumber(int number) {
        return Random.nextInt(number);
    }
}