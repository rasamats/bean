/**
 * 
 */

/**
 * @author iD Student
 *
 */
import java.util.Random;
public class Treasure {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random generator= new Random();
		int gold;
		gold = generator.nextInt(5);
		if (gold>1){
			System.out.println("You opened the chest and found " + gold + " gold pieces!");
		}
		else if (gold==1){
			System.out.println("You opened the chest and found only 1 piece!)");
		}	
		else if (gold==0){
			System.out.println("Too bad! You opened the chest and found nothing!");
		}
		// TODO Auto-generated method stub
		
	}

}
