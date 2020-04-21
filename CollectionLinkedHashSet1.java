import java.util.*;

public class CollectionLinkedHashSet1{
	
	public static void main(String args[]){
		
		LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add("One");
		lhs.add("Two");
		lhs.add("Three"); //insertion order not preserved
		lhs.add("One"); //duplicates not allowed
		System.out.println(hs);
	}
}