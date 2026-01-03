public class AdtQueue{
	
	private Node lastNode;
	
	public AdtQueue(){
		lastNode = null;//redundant code.
	}
	
	public boolean isEmpty(){
		return lastNode ==  null;
	}
	
	public void enqueue(double score){
		Node newScore = new Node(score);
		
		if(!isEmpty()){
			newScore.setNext(lastNode.getNext());
			lastNode.setNext(newScore);
			lastNode = newScore;
			return;
		}
		
		lastNode = newScore;
		newScore.setNext(lastNode);
		
	}
	
	public double dequeue(){
		Node fistNode = lastNode.getNext();//if queue is empty this will cause NullPointerException
		if(lastNode == fistNode){
			lastNode = null;
			return fistNode.getGPAScore();
		}
		
		lastNode.setNext(fistNode.getNext());
		return fistNode.getGPAScore();
	}
	
	public double peek(){
		return lastNode.getNext().
						getGPAScore();
	}
	
	public void displayAll(){
		
		System.out.printf("%n%n==========GPA SCORES============%n");	
		Node curr = lastNode.getNext();//exception if lastNode == null
		
		while(true){
			
			System.out.println(curr.getGPAScore());
			if(curr == lastNode){
				break;
			}
			curr = curr.getNext();
			
		}
		
		
	}
}
