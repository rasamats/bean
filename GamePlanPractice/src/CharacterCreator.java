//TODO: Import Scanner
import java.util.Scanner;
/**
 * 
 */

/**
 * @author iD Student
 *
 */
public class CharacterCreator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner playerInput;
		playerInput= new Scanner(System.in);
		String playerName;
		System.out.println("What Is Your Character's Name?");
		playerName = playerInput.nextLine();
		double playerHealth;
		System.out.println("How much health do you have, " + playerName + "?");
		playerHealth = playerInput.nextDouble();
		System.out.println("Welcome " + playerName+ " you have " + playerHealth + " HP!");
		
}

}
