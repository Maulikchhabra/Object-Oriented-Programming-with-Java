import java.util.Scanner; //Scanner class imported

interface Sales{ //Sales interface having method getSales and displaySales for abstraction
	public void getSales();
	public void displaySales();
}

class Publication{
	String title; //title of publication
	float price; //price of publication
	
	Scanner sc = new Scanner(System.in); //Scanner object formation
	
    Publication(){ //Getting title and price 
    	System.out.println("Enter the title : ");
    	title = sc.nextLine();
    	System.out.println("Enter the price : ");
    	price = sc.nextInt();
    }
    
   // protected void finalize(){System.out.println("Garbage collected");}
    
    void display(){ //Display title and price
    	System.out.println("Title : "+title);
    	System.out.println("Price : "+price);
    }
    
}

class Book extends Publication implements Sales{
	int pageCount ; //pagecount of book
	float saleAmount , totalSale;
	
	Book(){ //getting page count
		System.out.println("Enter the page count of the book : ");
		pageCount = sc.nextInt();
	}
	
	//protected void finalize(){System.out.println("Garbage collected");}
	
	void display(){ //displaying credentials
    	System.out.println("Title : "+title);
    	System.out.println("Price : "+price);
    	System.out.println("Page Count : "+pageCount);
    }
	
	public void getSales(){ //Sales getting and calculation
		System.out.println("Enter the issue sales per month :");
		saleAmount = sc.nextFloat();
		totalSale = saleAmount * price;
		
	}
	
	public void displaySales(){ //displaying total sales of the month
		System.out.println("Total sale amounts :"+totalSale);
	}
}

class Tape extends Publication implements Sales{
	float playingTime, saleAmount, totalSale; //playing time of audio in mins
	
	Tape(){ //getting play time
		System.out.println("Enter the playing time of audio casette : ");
		playingTime = sc.nextFloat();
	}
	
	//protected void finalize(){System.out.println("Garbage collected");}
	
	void display(){ //displaying credentials
    	System.out.println("Title : "+title);
    	System.out.println("Price : "+price);
    	System.out.println("Playing Time : "+playingTime);
    }
	
	public void getSales(){ //getting and calculating sales
		System.out.println("Enter the issue sales per month :");
		saleAmount = sc.nextFloat();
		totalSale = saleAmount * price;
		}
	
	public void displaySales(){ //displaying total sale in a month
		System.out.println("Total sale amounts :"+totalSale);
	}
}

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b = new Book();
		//Book
		b.getSales();
		b.display();
		b.displaySales();
		
		Tape t = new Tape();
		//Tape
		t.getSales();
		t.display();	
		t.displaySales();

	}

}
