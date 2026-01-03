public class Node{
	
	private Employee emp;
	private Node next;// by default this is null (field initializer)
	
	public Node(Employee emp){
		this.emp = emp;
		next = null; // redundant code.
	}
	
	public void setNext(Node next){
		this.next = next;
	}
	
	public Node getNext(){
		return this.next;
	}
	
	public Employee getEmployee(){
		return this.emp;
	}
}