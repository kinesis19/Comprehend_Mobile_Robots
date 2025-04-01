public abstract class Quiz {

    String question;

    public Quiz(String question) {
        this.question = question;
    }

    public void askQuestion() {
        System.out.println("Question: " + question);
    }

    public abstract boolean checkAnswer(String input);

}