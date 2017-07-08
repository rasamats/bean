/**
 * 
 */
import java.util.Scanner;
import java.util.Random;
/**
 * @author iD Student
 *
 */
public class Adventure {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int playerLevel = 1;
		String playerName = "Yonik";
		double playerHealth = 100.0;
		System.out.println("What is your name?");
		Scanner userInput= new Scanner(System.in);
		playerName = userInput.nextLine();
		Random generator= new Random();
		int  enemyHealth = generator.nextInt(30) + 1;
		int playerDamage = 10;
		int enemyDamage = generator.nextInt(25);
		int enemy2Health = generator.nextInt(55) + 1;
		int enemy2Damage = generator.nextInt(35);
		while(playerHealth>=1){
		
		System.out.println("Welcome "+ playerName + "!");
		delay (500);
		System.out.println("Before you is a large cave mouth. Darkness is before you. Dare you enter the cave of Wonders?(Yes/No) CASE SENSITIVE");
		String answer;
		answer = userInput.nextLine();
		
			if (answer.equals("yes")) {
				System.out.println("Cool!");
			}
			else if(answer.equals("Yes")){
				System.out.println("Cool!");
				delay(750);
				System.out.println("Today is the first day of many. Today you, "+ playerName +" began the adventure of a lifetime.");
				delay(1800);
				System.out.println("You will remember it forever, and the people of Windendorf will remember you for centuries more");
				delay(2150);
				System.out.println("Or you'll be remembered as the fat lard that the family never accepted for his video game addiction. But I'm just the narrator.");
				delay (2150);
				System.out.println("if you go to the left, you might be able to get a lot of loot, but thousands of little trolls dwell in its depths");
				delay(2150);
				System.out.println("Right, no loot and we get to face off kittens");
				String leftorright;
				leftorright = userInput.nextLine();
				if (leftorright.equals("left")){
						System.out.println("Good choice!");
						delay(850);
						System.out.println("Whats this!");
						delay(850);
						System.out.println("The 2 mischivous Trolls, Stumpy and Paul."); 
						delay(950);
						System.out.println("'Hello there young traveler. MAXIMUS Has told us of your existence,"+ playerName + "'");
						delay(1100);
						System.out.println("'We challenge you to a ROUND OF FISTICUFFS'");
						System.out.println("BATTLE START");
							while(enemyHealth>0 && playerHealth>0){
								enemyHealth -= playerDamage;
								System.out.println("You slammed the attackers for "+ playerDamage + " Damage");
								System.out.println("They are at " + enemyHealth + " health");
								playerHealth -= enemyDamage;
								System.out.println("Stumpy and Paul deal you " + enemyDamage + " damage");
							}
							System.out.println("'Good job Traveler. You have emberassed me, i have been beaten by a disgusting human. Take my wand of trickery.'");
							System.out.println("+5 Damage");
							System.out.println("+15 health");
							playerDamage += 5;
							playerHealth += 15;
							if (playerHealth>=90){
								playerLevel++;
								System.out.println("You have leveled up!");
								System.out.println("+15 Health");
								playerHealth += 15;
							}

							
						System.out.println("Would you like to keep on going?");
						String dontUse;
						dontUse = userInput.nextLine();
						System.out.println("Good! Lets keep on going");
						delay(750);
						System.out.println("Is that...... a Centaur?");
						delay(750);
						System.out.println("I am Eugene! Head Servant to the Supreme Leader MAXIMUS");
						delay(1100);
						System.out.println("Battle me,For ULTIMATE glory");
						delay(800);
						System.out.println("BATTLE START");
						 	while(enemy2Health>0 && playerHealth>0){
						 		playerHealth -= enemy2Damage;
						 		System.out.println("Eugene slapped you for "+ enemy2Damage + " Damage. You are at "+ playerHealth + " Health");
						 		enemy2Health -= playerDamage;
						 		System.out.println("You attacked Eugene for "+ playerDamage + " Damage");
						 		
						 	}
						 	System.out.println("Congratulations! You Won the Game!");
					}
								
				}
			
		//TODO Add story line or put this into a loop
				else if(answer.equals("No")) {
					System.out.println("Fine. Ya nerd.");
					System.out.println("Ya know the funniest thing just happened. You ran off a cliff ");
					playerHealth -=100;
					System.out.println("Game over! Try Again");
				}
				else if(answer.equals("no")) {
				System.out.println("Well no one cares what you think. Lets start the adventure!(Yes I know you dont want to but you ran this program so too bad).");
				}		
		String answer2;
		answer2=userInput.nextLine();
		
		// TODO Auto-generated method stub
		}
		}
	 public static void delay(int millis) {
	        try {
	            Thread.sleep(millis);
	        } catch (InterruptedException exp) {
	        }
	    }

	}


