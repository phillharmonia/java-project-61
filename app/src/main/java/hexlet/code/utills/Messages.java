package hexlet.code.utills;

public class Messages {
    public static void printWrongAnswer(String answer, String correctAnswer, String userName) {
        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
        System.out.println("Let's try again, " + userName + "!");
    }

    public static void printCorrect() {
        System.out.println("Correct!");
    }

    public static void printCongratulations(String userName) {
        System.out.println("Congratulations, " + userName + "!");
    }
    public static void printQuestion(String question) {
        System.out.println("Question: " + question);
    }
    public static void printYourAnswer() {
        System.out.print("Your answer: ");
    }
}
