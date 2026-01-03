package classesAndObjectsIntro;

import java.util.Scanner;

public class DateApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		Date d1 = new Date(12, 25, 2025);		
		System.out.print("Original: ");
		d1.displayDate(); // 12/25/2025
		
		d1.setMonth(10); 
		d1.setDay(5); 
		d1.setYear(2025);

		System.out.print("Updated: ");
		d1.displayDate(); // 05/10/2025
		
		Date d2 = new Date(8, 20, 2010); 
		System.out.println("Month: " + d2.getMonth()); // 8 
		System.out.println("Day: " + d2.getDay()); // 20 
		System.out.println("Year: " + d2.getYear()); // 2010
		
	}
}
