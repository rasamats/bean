/**
 * 
 */

/**
 * @author iD Student
 *
 */
public class CheckInventory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] inventory = new String[5];
		inventory[0] = "HP Potion";
		inventory[1] = "Magic Sword";
		inventory[2] = "Wooden Shield";
		printInventory(inventory);
	
		
	}
	public static void printInventory (String[]inventory) {
		System.out.println(inventory[0]);
		System.out.println(inventory[1]);
		System.out.println(inventory[2]);
		System.out.println(inventory[3]);
		System.out.println(inventory[4]);
	for(int i=0;i < inventory.length;i++){
		System.out.println(inventory[i]);
		
	}
	}
	
	public static boolean checkInventory(String[] inventory,String toCheck){
		for(int i=0; i < inventory.length; i++){
		String item = inventory[i];
		if(item != null && item.equals(toCheck)){
			return true;
			
		}
		}
		return false;
	}
		
		
}
	

