package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public final class Gcd {
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    private static final int MIN_NOD = 1;
    private static final int MAX_NOD = 25;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 10;

    public static void start() {
        Random random = new Random();
        String[][] rounds = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int nod = random.nextInt(MIN_NOD, MAX_NOD);
            int a = random.nextInt(MIN_NUMBER, MAX_NUMBER) * nod;
            int b = random.nextInt(MIN_NUMBER, MAX_NUMBER) * nod;
            var question = a + " " + b + " ";
            var answer = String.valueOf(gcdExpression(a, b));

            rounds[i][0] = question;
            rounds[i][1] = answer;
        }
        Engine.run(DESCRIPTION, rounds);
    }

    private static int gcdExpression(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

