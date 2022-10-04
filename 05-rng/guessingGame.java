import java.util.Random;
import java.util.Scanner;

public class guessingGame { // start of the class

   public static void main(String[] args) { // start of the main method
      int difference;
      Random random = new Random(); 
      Scanner scanner = new Scanner(System.in); 
      int number = random.nextInt(100) + 1; // generates a random number between 1 - 100
      System.out.println("I am guessing a number between 1-100, what is it?");
      int userIntGuess = scanner.nextInt(); // receives user input in the terminal

      if (number == userIntGuess) { // check if the user's chosen number is equal to the randomly generated number
System.out.println("Congrats! The Number that I was thinking of is: " + number);

      } else {
         difference = Math.abs(number - userIntGuess); // finds the absolute value of the difference between the user's inputted number and the randomly generated number
         System.out.println("The number that I was guessing was " + number);
         System.out.println("You were off by " + difference + ", try again!");
      
      }
      


   }
}