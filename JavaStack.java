import java.util.*;
class JavaStack{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			//String input=sc.next();
            //Complete the code
            System.out.println(out(sc.next()));
		}
 
    }
        static boolean out(String input){
           //String input;

           Stack<Character> st = new Stack<Character>();

           for(int i=0;i<input.length();i++){
              char ch =input.charAt(i);

              if(ch =='[' || ch =='{' || ch =='('){
                st.push(ch);
              }
              else if(st.empty()){
                return false;
              }
              else{
                  char top = st.pop();

                  if((top =='}' && ch !='{') || (top ==')' && ch !='(') || (top ==']' && ch !='[')){
                      return false;
                  }
              }
              
        }
        return st.empty();
        } 
		
	
}



