package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public final class Even {
    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    public static void start() {
        Random random = new Random();
        String[][] rounds = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = random.nextInt(MIN_NUMBER, MAX_NUMBER);
            var question = number + "";
            var answer = isEven(number) ? "yes" : "no";

            rounds[i][0] = question;
            rounds[i][1] = answer;
        }
        Engine.run(DESCRIPTION, rounds);
    }
    private static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
