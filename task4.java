import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
public class task4 {
    private static final Scanner scanner = new Scanner(System.in);
    private static int score = 0;
    private static final int TIME_LIMIT = 10;
    private static boolean answered = false;
    public static void main(String[] args) {
        System.out.println("Are you ready for quiz!");
        String str=scanner.nextLine();
        if(str.equals("yes")){
        Question[] questions = {
            new Question("What is the name of India's first supercomputer?", new String[]{"A. Param 8000", "B. Shaheen II", "C. Tianhe-1", "D. PACE"}, 'A'),
            new Question("Who holds the record for the highest individual score in a single Test innings?", new String[]{"A. Sachin Tendulkar", "B. Brian Lara", "C.Don Bradman", "D. Virender Sehwag"}, 'B'),
            new Question("Which Indian festival is known as the Festival of Lights?", new String[]{"A. Holi", "B. Navratri", "C. Eid", "D. Diwali"}, 'D')
        };
        for (Question question : questions) {
            displayQuestion(question);
        }
        System.out.println("Quiz finished! Your final score is: " + score);
    }
    else{System.out.println("You are not interested in quiz,come soon");} 
}
    private static void displayQuestion(Question question) {
        System.out.println(question.getQuestionText());
        for (String option : question.getOptions()) {
            System.out.println(option);
        }
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (!answered) {
                    System.out.println("Time's up!\n");
                    System.out.println("Your time is up,don't waste your now atleast!!!\n");
                    System.out.println(question.getQuestionText());
                    for (String option : question.getOptions()) {
                        System.out.println(option);
                    }
                }
                timer.cancel();
            }
        }, TIME_LIMIT * 1000);

        String answer = scanner.nextLine();
        answered = true;
        checkAnswer(answer.charAt(0), question.getCorrectAnswer());
        timer.cancel();
        answered = false;
    }
    private static void checkAnswer(char userAnswer, char correctAnswer) {
        if (userAnswer == correctAnswer) {
            System.out.println("\nCorrect!");
            System.out.println("You done a great job!,Keep it up!\n");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer was " + correctAnswer + ".\n");
        }
    }
        static class Question {
        private final String questionText;
        private final String[] options;
        private final char correctAnswer;

        public Question(String questionText, String[] options, char correctAnswer) {
            this.questionText = questionText;
            this.options = options;
            this.correctAnswer = correctAnswer;
        }

        public String getQuestionText() {
            return questionText;
        }

        public String[] getOptions() {
            return options;
        }

        public char getCorrectAnswer() {
            return correctAnswer;
        }
    }
}
