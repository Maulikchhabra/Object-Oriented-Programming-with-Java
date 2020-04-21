import java.util.*;

public class CollectionHashSet1{
	
	public static void main(String args[]){
		
		HashSet hs = new HashSet();
		
		hs.add("One");
		hs.add("Two");
		hs.add("Three"); //insertion order not preserved
		hs.add("One"); //duplicates not allowed
		System.out.println(hs);
	}
}