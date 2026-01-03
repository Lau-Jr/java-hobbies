public class AdtArray {
	
	private String[] names;
	private int counts;
	
	public AdtArray(int size){
		names = new String[size];
		counts = 0;
	}
	
	public void addItem(String item, int index){
		names[index] = item;
		counts = counts + 1;
	}
	
	public String getItem(int index){
		return names[index];
	}
	
	public int getNumItems(){
		return counts;
	}
	
	public void insert(int pos, String item){
	
		for(int i = counts; i > pos - 1 ; i--){
			names[i] = names[i-1];
	}
		names[pos] = item;
		counts++;
}

	public void delete(String value){
		int j;
		for(j=0; j<counts; j++) 
			  if( names[j].equalsIgnoreCase(value))
				   break;
		if(j==counts) 
			 System.out.printf("%Unsuccessfull Operation..");
		 else{ 
			 for(int k=j; k<counts; k++) 
				 names[k] = names[k+1];
		   
			 counts--; 
			System.out.printf("%n%s is Successfull Deleted.", value);
			}  
	}
			
	public void sort(){
		
		for(int i =0; i<counts -1;i++){
			
			for(int j =0; j<counts - 1 - i; j++){
				
				if(names[j].compareTo(names[j+1])<0){
					String temp = names[j];
					names[j] = names[j+1];
					names[j+1] = temp;
				}
			}
		}
	}
	
	public void searchItem(String item){
		int y;
		for(y=0; y<counts;y++){
			if(names[y].equalsIgnoreCase(item)){
				break;
			}
		}
		
		if(y == counts){
			System.out.printf("Not Found");
			return;
		}
		System.out.printf("%nitem was found at index %d%n",y);
	}
 	
}

