import java.util.Scanner;

public class StringBufferUpperCaseConsole{
	StringBuffer s = new StringBuffer();
	Scanner sc = new Scanner(System.in);
	String s1;
	
	String input(){
		System.out.println("Enter the string :");
		s1 = sc.nextLine();
		return s1;
	}
	
	String LowerUpper(){
		String res="";
		char ch=' ';
		
		String st = input();
		
		for(int i=0;i<st.length();i++){
		
		   if(st.charAt(i) >= 'a' && st.charAt(i) <= 'z'){
			 ch=(char)(st.charAt(i) -32);
		   }
		   else{
             ch=(char)(st.charAt(i));    		   
		   }
		   
		   res=res + ch;
		}
		
		return res;
	}
	
	public static void main(String args[]){
		StringBufferUpperCaseConsole st = new StringBufferUpperCaseConsole();
		String upper =st.LowerUpper();
		System.out.println("Uppercase String " :upper);
	}
}