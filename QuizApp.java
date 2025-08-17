package com.elavatelabs;

import java.util.*;

class Question {
 String question;
 String[] options;
 int correctAnswer; 
 
 Question(String question, String[] options, int correctAnswer) {
     this.question = question;
     this.options = options;
     this.correctAnswer = correctAnswer;
 }
}


public class QuizApp {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     
     List<Question> questions = new ArrayList<>();
     questions.add(new Question("Which language is platform-independent?",
             new String[]{"C++", "Python", "Java", "C"}, 2));
     questions.add(new Question("Which keyword is used to inherit a class in Java?",
             new String[]{"extends", "implements", "inherits", "super"}, 0));
     questions.add(new Question("What is the size of int in Java?",
             new String[]{"2 bytes", "4 bytes", "8 bytes", "Depends on OS"}, 1));
     questions.add(new Question("Which collection doesn’t allow duplicates?",
             new String[]{"List", "Set", "Map", "ArrayList"}, 1));
     questions.add(new Question("Which method is the entry point of a Java program?",
             new String[]{"main()", "start()", "run()", "execute()"}, 0));

     int score = 0;

     System.out.println("===== Welcome to Online Quiz App =====\n");

     for (int i = 0; i < questions.size(); i++) {
         Question q = questions.get(i);
         System.out.println("Q" + (i + 1) + ": " + q.question);

         for (int j = 0; j < q.options.length; j++) {
             System.out.println((j + 1) + ". " + q.options[j]);
         }

         System.out.print("Your answer (1-4): ");
         int answer = sc.nextInt();

         if (answer - 1 == q.correctAnswer) {
             System.out.println("✅ Correct!\n");
             score++;
         } else {
             System.out.println("❌ Wrong! Correct answer: " + q.options[q.correctAnswer] + "\n");
         }
     }

     System.out.println("===== Quiz Finished! =====");
     System.out.println("Your Score: " + score + "/" + questions.size());

     if (score == questions.size()) {
         System.out.println("🎉 Excellent! Perfect Score!");
     } else if (score >= 3) {
         System.out.println("👍 Good Job! Keep practicing.");
     } else {
         System.out.println("😢 Needs Improvement. Try again!");
     }

     sc.close();
 }
}

