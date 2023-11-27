/**
 * Author: D Pitt
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);// new Scanner object to get input from the user
        int points = 0;
        String userAnswer; //this will store the user's answer

        // first question
        String question1 = "What is the capital of France?";
        String answer1 = "Paris";

        //second question and answer
        String question2 = "What is the capital of Germany?";
        String answer2 = "Berlin";

        System.out.println(question1); //output question 1
        userAnswer =  sc.nextLine(); //get input from user

        //process the question
        if(userAnswer.equals(answer1)){
            System.out.println("Correct");
            points = points + 1; //update points if correct answer
        }
        else{
            System.out.println("Incorrect");
        }

        System.out.println(question2);
        userAnswer =  sc.nextLine();

        if(userAnswer.equals(answer2)){
            System.out.println("Correct");
            points = points + 1; //update points if correct answer
        }
        else{
            System.out.println("Incorrect");
        }


        //output points
        System.out.println("Your score " + points);

    }
}