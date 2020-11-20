
package adventuregame;

 
import java.io.*;
import java.util.Scanner;

 
public class AdventureGame {

 
  public static void main(String[] args) throws FileNotFoundException {
    
      
      Scanner keyboard = new Scanner(System.in);
      
      
        System.out.println("Welcome to our crappy text based adventure game!"
                + "Would you like to create the game or play the game?");

        String userResponse = keyboard.nextLine();
      if ( userResponse.equalsIgnoreCase("create") )
        {
            System.out.println("Please provide a game introduction or description");
            String userDescription = keyboard.nextLine();
            PrintWriter fileWriter = new PrintWriter("gameintroduction.txt");
            fileWriter.println(userDescription);
        }  
}
}
