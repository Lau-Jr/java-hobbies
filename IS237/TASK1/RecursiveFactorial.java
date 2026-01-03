/* 
fact(5) = 5 * fact(4)
fact(4) = 4 * fact(3)
fact(3) = 3 * fact(2)
fact(2) = 2 * fact(1)
fact(1) = 1 * fact(0)
fact(0) = 1 */

import java.util.Scanner;
public class RecursiveFactorial {
	
	public static long calculateFactorial(int number){
		
		if(number == 0){
			return 1;
		}
		
		return number * calculateFactorial(number - 1);
	}
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number to Get it's Factorial: ");
		
		int number = input.nextInt();
		
		long factorial = calculateFactorial(number);
		
		System.out.printf("%nfactorial of %d is %d%n",number,factorial);
	}
	
}
