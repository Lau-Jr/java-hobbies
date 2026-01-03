import java.util.Scanner;
public class PrintNumber{
private static final String DIGIT_TABLE = "0123456789abcdef";
 // Print n in any base, recursively
// Precondition: n >= 0, 2 <= base <= 16
// Postcondition: Number in a new base is printed
public static void printNumInNewBase(int n, int base){
	if (n >= base){ 
	    printNumInNewBase(n / base, base);
	}
	System.out.print(DIGIT_TABLE.charAt((n % base)));
}
public static void main(String[] args){
	Scanner get = new Scanner(System.in);
	System.out.println("Enter the number you want to convert");
	int num = get.nextInt();
	System.out.println("Enter the base for the convertion");
	int base = get.nextInt();	
      PrintNumber.printNumInNewBase(num,base);  
 }
}
