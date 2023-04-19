package main;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz myQuiz = new Quiz();
        MultipleChoiceQuestion myMultiChoiceQuestion = new MultipleChoiceQuestion("What sound does a dog make? \nA: Bark\nB: Quack\nPlease just type a single letter as answer", "A");
        myQuiz.addQuestion(myMultiChoiceQuestion);

        CheckBoxQuestion myCheckBoxQuestion = new CheckBoxQuestion("Select all the apply, which animals can fly?\nA: Penguin\nB: Doves\nC: Owls","B, C");
        myQuiz.addQuestion(myCheckBoxQuestion);

        TrueFalseQuestion myTrueFalseQuestion = new TrueFalseQuestion("Dogs are omnivorses? \n True or False?", "True");
        myQuiz.addQuestion(myTrueFalseQuestion);

        myQuiz.runQuiz();

    }
}
