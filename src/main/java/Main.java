import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int currentRandomInt = rand.nextInt(100) + 1;
        int guessCount = 5;
        int currentGuess = 0;
        boolean gameOver = false;

        while(!gameOver){

            if(guessCount == 5){
                System.out.print("Guess a number between 1 and 100 ");
                currentGuess = Integer.parseInt(scanner.nextLine());
                guessCount--;
            }

            if(guessCount <= 0){
                System.out.println("You lose!");
                System.out.println("The number to guess was: " + currentRandomInt);
                gameOver = true;
            } else if(currentGuess < currentRandomInt && currentGuess >= 1 && currentGuess <= 100){
                guessCount--;
                System.out.print("Please pick a higher number ");
                currentGuess = Integer.parseInt(scanner.nextLine());
            } else if(currentGuess == currentRandomInt){
                System.out.print("You win!");
                gameOver = true;

            } else if(currentGuess > currentRandomInt && currentGuess <= 100 && currentGuess >= 1) {
                guessCount--;
                System.out.print("Please pick a lower number ");
                currentGuess = Integer.parseInt(scanner.nextLine());
            } else{
                System.out.print("Your guess is not between 1 and 100, please try again ");
                currentGuess = Integer.parseInt(scanner.nextLine());
            }

        }
    }
}
