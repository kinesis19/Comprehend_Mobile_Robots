import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Word quizzes
        Quiz[] wordQuizzes = {
            new WordQuiz("What is the data type used to store text in Java?", "String"),
            new WordQuiz("Which loop structure is commonly used in Java?", "for"),
            new WordQuiz("What is the boolean type value for true or false?", "boolean")
        };

        // Number quizzes
        Quiz[] numberQuizzes = {
            new NumberQuiz("What is 5! ?", 120),
            new NumberQuiz("How many values can be represented with 8 bits?", 256),
            new NumberQuiz("How many states are there in the United States?", 50)
        };

        // Word quiz section
        System.out.println("=== Word Quiz ===");
        for (Quiz quiz : wordQuizzes) {
            boolean solved = false;
            while (!solved) {
                quiz.askQuestion();
                System.out.print("Your answer: ");
                String input = sc.nextLine();
                solved = quiz.checkAnswer(input);
            }
            System.out.println("--------------------");
        }

        // Number quiz section
        System.out.println("=== Number Quiz ===");
        for (Quiz quiz : numberQuizzes) {
            boolean solved = false;
            while (!solved) {
                quiz.askQuestion();
                System.out.print("Your answer: ");
                String input = sc.nextLine();
                solved = quiz.checkAnswer(input);
            }
            System.out.println("--------------------");
        }

        System.out.println("You have completed all quizzes. Well done!");
        sc.close();
    }
}