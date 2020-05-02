
public class StringBufferUpperCase{
	StringBuffer s = new StringBuffer();
	
	String LowerUpper(String s){
		String res="";
		char ch=' ';
		
		
		for(int i=0;i<s.length();i++){
		
		   if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
			 ch=(char)(s.charAt(i) -32);
		   }
		   else{
             ch=(char)(s.charAt(i));    		   
		   }
		   
		   res=res + ch;
		}
		
		return res;
	}
	
	public static void main(String args[]){
		StringBufferUpperCase st = new StringBufferUpperCase();
		String upper = st.LowerUpper("java oops lab");
		System.out.println(upper);
	}
}