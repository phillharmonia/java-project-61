package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public final class Calc {
    private static final String DESCRIPTION = "What is the result of the expression?";
    private static final char[] OPS = {'+', '-', '*'};
    private static final int MIN = 1;
    private static final int MAX = 20;

    public static void start() {
        Random random = new Random();
        String[][] rounds = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int a = random.nextInt(MIN, MAX);
            int b = random.nextInt(MIN, MAX);
            char operator = OPS[random.nextInt(OPS.length)];
            var question = a + " " + operator + " " + b;
            var answer = String.valueOf(calculate(a, b, operator));

            rounds[i][0] = question;
            rounds[i][1] = answer;
        }
        Engine.run(DESCRIPTION, rounds);
    }
    private static int calculate(int a, int b, char operator) {
        return switch (operator) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };
    }
}

