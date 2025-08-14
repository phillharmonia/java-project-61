package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;

public final class Progression {
    private static final String DESCRIPTION = "What number is missing in the progression?";
    private static final int MIN_NUMBER = 1;
    private static final int MAX_STEP = 10;
    private static final int START_MAX = 50;
    private static final int MAX_LENGTH = 10;

    public static void start() {
        String[][] rounds = new String[Engine.ROUNDS][2];
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int start = random.nextInt(MIN_NUMBER, START_MAX);
            int step = random.nextInt(MIN_NUMBER, MAX_STEP);

            String[] progression = generateProgression(start, step, MAX_LENGTH);

            int hiddenIndex = random.nextInt(0, MAX_LENGTH - 1);
            String answer = progression[hiddenIndex];
            progression[hiddenIndex] = "..";

            String question = String.join(" ", progression);

            rounds[i][0] = question;
            rounds[i][1] = answer;
        }

        Engine.run(DESCRIPTION, rounds);
    }

    private static String[] generateProgression(int start, int step, int length) {
        String[] progression = new String[length];
        for (int i = 0; i < length; i++) {
            progression[i] = String.valueOf(start + i * step);
        }
        return progression;
    }
}
