import java.util.*; 
import java.util.Scanner;
  
public class Collection2 { 
    public static void main(String[] args) 
    { 
  
        // Create a HashMap 
        HashMap<Integer, String> hmap = new HashMap<>(); 
  
        // Populate the HashMap 
        hmap.put(1, "Student1"); 
        hmap.put(2, "Student2"); 
        hmap.put(3, "Student3"); 
		hmap.put(4, "Student4"); 
		hmap.put(5, "Student5"); 
		hmap.put(6, "Student6"); 
		hmap.put(7, "Student7"); 
  
        // Print the initial HashMap 
        System.out.println("You have entered the following HashMap : "+ hmap); 
  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key to be searched: ");
		int k = sc.nextInt();        
	
	
        // iterator reading over the HashMap 
        Iterator<Map.Entry<Integer, String> >  it1 = hmap.entrySet().iterator(); 
  
        // flag to store result 
        boolean isKeyPresent = false; 
  
        // Iterate over the HashMap 
        while (it1.hasNext()) { 
  
            // Get the entry at this iteration 
            Map.Entry<Integer, String> entry1 = it1.next(); 
  
            // Check if this key is the required key 
            if (k == entry1.getKey()) { 
  
                isKeyPresent = true;
                System.out.println("Given key exist");				
            }
            //else{System.out.println("Given key not exist");}			
        } 
  
//-------------------------------------------------------------------------
        
		System.out.println("Enter the value to be searched: ");
		sc.nextLine();
		String val = sc.nextLine();
		
		//flag for value
		boolean isValuePresent =false;
		//System.out.println(isValuePresent);
		
		//Reading through hashmap
		Iterator it2 =hmap.entrySet().iterator();
		
		while (it2.hasNext()) {  
            // Check if this value is the required key 
            if (hmap.containsValue(val)) { 
  
                isValuePresent = true;
				//System.out.println(isValuePresent);
                System.out.println("Given value exist");
				break;
            }
            //else{System.out.println("Given value not exist");}	       			
        } 
//--------------------------------------------------------------------------

	    Set<Integer> keys =hmap.keySet(); //getting all keys in hashmap
        
		System.out.println("Keys of the hashmap are :");
        for(Integer key : keys){ System.out.println(key +" ");}	

//--------------------------------------------------------------------------

        Set<Map.Entry<Integer, String>> keyValuePairs = hmap.entrySet();
		
		Iterator<Map.Entry<Integer, String>> it3 = keyValuePairs.iterator();
		
		System.out.println("Key Value pairs are :");
        while(it3.hasNext()) {
            System.out.println(it3.next());
        }
 
    } 
} 