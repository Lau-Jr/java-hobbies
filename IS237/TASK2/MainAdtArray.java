import java.util.Scanner;

public class MainAdtArray {
	
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);	
		
		System.out.printf("%nWhat is the Array Size: ");
		int size = input.nextInt();
		
		AdtArray arr = new AdtArray(size);
		
		System.out.printf("%nHow Many Imployees You want to add Initially? ");
		
		int initialSize = input.nextInt();
		
		for(int i = 0; i<initialSize; i++){// what if initialSize>size????
			
			System.out.printf("Enter Employee %d%n", i+1);
			arr.addItem(input.next());
		}
		
		System.out.printf("%n=====Initial Array=====%n");
		arr.printArray();
		
		System.out.printf("%nEnter Employee and Position to insert");
		System.out.printf("%nEmployee: ");
		String employee = input.next();
		
		System.out.printf("%nPosition to Insert: ");
		int pos = input.nextInt();
		
		arr.insert(pos,employee);
		
		System.out.printf("%n=====After Insertion=====%n");
		arr.printArray();
		
		System.out.printf("%nEnter Employee to Delete");
		System.out.printf("%nEmployee: ");
		String employeeToDelete = input.next();
		
		boolean isDeleted = arr.isDeleted(employeeToDelete);
		
		if(isDeleted){
			
			System.out.printf("%nEmployee %s has been deleted ",employeeToDelete);
			System.out.printf("%n=====After Deletion=====%n");
			arr.printArray();
		}
		else{
			System.out.printf("%nEmployee %s can not be deleted ",employeeToDelete);
		}
		
		arr.sort();
		System.out.printf("%n=====After Sort=====%n");
		arr.printArray();
		
	}
	

	
	
}