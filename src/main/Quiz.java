package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
   private ArrayList<Question> questions = new ArrayList<Question>();
   private int numberOfQuestionsCorrect = 0;
   private Scanner scanner = new Scanner(System.in);

    //comstructor
    public Quiz() {

    }
    //methods
    public void addQuestion (Question question) {
        this.questions.add(question);
    }

    public void runQuiz() {
        //loop through question
        for(Question question : questions) {
            //ask the user question
            System.out.println(question.getTheQuestion());
            //Get user answer
            String usersAnswer = this.getUserAnswers();
            //check the answer
           boolean userGotQuestionCorrect = question.checkAnswer(usersAnswer);
           //Increment numberOfQuestionsCorrect if answered correctly
            if (userGotQuestionCorrect) {
                this.numberOfQuestionsCorrect++;
            }
        }
        //Grade the quiz
        double percentageCorrect = ((double) this.numberOfQuestionsCorrect / (double) this.questions.size()) * 100;
        System.out.println("Users Grade:" + percentageCorrect + "%");
    }

    private String getUserAnswers() {
        String usersAnswer = scanner.nextLine();
        return usersAnswer;
    }
}
