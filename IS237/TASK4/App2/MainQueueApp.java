import java.util.Scanner;

public class MainQueueApp{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%n%nHow Many Employees Do You have?: ");
		byte scoreCounts = input.nextByte();
		
		AdtQueue scores = new AdtQueue();
		

		for(int i = 1; i<=scoreCounts; i++){
			
			System.out.printf("%nEmployees %d details: ",i);

			System.out.printf("%nName: ");
			String name = Utility.nextLine(input);

			System.out.printf("%nSalary: ");
			double salary = input.nextDouble();

			System.out.printf("%nWhich Year were they born: ");
			int year = input.nextInt();
			
			scores.enqueue(name,year,salary);
			
		}
		
		scores.displayAll();
		
		System.out.printf("%nDo you want to delete Employee from Queue??: ");
		String studentDeletionResponse = input.next().toLowerCase();
		
		if(studentDeletionResponse.equals("yes")){
			Node deletedEmployee = scores.dequeue();
			System.out.printf("%n%s has been deleted from queue",deletedEmployee.getEmployee());
			
		}
		else{
			System.out.printf("%nnothing Has been Deleted From the Queue");
		}
		
		scores.displayAll();
		
	}
	
	
}