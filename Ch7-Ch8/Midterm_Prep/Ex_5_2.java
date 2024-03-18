
/**
 * Write a description of class Ex_5_2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
import java.util.Scanner;
public class Ex_5_2
{
    public static void main() {
        
        main(null);
        
    }
    public static void main(String[] args) {
        
        int randomNumber = random();
        
        int userguess = userGuess();
        
        if(userguess != Integer.MIN_VALUE) {
            guessLoop(randomNumber, userguess);
        }
        
    }
    
    public static int random() {
        
        Random numbergen = new Random();
        
        int random = numbergen.nextInt(100);
        
        return random;
        
    }
    
    public static int userGuess() {
        
        Scanner input = new Scanner(System.in);
        
        System.out.printf("\nPlease guess a number between one and one hundred: ");
        int userGuess = input.nextInt();
        
        return userGuess;
    }
    
    public static void guessLoop(int randomNumber, int userguess) {
        
        if(randomNumber == userguess) {
            
            System.out.printf("\nYou guessed: %d\n" + "The program guessed: %d\n"
                                + "Congrats! Your guesses match!", userguess, randomNumber);
                                
        }
        
        else if (randomNumber != userguess) {
            
            int guessdifference = Math.abs(randomNumber - userguess);
            System.out.printf("\nYou guessed: %d\n" +  "The program guessed: %d\n"
                                + "Sorry, your guess was off by %d!\n",userguess, randomNumber, guessdifference);
            System.out.printf("Let's guess again!");
            randomNumber = random();
            userguess = userGuess();
            guessLoop(randomNumber, userguess);
            
        }
        
    }
}
