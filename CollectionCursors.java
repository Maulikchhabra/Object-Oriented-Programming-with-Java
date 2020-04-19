import java.util.*;

public class CollectionCursors{
	
	public static void main(String args[]){
		
		Vector v = new Vector(); //vector object creation
		ArrayList al = new ArrayList(); //arraylist object creation
		LinkedList l = new LinkedList();
		
		v.addElement("One");
		v.addElement("Two");
		v.addElement("Three"); //adding element in vector
		
		System.out.println("Through normal printing ="+v); //printing out v
//---------------------------------------------------------------------------		
		
		Enumeration e =v.elements();  //Cursor type1
		
		while(e.hasMoreElements){
			String s = (String)e.nextElement();
			System.out.println("Through Enumeration ="+s);
		}
//---------------------------------------------------------------------------		
		
		for(int i=1;i<=10;i++){
			al.add(i);
		}
		
		System.out.println("Through normal printing ="+al);
		
		Iterator it =al.iterator();
		
		while(it.hasNext()){
			Integer I =(Integer)it.next();
			if(I >3 && I < 5){
				it.remove();
			}}
		
		System.out.println("After iterating ="+al);
//-----------------------------------------------------------------------------

        l.add("CPP");
		l.add("Java");
		l.add("Python");
		l.add("PHP");
		
		System.out.println("Before List iterating ="+l);
		
		ListIterator lit = new ListIterator();
		
		while(lit.hasNext()){
			String s = (String)lit.next();
			
			if(s.equals("Java")){lit.set("Java EE");}
			else if(s.equals("CPP")){lit.add("DS");}
			else if(s.equals("PHP")){lit.remove();}
		}
		
       	System.out.println("After list iterating ="+l);	
	}
}