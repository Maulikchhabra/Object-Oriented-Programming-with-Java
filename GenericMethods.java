//T can only be replaced by non-primitive data types.


public class GenericMethods{
	
	public <T> void printArray(T []s){
		for(T x: s){
			System.out.println(x);
		} //for each loop
	}
	
	public static void main( String args[]){
		GenericMethods g = new GenericMethods();
		String str[] = new String[]{"Delhi","Mumbai","Chennai"};
		Integer num[] ={12,22,32,42};
		g.printArray(str);
		g.printArray(num);
	}
}

