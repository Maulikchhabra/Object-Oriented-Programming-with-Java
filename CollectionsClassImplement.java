import java.util.*;

//Implementing Collections class and its methods

public class CollectionsClassImplement{
	
	public static void main(String args[]){
		
		Vector v = new Vector(); //creating a vector
		
		v.add(20);
		v.add(10);
		v.add(50);
		v.add(70); //adding values in vector v
		
		System.out.println(v); //insertion order
		
		int x = Collections.binarySearch(v,10); //will return wrong value as binary search only applies on sorted order.
		System.out.println("Wrong index:"+x);
		
		Collections.sort(v); //calling sort method in Collections class to sort v
		
		int y = Collections.binarySearch(v,10); //will return right value as sorting is done for vector v
		System.out.println("Right index:"+y);
		
		System.out.println(v); //Sorted order
		
		Collections.shuffle(v); //shuffles the values in any order
		
		System.out.println(v); //Shuffled order
		
		Collections.reverse(v); //reverse the values 
		
		System.out.println(v); //reversed order
		
		Collections.swap(v,1,3); //swapping the values on given indexes
		
		System.out.println(v); //swapped order order
		 
		
		
	}
}

