import java.util.Scanner;
public class lanternFly {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("The lanternfly is an invasive species and ");
        System.out.println("is a threat to our trees and plants.");
        
        System.out.print("How many did you squash this summer? ");
        int num = input.nextInt();
        if (num < 2) {
            System.out.println("youre a disgrace.                         (jk)");
        }
        else if (num < 10) {
            System.out.println("You can do better than that!");
        } // end if statement
        else if (num < 15) {
            System.out.println("Great job but you can do more!");
        } // end else statement
        else if (num < 25) {
            System.out.println("Thank you for doing your part and serving your community!");
        } else {
            System.out.println("YOURE ON A KILLING SPREE.");
        }
        
    } // end main method

} // end class
    
