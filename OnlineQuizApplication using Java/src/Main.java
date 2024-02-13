import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Question> quizQuestions = new ArrayList<>();
        quizQuestions.add(new Question(" Which of the following option leads to the portability and security of Java?",
                new String[]{"Bytecode is executed by JVM", "The applet makes the Java code secure and portable", "Use of exception handling", "Dynamic binding between objects"},
                0));
        quizQuestions.add(new Question("Which of the following is not a Java features?",
                new String[]{"Dynamic", "Architecture Neutral", "Use of pointers", "Object-oriented"},
                2));
        quizQuestions.add(new Question("Which of the following is NOT a primitive data type in Java?",
                new String[]{"int", "boolean", "string", "char"},
                2));
        quizQuestions.add(new Question("Which of the following concept that Java does not support?",
                new String[]{"inheritance", "pointer", "array", "encapsulation"},
                1));
        quizQuestions.add(new Question("Which of the following is not a keyword in java?",
                new String[]{"import", "super", "class", "method"},
                3));
        quizQuestions.add(new Question("Which program is used to compile Java source code into bytecode?",
                new String[]{"javap", "javac", "java", "javad"},
                1));
        quizQuestions.add(new Question("In which of the following scenario(s), the static block is used in Java?",
                new String[]{"To create static variables", "To initialize instance variables", "To initialize static variables", "To create new objects"},
                2));
        quizQuestions.add(new Question("All classes in java are inherited from which class?",
                new String[]{"java.lang.Object", "java.lang.class", "java.class.inherited", "java.class.object"},
                0));
        quizQuestions.add(new Question("Which of the following is the correct statement for creating a package?",
                new String[]{"<package name> package;","package <package name>;", "package;", "<package name>;"},
                1));
        quizQuestions.add(new Question("Which of the following is required for developing a Java program?",
                new String[]{"JRE","JDK without JRE", "JRE without JDK", "JDK"},
                3));
        Quiz quiz = new Quiz(quizQuestions);
        quiz.startQuiz();
    }
}