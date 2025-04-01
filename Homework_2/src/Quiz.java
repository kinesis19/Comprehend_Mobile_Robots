public abstract class Quiz {

    String question;
    String userAnswer;

    public Quiz(String question, String userAnswer) {
        this.question = question;
    }

    public void askQuestion() {
        System.out.println("Question: " + question);
    }

    public abstract boolean checkAnswer(String input);

};