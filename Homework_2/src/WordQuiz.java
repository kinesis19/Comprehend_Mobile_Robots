public class WordQuiz extends Quiz {

    private String correctAnswer;

    public WordQuiz(String question, String userAnswer) {
        super(question);
        this.correctAnswer = userAnswer;
    }

    @Override
    public boolean checkAnswer(String input) {

        if (input.equalsIgnoreCase(correctAnswer)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("Incorrect. Try again.");
            return false;
        }
    }
}