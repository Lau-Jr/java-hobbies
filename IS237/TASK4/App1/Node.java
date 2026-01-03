public class Node{
	
	private double GPAScore;
	private Node next;// by default this is null (field initializer)
	
	public Node(double score){
		this.GPAScore = score;	
		next = null; // redundant code.
	}
	
	public void setNext(Node next){
		this.next = next;
	}
	
	public Node getNext(){
		return this.next;
	}
	
	public double getGPAScore(){
		return this.GPAScore;
	}
}