public class StringBuilderUppercase{
	
	public static void main(String args[]){
		
		String str ="Hello Java";
		
		if(str!=null){
			System.out.println("Doing string to uppercase");
			System.out.println("Normal Case String: "+str);
			System.out.println("Upper Case String: "+uCase(str));
		}
	}
	
	private static String uCase(String str){
        StringBuilder inputStrT = new StringBuilder(str);
 
        for(int i = 0 ; i < inputStrT.length() ; i++)
        {
            if(inputStrT.charAt(i) >= 97 && inputStrT.charAt(i) <=122)    
               inputStrT.setCharAt(i, (char)(inputStrT.charAt(i)-32));     
            
        }
        return inputStrT.toString();
    }} 
 
