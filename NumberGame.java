import java.util.Random;
import java.util.Scanner;
public class NumberGame{
       public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
           Random random = new Random();
           int score = 0;
           char playAgain;
System.out.println("=========================================");
           System.out.println("       NUMBER GUESSING GAME");
System.out.println("=========================================");
           do{
              int randomNumber = random.nextInt(100) + 1;
              int maxAttempts = 5;
              int attempts = 0;
              boolean guessedCorrectly = false;
              System.out.println("\nGuess a number between 1 and 100");
              System.out.println("You have "+ maxAttempts + " attempts.");
              while(attempts < maxAttempts){
                 System.out.println("Enter your guess: ");
                 int guess = sc.nextInt();
                 attempts++;
                 if(guess == randomNumber){
System.out.println("Congratulations! You guessed the correct number.");
System.out.println("Attempts Taken: " + attempts);
                    score++;
                    guessedCorrectly = true;
                    break;
                 }
                 else if (guess < randomNumber)
{
                     System.out.println("Too Low! Try Again.");
                 }
                 else{
                     System.out.println("Too High! Try Again.");
                 }
                 System.out.println("Remaining Attempts: " +                   
                                                                       (maxAttempts - attempts));
              }
              if (!guessedCorrectly){
                  System.out.println("\nGame Over!");
                  System.out.println("The Correct Number was: " + randomNumber);
              }
              System.out.println("Current Score: " + score);
              System.out.println("\nDo you want to play again? (Y/N): ");
              playAgain = sc.next().charAt(0);
          }while(playAgain == 'Y' || playAgain == 'y');
System.out.println("\n=======================================");
          System.out.println("Final score: " + score);
          System.out.println("Thank You For Playing!");
System.out.println("=========================================");
          sc.close();
       }
}
