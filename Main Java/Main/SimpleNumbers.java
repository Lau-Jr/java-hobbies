import java.util.*;

public class SimpleNumbers implements Iterable<Integer> {
	
	int[] numbers;
	int index = 0;
	
	public SimpleNumbers(int[] numbers){
		this.numbers = numbers;
	}
	
	public Iterator<Integer> iterator(){
		
		return new Iterator(){
			public Integer next(){
				return numbers[index++];
			}
			public boolean hasNext(){
				return index < numbers.length;
			}
		};
	}
    
}
