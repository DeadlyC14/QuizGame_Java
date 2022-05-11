import java.util.Scanner;

public class Main {
    //score
    static int score = 0;

    public static void main(String[] args) {
        //question array
        String[] question = new String[5];
        question[0] = "What is 11 times 11?";
        question[1] = "Who is the creator of Minecraft?";
        question[2] = "Who is the protagonist of The Legend Of Zelda video game series?";
        question[3] = "Who is the protagonist of the popular anime, Attack On Titan?";
        question[4] = "In the anime mentioned above, the characters talk about Titan weak points, what is such weak point?";


        //question answers array
        String[] questionAnswers = new String[5];
        questionAnswers[0] = "121";
        questionAnswers[1] = "Notch";
        questionAnswers[2] = "Link";
        questionAnswers[3] = "Eren";
        questionAnswers[4] = "Nape";

        //name... just name
        String name;

        //answer array
        String[] answer = new String[5];

        //scanner
        Scanner scanner = new Scanner(System.in);

        // asks for name and stores it in the name variables for later referencing
        print("Welcome to the quiz, may I ask your name?");
        name = scanner.nextLine();

        print("Happy to meet you " + name + ", I am DC and created this program to train in Java");
        print("Since there is no need to drag this on further, let's start with the first question");
        print(" ");

        // game loop
        for (int i = 0; i < 5;) {
            print(question[i]); //prints the question

            answer[i] = scanner.nextLine(); //stores answer from user inside the array
            score = questionChecker(i, i, questionAnswers, answer); //checks if answer is correct

            print(" ");
            i++;

            if (i == 5) {
                //replay variables
                String replay;
                boolean yesOrNo = true;

                //tells the score
                if (score == 5) {
                    print("You answered 100% of the questions correctly!!");

                } else if (score == 0) {
                    print("You failed since you answered none of them correctly...");

                }
                else {
                    print("You answered " + score + " questions correctly and " + (5 - score) + " questions incorrectly");
                }

                //checks if player wishes to repeat game
                while (yesOrNo) {
                    // asks and later stores player response in a variable
                    print(" ");
                    print("Would you like to play again? (Y/N)");

                    replay = scanner.nextLine().toLowerCase();

                    // checks if player wishes to restart game (y = yes, n = no)
                    if (replay.equals("y")) {
                        print("Game Restarted");
                        print(" ");

                        i = 0;
                        yesOrNo = false;

                    } else if (replay.equals("n")) {
                        break;
                    } else {
                        print("That's not an available option");
                    }
                }
            }
        }

        print(" ");
        print("Quiz game has ended");
    }

    //checks to see if the answer was right
    private static int questionChecker(int x, int y, String[] questionAnswer, String[] answer) {
        if (answer[x].equals(questionAnswer[y])) {
            System.out.println(" ");
            System.out.println("That's correct!");
            score += 1;
        }
        else {
            System.out.println(" ");
            System.out.println("That's not quite right");
        }
        return score;
    }

    // simple log function
    public static void print(String theString) {
        System.out.println(theString);
    }
}
