import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Mini Quiz!");
        System.out.println(); // Visual spacing

        //First question
        System.out.println("What is the capitol of France?");
        String answer1 = input.nextLine();

        //Check to see if the answer is correct
        if (answer1.equalsIgnoreCase("Paris")){
            System.out.println("Correct!");
            score ++;
        }else{
            System.out.println("Incorrect. The capitol of France is Paris");
        }
        System.out.println(); // visual spacing

        //Second question
        System.out.println("What is the largest ocean in the world?");
        String answer2 = input.nextLine();

        if (answer2.equalsIgnoreCase("Pacific Ocean")){
            System.out.println("Correct!");
            score++;
        }else{
            System.out.println("Incorrect. The largest ocean in the world is the Pacific ocean");
        }
        System.out.println(); // visual spacing

        //Third question
        System.out.println("What is the sum of 9 x 11?");
        int answer3 = input.nextInt();

        if (answer3 == 99){
            System.out.println("Correct!");
            score++;
        }else{
            System.out.println("Incorrect. 9 x 11 = 99");
        }
        System.out.println(); // visual spacing
        input.nextLine(); // clear leftover newline

        //Fourth question
        System.out.println("Who is the current president of the U.S?");
        String answer4 = input.nextLine();

        if (answer4.equalsIgnoreCase("Donald Trump")){
            System.out.println("Correct!");
            score++;
        }else{
            System.out.println("Incorrect! The current president of the U.S is Donald Trump");
        }
        System.out.println();

        System.out.printf("Total score = %d \n", score);
    }
}