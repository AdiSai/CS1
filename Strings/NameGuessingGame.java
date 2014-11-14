
/**
 * Write a description of class NameGuessingGame here.
 * 
 * @author (Adithya and Iyn) 
 * @version (9/17/14)
 */
public class NameGuessingGame
{
    public static void main (String[] args)
    {
        String name1 = "Steve Jobs"; //Name 1
        String name2 = "Bill Gates"; // Name 2 
        String name3 = "Daniel John Jr"; //Name 3

        int namelen1 = name1.length(); //Len name 1
        int namelen2 = name2.length(); //Len name 2
        int namelen3 = name3.length(); //Len name 3

        String name1sub = name1.substring(2, namelen1-3); //Sub name 1
        String name2sub = name2.substring(2, namelen2-3); //Sub name 2
        String name3sub = name3.substring(2, namelen3-3); //Sub name 3

        System.out.println("Welcome to the guessing game."); //Welcome
        
        System.out.println("The clue to the first name is, " + name1sub + "."); //Print name 1 sub
        System.out.println("The clue to the second name is, " + name2sub + "."); //Print name 2 sub
        System.out.println("The clue to the third name is, " + name3sub + "."); //Print name 3 sub
    }
}
