public class AdtQueue{
	
	private Node lastNode;
	
	public AdtQueue(){
		lastNode = null;//redundant code.
	}
	
	public boolean isEmpty(){
		return lastNode ==  null;
	}
	
	public void enqueue(Employee employee){
		Node emp = new Node(employee);
		
		if(!isEmpty()){
			emp.setNext(lastNode.getNext());
			lastNode.setNext(emp);
			lastNode = emp;
			return;
		}
		
		lastNode = emp;
		emp.setNext(lastNode);
		
	}
	
	public Node dequeue(){
		Node fistNode = lastNode.getNext();//if queue is empty this will cause NullPointerException
		if(lastNode == fistNode){
			lastNode = null;
			return fistNode;
		}
		
		lastNode.setNext(fistNode.getNext());
		return fistNode;
	}
	
	public Node peek(){
		return lastNode.getNext();
	}
	
	public void displayAll(){
		
		System.out.printf("%n%n=========EMPLOYEES============%n");
		Node curr = lastNode.getNext();//exception if lastNode == null
		
		while(true){
			
			//System.out.printf("%nEmployee Name: %s, Salary:%.2f",curr.getEmployee().getName(),curr.getEmployee().getSalary());
			System.out.printf("%n%s",curr.getEmployee());
			if(curr == lastNode){
				break;
			}
			curr = curr.getNext();
			
		}
		
		
	}
}
