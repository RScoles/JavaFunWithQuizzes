package main;

public class TrueFalseQuestion extends Question {

    public TrueFalseQuestion (String question, String answer) {
        super (question, answer);
    }

    @Override
    public boolean checkAnswer(String answer) {
        if (answer.toUpperCase().equals(this.getTheAnswer().toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }
}
