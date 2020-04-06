import java.util.*;
  
class Collection1{ 
 
   public static void main(String args[]){
	   
      ArrayList<Integer> alist=new ArrayList<Integer>();  
      alist.add(54);
      alist.add(25);
      alist.add(11);
      alist.add(1);
      alist.add(43); //making an arraylist
      alist.add(22);
	  alist.add(22);
	  alist.add(54);
  
      //iterator reading
      Iterator it1 = alist.iterator(); 
  
      System.out.println("Elements in this list are : "); 
  
      while(it1.hasNext()){
		 System.out.print(it1.next() + " ");} 
  
        System.out.println(); 
  
//-------------------------------------------------------------------------  
      //duplicate object
	  List<Integer> duplicate = new ArrayList<Integer>(alist);
	  
	  
	  Iterator it2 = duplicate.iterator();
	  
	  System.out.println("Duplicate list elements are : ");
	  
	  while(it2.hasNext()){
		 System.out.print(it2.next() + " ");} 
  
        System.out.println();
//--------------------------------------------------------------------------
				
	  //Reverse the arraylist
	  ArrayList<Integer> reverse = new ArrayList<Integer>(); 
		
      for (int i = alist.size() - 1; i >= 0; i--) {  
          reverse.add(alist.get(i)); 
       } 
		
	  Iterator it3 = reverse.iterator();
	  
	  System.out.println("Reverse list elements are :");
	  
	  while(it3.hasNext()){
		 System.out.print(it3.next() + " ");} 
  
        System.out.println(); 
	   
		
  
      //displaying elements
      //System.out.println(alist);
   }  
}