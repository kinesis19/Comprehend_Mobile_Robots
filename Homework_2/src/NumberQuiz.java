public class NumberQuiz extends Quiz {

    private int correctAnswer;

    public NumberQuiz(String question, int userAnswer) {
        super(question);
        this.correctAnswer = userAnswer;
    }

    @Override
    public boolean checkAnswer(String input) {
        int userAnswer = Integer.parseInt(input);

        if (userAnswer == this.correctAnswer) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("Incorrect. Try again.");
            return false;
        }
    }
}