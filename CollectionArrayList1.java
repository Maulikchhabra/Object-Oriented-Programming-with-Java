import java.util.*;

public class CollectionArrayList1{
   
    public static void main(String args[]){
		ArrayList l1 = new ArrayList(4); //arraylist creation with constructor having capacity
		l1.add("Maulik");
		l1.add("Suman");
		l1.add("Pramendra"); //simple adding
		
		l1.add(0,"Raman"); //will add Raman on index 0 and shift the elements down
		
		Iterator it = l1.iterator(); //setting an iterator for arraylist l1
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
}