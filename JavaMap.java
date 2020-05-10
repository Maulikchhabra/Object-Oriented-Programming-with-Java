import java.util.*;
import java.io.*;

class JavaMap{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();

     Map<String,Integer> m = new HashMap<String,Integer>(n);
     
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
                        m.put(name,phone); //inserting values
			in.nextLine();
		}
        
        //System.out.println(m);
		
                while(in.hasNext())
		{
		   String s=in.nextLine();

                   if(m.containsKey(s)){
                     System.out.println(s+"="+m.get(s)); //getting output
            
                   }else{
                     System.out.println("Not found");
                   }
		}
	}
}



