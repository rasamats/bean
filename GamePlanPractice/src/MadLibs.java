import java.util.Scanner;
public class MadLibs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intro();
		
		Scanner userInput = new Scanner(System.in);
		getUserInput("Enter an Adjective: ");
		String adjective = getUserInput("Enter an adjective: ");
		getUserInput("Enter a noun: ");
		String noun = userInput.nextLine();
		getUserInput("Enter an animal: ");
		String animal = userInput.nextLine();
		getUserInput("Enter a sound: ");
		String sound = userInput.nextLine();
		printMadLib(adjective, noun, animal, sound);
	}
	public static void intro(){
		System.out.println("Welcome to MadLibs");
	}
	public static void printMadLib(String adjective, String noun, String animal, String noise){
		System.out.println(adjective + " Macdonald had a " + noun+ ", E-I-E-I-O");
		System.out.println("and on that " + noun + " he had a " + animal + ", E-I-E-O");
		System.out.println("with a " + noise + " " + noise +" here,");
		System.out.println("and a " + noise +" " + noise + " there,");
		System.out.println("here a " + noise + ", there a " + noise + ",");
		System.out.println("everywhere a " + noise +" " + noise);
		System.out.println(adjective + " Macdonald had a " + noun + ",E-I-E-I-O");
	}
	public static String getUserInput(String message){
		System.out.print(message);
		return "I'm a string";
	}
}
