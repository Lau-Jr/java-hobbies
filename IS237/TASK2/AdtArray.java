

public class AdtArray {
	
	
	private String[] names;
	private int count;
	
	public AdtArray(int size){
		names = new String[size];
		count = 0;
	}
	
	public void addItem(String item){//how to handle indexOutOfbound Exception
		
		names[count] = item;
		
		count++;
	}
	
	public String getItem(int index){
		
		return names[index];
	}
	
	public int getNumItems(){
		
		return count;
	}
	
	public void insert(int pos, String item){//you can insert on full Array right?
		
		for(int i = count; i > pos - 1 ; i--){//pos - 1?
			names[i] = names[i-1];
		}
		names[pos] = item;
		count++;
	}
	
	public boolean isDeleted(String item){
		
		int index = searchHelper(item);
		
		if (index != count){
			
			delete(index);
			count--;
			return true;
		}
		
		return false;
	}
	
	private void delete(int pos){
		
		for(int i = pos; i< count; i++){
			
			names[i] = names[i+1];
		}

	}
	
	public void sort(){
		
		for(int i = 0; i<count -1; i++){
			
			for(int j = 0; i<count -1-i; j++){
				
				if(names[j].compareTo(names[j+1]) < 0){
					String temp = names[j];
					names[j] = names[j+1];
					names[j+1] = temp;
				}
			}
		}
	}
	
	public int searchHelper(String item){
		
		int key = count;
		for(int i = 0; i<count;i++){
			
			if (names[i].equalsIgnoreCase(item)){
				key = i;
				break;				
			}

		}
		
		return key;
	}
	
	public void printArray(){
		
		System.out.println();
		for(int i = 0; i<count; i++){
			
			System.out.printf("%s ",names[i]);
		}
		System.out.println();
	}
/* 	public void search(String item){
		
		
	} */
}