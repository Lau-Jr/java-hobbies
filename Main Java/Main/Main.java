import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Your Role: ");
		String role = input.nextLine();
		
		switch(role){
			case "TA":			
			case "Assistant Lecturer":			
			case "Lecturer":			
			case "Senior Lecturer":			
			case "Associate Prof":			
			case "prof":
			System.out.print("\nWewe ni Mwalimu");
			break;
			
			case "student":
			System.out.print("\nWewe ni Mwanafunzi");
			break;
			
			default:
			System.out.print("\nWewe sio Mtu wa Chuo");
			break;			
		}
	}
	
}
