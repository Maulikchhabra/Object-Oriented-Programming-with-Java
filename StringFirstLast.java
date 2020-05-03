import java.util.Scanner;

public class StringFirstLast{
	
	Scanner sc = new Scanner(System.in);
	
	String str,sub;
	int fin,lin;
	
	void input(){
		System.out.println("Enter the string:");
		str = sc.nextLine();
		System.out.println("Enter the substring to search:");
		sub = sc.nextLine();
	}
	
	void index(){
		
		fin = str.indexOf(sub);
		lin = str.lastIndexOf(sub);
		System.out.println("First index: "+fin);
		System.out.println("Last index: "+lin);
	}
	
	public static void main(String args[]){
		
		StringFirstLast sfl = new StringFirstLast();
		
		sfl.input();
		sfl.index();
	}
}