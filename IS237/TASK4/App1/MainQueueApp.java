import java.util.Scanner;

public class MainQueueApp{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%n%nHow Many scores You have: ");	
		byte scoreCounts = input.nextByte();
		
		AdtQueue scores = new AdtQueue();
		
		double gpa;	
		for(int i = 1; i<=scoreCounts; i++){
			
			System.out.printf("%nEnter GPA for student %d: ",i);
			
			gpa = input.nextDouble();
			scores.enqueue(gpa);	
			
		}
		
		scores.displayAll();
		
		System.out.printf("%nDo you want to delete Student from Queue??: ");
		String studentDeletionResponse = input.next().toLowerCase();
		
		if(studentDeletionResponse.equals("yes")){
			double deletedScore = scores.dequeue();
			System.out.printf("%n%.1f has been deleted from queue",deletedScore);
			
		}
		else{
			System.out.printf("%nnothing Has been Deleted From the Queue");
		}
		
		scores.displayAll();
		
	}
	
	
}