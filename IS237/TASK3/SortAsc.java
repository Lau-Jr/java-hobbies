public class SortAsc {
    public static void main(String[] args) {
	
		String[] kids = {"laurent","diana","yusra","france","zion","lina","prince","yumnat","edo"};
		
		int totalKids = kids.length;
		
		for(int i =0; i<totalKids -1; i++){
			for(int j =0; j< totalKids -1 -i;j++){
				if(kids[j].compareToIgnoreCase(kids[j+1]) > 0){
					String temp = kids[j];
					kids[j] = kids[j+1];
					kids[j+1] = temp;
				}
			}
		}
		
		for(String kid: kids){
			System.out.println(kid);
		}
	
    }
}
