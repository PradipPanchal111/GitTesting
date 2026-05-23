package Project1;

import java.util.Scanner;

public class QuestionService {

    Scanner sc=new Scanner(System.in);
    Question[] question=new Question[5];
    String[] answer=new String[5];
    int score=0;
    public QuestionService(){
        question[0] = new Question(1, "What is the size of int in Java?", "2", "4", "8", "16", "4");
        question[1] = new Question(2, "What is the size of char in Java?", "1", "2", "4", "8", "2");
        question[2] = new Question(3, "What is the size of double in Java?", "4", "8", "16", "32", "8");
        question[3] = new Question(4, "What is the size of long in Java?", "2", "4", "8", "16", "8");
        question[4] = new Question(5, "What is the size of boolean in Java?", "1", "2", "3", "4", "1");
    }

    public void palyQuiz(){
        for(int i=0;i<question.length;i++){
            System.out.println(question[i].toString());
            

            String givenAnswer=sc.nextLine();
            String actualAnswer=question[i].getAnswer();
            if(givenAnswer.equals(actualAnswer)){
                score++;
            }
        }
        System.out.println(" Your Score is: "+score);
        sc.close();
    }

    
}
