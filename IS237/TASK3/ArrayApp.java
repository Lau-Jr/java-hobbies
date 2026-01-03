import java.util.Scanner;

public class ArrayApp{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Array Size");
		int size = input.nextInt();
		
		AdtArray array = new AdtArray(size);
		
		System.out.println("Enter initial Number of employees");
		int empCount = input.nextInt();
		
		for(int i=0; i< empCount; i++){
			System.out.printf("Enter name of employee %d%n", i+1);
			String name = input.next();
			array.addItem(name, i);
		}
		
		System.out.printf("%nEnter new Employee to insert: ");
		String newEmployee = input.next();
		
		System.out.printf("%nEnter index to insert this employee: ");
		int pos = input.nextInt();
		
		array.insert(pos, newEmployee);
		
		System.out.printf("%nEnter employee to delete: ");
		String empToDelete = input.next();
		array.delete(empToDelete);
		
		array.sort();
		
		System.out.printf("%nEnter employee You want to search: ");
		String empToSearch = input.next();
		array.searchItem(empToSearch);
		
		System.out.printf("%n======EMPLOYEES======%n");
		for(int m = 0;m<array.getNumItems(); m++ ){
			System.out.println(array.getItem(m));
		}
		
		
	}
	
}