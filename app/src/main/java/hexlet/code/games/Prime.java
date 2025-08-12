package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;

public final class Prime {
    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private static final int FIRST_ODD_DIVISOR = 3;

    public static void start() {
        String[][] rounds = new String[Engine.ROUNDS][2];
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = random.nextInt(MIN_NUMBER, MAX_NUMBER);
            var question = number + "";
            var answer = isPrime(number) ? "yes" : "no";

            rounds[i][0] = question;
            rounds[i][1] = answer;
        }

        Engine.run(DESCRIPTION, rounds);
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = FIRST_ODD_DIVISOR; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
