//Authors : Harry and Xin
//Period 5 
//9.23.22


import java.util.Scanner;


public class laCasa {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want your first unique word to be?");
        String uniqueWord1 = scanner.nextLine();
        System.out.println("What do you want your second unique word to be?");
        String uniqueWord2 = scanner.nextLine();
triangularTop();
floor();
wall();
floor();

uniqueWall(uniqueWord1, uniqueWord2);

wall();
floor();
triangularTop();    
        
    }

    public static void floor() {
       
        System.out.println(" +------+");

    }
public static void wall() {
    System.out.println(" |      |");
    System.out.println(" |      |");
}
    public static void uniqueWall(String uniqueWord1, String uniqueWord2) {
        System.out.println(" |" + uniqueWord1 + "|");
        System.out.println(" |" + uniqueWord2 + "|");
        System.out.println(" +------+");


    }

    public static void triangularTop() {

        System.out.println("    /\\   ");
        System.out.println("   /  \\   "); 
        System.out.println("  /    \\");
    
    
    
    }
}
