package classesAndObjectsIntro;

public class Invoice {
	private String partNumber;
	private String partDescription;
	private int itemsPurchased;
	private double pricePerItem;
	
	public Invoice(String partNumber, String partDescription, int itemsPurchased, double pricePerItem){
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.setItemsPurchased(itemsPurchased);
		this.setPricePerItem(pricePerItem);
	}
	
	public void setPartNumber(String partNumber){
		this.partNumber = partNumber;
		}
	
	public void setPartDescription(String partDescription){
		this.partDescription = partDescription;
		}
	
	public final void setItemsPurchased(int itemsPurchased){	
		if(itemsPurchased > 0){
			this.itemsPurchased = itemsPurchased;
			return;
		}
		this.itemsPurchased = 0;		
		}
	
	public final void setPricePerItem(double pricePerItem){
		if(pricePerItem > 0){
			this.pricePerItem = pricePerItem;
			return;
		}
		this.pricePerItem = 0.0;
		}
	
	public String getPartNumber(){
		return partNumber;
		}
		
	public String getPartDescription(){
		return partDescription;
		}
		
	public int getQuantity(){
		return itemsPurchased;
		}
	
	public double getPricePerItem(){
		return pricePerItem;
		}
	
	public double getInvoiceAmount(){
		return itemsPurchased * pricePerItem;
	}

}