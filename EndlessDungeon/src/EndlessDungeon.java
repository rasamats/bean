/**
 * 
 */
/**
 * @author iD Student
 *
 */
import java.util.Random;
public class EndlessDungeon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int playerHealth, enemyHealth;
		playerHealth = 100;
		enemyHealth = generator.nextInt(10) + 1;
		int enemiesDefeated = 0;
		while(playerHealth>0){ 
			System.out.println("You have " + playerHealth + " health.");
			int playerDamage, enemyDamage;
			playerDamage = generator.nextInt(5) + 1;
			enemyDamage = generator.nextInt(3) + 1;
			playerHealth -= enemyDamage;
			enemyHealth -= playerDamage;
			System.out.println("You attack the enemy for " + playerDamage);
			System.out.println("The enemy attacks you for " + enemyDamage);
			if(enemyHealth <= 0) {
				System.out.println("You have defeated the enemy! you kick down the door to the next room and prepare to fight the next enemy.");
			enemyHealth = generator.nextInt(10) + 1;
			enemiesDefeated++;
			
			
				
			}
			if (playerHealth <= 0) {
				System.out.println("Game over! You defeated " +  enemiesDefeated + " enemies!");
			}	
			}
			
			
			}
		}
		



