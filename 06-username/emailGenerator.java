import java.util.Random;
import java.util.Scanner;
 

public class emailGenerator {
    public static void main(String[] args) {

Scanner s = new Scanner(System.in);
System.out.println("Are you a teacher or student?");
String selectionMenu = s.nextLine();
    selectionMenu = selectionMenu.toUpperCase();
    selectionMenu = selectionMenu.replaceAll(" ", "");


    if (selectionMenu.equals("TEACHER")) {
        teacherGenerator();
    } else if (selectionMenu.equals("STUDENT")) {
        studentGenerator();
    }

 System.out.println("How long do you want your password to be?");
 int userPasswordLength = s.nextInt();
 String userPassword = generatePassword(userPasswordLength);
System.out.println("Your password is: " + userPassword + " .... do not share with anyone.");
 


// Ref
// BSullivan@fdrhs.org
    }

    public static void studentGenerator() {


        Scanner s = new Scanner(System.in);

        Random random = new Random();
System.out.println("Input your first name:");
String firstName = s.nextLine();
firstName = firstName.toLowerCase();
firstName = firstName.replaceAll(" ", ""); // Final firstName variable

System.out.println("Input your last name:");
String lastName = s.nextLine();
lastName = lastName.toLowerCase();
lastName = lastName.substring(0,1);
lastName = lastName.replaceAll(" ", ""); // Final lastName variable

String DOEDOMAIN = "@nycstudents.net";

int randomNum = random.nextInt(12) + 1 ;

System.out.println("Your email is " + firstName + lastName + randomNum + DOEDOMAIN);

    }

    public static void teacherGenerator() {

        Scanner s = new Scanner(System.in);

        System.out.println("Input your first name:");
        String firstName = s.nextLine();
        firstName = firstName.substring(0,1);
        firstName = firstName.toUpperCase();
        firstName = firstName.replaceAll(" ", ""); // Final firstName variable
        
        System.out.println("Input your last name:");
        String lastName = s.nextLine();
        lastName = lastName.toLowerCase();

        // Capitalize the first character
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1); 
        lastName = lastName.replaceAll(" ", ""); // Final lastName variable
        
    
        String DOEDOMAIN = "@nyc.gov.net";
        
        System.out.println("Your email is " + firstName + lastName + DOEDOMAIN);


    } // end of teacherGenerator

   public static String generatePassword(int length) {    // start of generatePassword
    String password = "";
    // generate a value between 33 - 47 for symbols (inclusive)
    // generate a value between 48 - 57 for numbers (inclusive)
    // generate a value between 65 - 90 for capital letters (inclusive)
    // generate a value between 97 - 122 for lowercase letters (inclusive)
        for(int i = 0; i < length; i++) {
            int rand = (int)(4 * Math.random());

            switch(rand) {
                case 0:
                    password += String.valueOf((char)(Math.random()*(47-33+1)+33));
                    break;
                case 1:
                    password += String.valueOf((char)(Math.random()*(57-48+1)+48));
                    break;
                case 2:
                    password += String.valueOf((char)(Math.random()*(90-65+1)+48));
                    break;
                case 3:
                    password += String.valueOf((char)(Math.random()*(122-97+1)+48));
                    break;
                    

            }
            
    }

    

     
    
return password;


/* int asciiValue1 = 65;
char char1 = (char)(asciiValue1);
System.out.println(char1); */


   }    // end of generatePassword

        
    

   
}
 