import java.util.Scanner;

public class Adventure {

	public static String goToKitchen() {
		Scanner scan = new Scanner(System.in);
		System.out.println("There is a long countertop with dirty dishes everywhere. \n"
				+ "Off to one side there is, as you'd expect, a refrigerator. \n"
				+ "You may open the 'refrigerator' or look in a 'cabinet'. ");
		return scan.next();		
	}
	
	public static String goUpstairs() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Upstairs you see a hallway."
						+ "At the end of the hallway is the master bedroom. \n"
						+ "There is also a bathroom off the hallway. \n "
								+ "Where would you like to go (bedroom or bathroom)? ");
		return scan.next();		
	}
	
	public static void goToBedroom() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Near the window, there is an antique chest of drawers. \n"
				+ "The top drawer has an ancient lock on it. You want to jimmy the lock \n"
				+ "and ... ");
		foundIt();	
	}
	
	public static void goToBathroom() {
		Scanner scan = new Scanner(System.in);
		System.out.println("In the bathroom, when you open the cabinet door, you find \n"
				+ "a secret passage way ... ");
		foundIt();		
	}
	
	public static String goToRefrigerator() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Inside the refrigerator you see food and stuff. \n"
				+ "It looks pretty nasty. Would you like to eat some of the food? (yes or no)? ");
		return scan.next();			
	}
	
	public static String goToCabinet() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Inside the cabinet is an ancient vase. \n"
				+ "Would you like to look inside? (yes or no) ");
		return scan.next();			
	}	
	
	public static String OpenVase() {
		Scanner scan = new Scanner(System.in);
		System.out.println("You just opened the vase and a vapour filled the room! \n"
				+ "You cough and choke, and pass out ... ");
		return scan.next();			
	}	
	
	public static void foundIt() {
		System.out.println("Congratulations! You found the hidden treasure! ");			
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String next;
		
		System.out.println("You are in a creepy house! "
				+ "Would you like to go upstairs or into the kitchen? ");
				next = scan.next();
				
		if (next.equals("kitchen")) {			
			next = goToKitchen();
			if (next.equals("refrigerator")) {	
				next = goToRefrigerator(); 
				if (next.equals("yes")) {	
					System.out.println("You die of food poisoning! Sorry!");
				}
					
				else if (next.equals("no")) {	
					System.out.println("You die of starvation! Sorry!");
				} else {
					System.out.println("Invalid response. Program terminated");
				}
			}
			else if (next.equals("cabinet")) {
				next = goToCabinet();
				if (next.equals("yes")) {	
					next = OpenVase();
				}
					
				else if (next.equals("no")) {	
					System.out.println("OK, let's go upstairs! ");
					next = goUpstairs();
					if (next.equals("bedroom")) {	
						goToBedroom();
					}
						
					else if (next.equals("bathroom")) {						
						goToBathroom();
					} else {
						System.out.println("Invalid response. Program terminated");
					}
				} else {
					System.out.println("Invalid response. Program terminated");
				}
			}
			
		} else if (next.equals("upstairs")) {
				next = goUpstairs();
				if (next.equals("bedroom")) {	
					goToBedroom();
				}
					
				else if (next.equals("bathroom")) {						
					goToBathroom();
					
				} else {
					System.out.println("Invalid response. Program terminated");
				}
		}
		
	}

}
