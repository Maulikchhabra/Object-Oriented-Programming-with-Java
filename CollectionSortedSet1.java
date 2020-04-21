import java.util.*;

//Using TreeSet cause it contain all functionality of SortedSet

class CollectionSortedSet1{
	
	public static void main(String args[]){
		
		TreeSet ts = new TreeSet(); //object creation
		 
		//In sortedSet , the insertion order does not follow while the elements are sorted on some other logics.
        ts.add("D");
        ts.add("B");
        ts.add("C");	
        ts.add("A");		
		//Here order should be DBCA but the order in sortedSet would be ABCD based on alphabets.
		
		System.out.println(ts); //ABCD
		System.out.println(ts.first()); //will print the first element of the set depending on the logics (in this case = A)
		System.out.println(ts.last()); //will print the last element of the set depending on the logics (in this case = D)
		System.out.println(ts.headSet("C")); //will return the elements which are before given element in the sortedSet.
		System.out.println(ts.tailSet("B")); //will return the elements which are equal to and after the given element in the sortedSet.
		System.out.println(ts.subSet("B","D")); //will return the subset which has first element as starting (inclsive) and other element as exclusive so last element is one less than second argument.
		
		
	}
}