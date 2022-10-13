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



// Ref 
// BSullivan@fdrhs.org
    }

    public static void studentGenerator() {


        Scanner s = new Scanner(System.in);

System.out.println("Input your first name:");
String firstName = s.nextLine();
firstName = firstName.toLowerCase();
firstName = firstName.replaceAll(" ", ""); // Final firstName variable

System.out.println("Input your last name:");
String lastName = s.nextLine();
lastName = lastName.toLowerCase();
lastName = lastName.substring(0,1);
lastName = lastName.replaceAll(" ", ""); // Final lastName variable

System.out.println("Enter your Student OSIS Number:");
String studentOSIS = s.nextLine();
studentOSIS = studentOSIS.substring(5);
studentOSIS = studentOSIS.replaceAll(" ", ""); // Final studentOSIS variable
String DOEDOMAIN = "@nycstudents.net";

System.out.println("Your email is " + firstName + lastName + studentOSIS + DOEDOMAIN);

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


    }
}
