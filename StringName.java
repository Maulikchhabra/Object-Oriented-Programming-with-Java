public class StringName{
	
	public static void main(String args[]){
		
		String name ="Maulik Chhabra";
		
		int length = name.length();
		int count =0,index;
		
		System.out.println("Name :"+name);
		
		if(name.contains("a")){
			
			for(int i=0; i < name.length(); i++){    
			   if(name.charAt(i) == 'a'){count++;}
            }
            
			System.out.println("'a' count: "+count);
			
			System.out.println("Indexes are: ");
			
			for (index = name.indexOf('a'); index >= 0; index = name.indexOf('a', index + 1))
		    {System.out.println(index);}
		}
	}
}