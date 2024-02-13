import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions;
    private int userScore;

    public Quiz(List<Question> questions) {
        this.questions = questions;
        this.userScore = 0;
    }

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);

        for (Question question : questions) {
            displayQuestion(question);
            int userAnswer = getUserAnswer(scanner, question);

            if (isAnswerCorrect(question, userAnswer)) {
                System.out.println("Correct!\n");
                userScore++;
            } else {
                System.out.println("Incorrect. The correct answer was: " + getCorrectAnswerText(question) + "\n");
            }
        }

        displayResult();
    }

    private void displayQuestion(Question question) {
        System.out.println(question.getQuestionText());
        String[] options = question.getOptions();

        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
        System.out.print("Your answer: ");
    }

    private int getUserAnswer(Scanner scanner, Question question) {
        int userAnswer;
    
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // consume the invalid input
            }
            userAnswer = scanner.nextInt();
    
            if (userAnswer < 1 || userAnswer > question.getOptions().length) {
                System.out.println("Invalid choice. Please enter a valid number.");
            }
    
        } while (userAnswer < 1 || userAnswer > question.getOptions().length);
    
        return userAnswer - 1; // Adjust to 0-based index
    }
    

    private boolean isAnswerCorrect(Question question, int userAnswer) {
        return userAnswer == question.getCorrectAnswerIndex();
    }

    private String getCorrectAnswerText(Question question) {
        int correctAnswerIndex = question.getCorrectAnswerIndex();
        String[] options = question.getOptions();
    
        if (correctAnswerIndex >= 0 && correctAnswerIndex < options.length) {
            return options[correctAnswerIndex];
        } else {
            return "Unable to retrieve correct answer";
        }
    }
    

    private void displayResult() {
        System.out.println("Quiz completed! Your score: " + userScore + " out of " + questions.size());
    }
}