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
            int[] progression = generateProgression(start, step, MAX_LENGTH);

            int hiddenIndex = random.nextInt(0, MAX_LENGTH - 1);
            String answer = String.valueOf(progression[hiddenIndex]);

            StringBuilder question = new StringBuilder();
            for (int j = 0; j < progression.length; j++) {
                if (j == hiddenIndex) {
                    question.append(".. ");
                } else {
                    question.append(progression[j]).append(" ");
                }
            }

            rounds[i][0] = question.toString().trim();
            rounds[i][1] = answer;
        }

        Engine.run(DESCRIPTION, rounds);
    }

    private static int[] generateProgression(int start, int step, int length) {
        int[] progression = new int[length];
        for (int i = 0; i < length; i++) {
            progression[i] = start + i * step;
        }
        return progression;
    }
}
