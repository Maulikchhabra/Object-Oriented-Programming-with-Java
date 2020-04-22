import java.util.*;

class CollectionTreeSet1{
	
	public static void main(String args[]){
		
		TreeSet ts = new TreeSet();
		
		ts.add("B"); 
		ts.add("A");
		ts.add("D");
		ts.add("A"); //duplicate values not allowed
		ts.add("C");
		//ts.add(10); will return exception as treeset doesnot allow heterogenous values.
		
		System.out.println(ts); //prints in inorder traversing hence sorted in nature
	}
}

//Classes like StringBuffer which do not implement Comparable interface will not be able to add to the treeset and compared upon as it compares with compareTo() method which is available in Comparable interface.

//Sorting uses compareTo() method [Syntax => obj2.compareTo(obj1);] 
//Here obj1 is the object we want to enter and obj2 is the object that is currently in treeSet.


//The values get stored in Binary Search Tree method