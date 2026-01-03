import java.util.Scanner;

class Factorial {

public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please Enter Your Number: ");
	
	int number = input.nextInt();
	int og = number;
	
	long factorial = number;
	
	while(number > 1){
		//number -= 1;//number = number -1;
		factorial = factorial * --number;
	}
	
	System.out.printf("%d! is %d",og,factorial);
}

}