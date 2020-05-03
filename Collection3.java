import java.util.*; 
  
class Collection3 
{ 
    public static void main(String[]args) 
    { 
        HashSet<String> hSet = new HashSet<String>(); 
  
        // Adding elements into HashSet usind add() 
        hSet.add("One"); 
        hSet.add("Two"); 
        hSet.add("Three"); 
        hSet.add("Four");
        hSet.add("Five");
        hSet.add("Six");
        hSet.add("Seven");
        hSet.add("Seven");// adding duplicate elements	(not allowed and will be ignored)	
  
        // Displaying the HashSet 
		System.out.println("HashSet : ");
        System.out.println(hSet);
		
        Set<String> copiedSet = new HashSet<String>(hSet);
		
		System.out.println("Copied Set elements are :");
		for(String k : copiedSet){System.out.println(k);}
  
//-----------------------------------------------------------------------------------  
        
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the object to be searched: ");
		String obj = sc.nextLine();
		
		System.out.println("Does the object "+obj+" is present in the HashSet :"+hSet.contains(obj));
		
//---------------------------------------------------------------------------------------

        // Displaying the HashSet 
		System.out.println("HashSet before the call : ");
        System.out.println(hSet);
		
		hSet.clear(); //remove all entries in one call
		
		// Displaying the HashSet 
		System.out.println("HashSet after the call : ");
        System.out.println(hSet);
		
		
		
	}	
} 