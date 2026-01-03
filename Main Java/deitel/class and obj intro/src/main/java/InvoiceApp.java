package classesAndObjectsIntro;

import java.util.Scanner;

public class InvoiceApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		// Test data: creating several Invoice objects 
		Invoice item1 = new Invoice("A101", "Hammer", 5, 12.50); 
		Invoice item2 = new Invoice("B205", "Screwdriver", 10, 7.25); 
		Invoice item3 = new Invoice("C309", "Wrench", -3, 15.00); // invalid quantity 
		Invoice item4 = new Invoice("D412", "Drill Machine", 2, -99.99); // invalid price 
		Invoice item5 = new Invoice("E518", "Nails Pack", 50, 0.10);
		
		printInvoice(item1); 
		printInvoice(item2); 
		printInvoice(item3); 
		printInvoice(item4); 
		printInvoice(item5);
		
	}
	
	public static void printInvoice(Invoice invoice) { 
	System.out.println("----------------BEGIN OF INVOICE-----------------"); 
	System.out.println("Part Number: " + invoice.getPartNumber()); 
	System.out.println("Description: " + invoice.getPartDescription()); 
	System.out.println("Quantity: " + invoice.getQuantity()); 
	System.out.println("Price per Item: $" + invoice.getPricePerItem()); 
	System.out.println("Total Invoice Amount: $" + invoice.getInvoiceAmount()); 
	System.out.println("------------------END-----------------"); 
	System.out.println();
	}
}
