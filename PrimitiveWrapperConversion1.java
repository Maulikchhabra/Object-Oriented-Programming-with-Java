public class PrimitiveWrapperConversion1{
	
	public static void main(String args[]){
		
		//Converting int to Integer
		int a = 100;
		Integer i = Integer.valueOf(a);
		System.out.println("Integer wrapper value :"+i);
		
		
		//Converting Integer to String
		Integer j = new Integer(3);
		String s = Integer.toString(j);
		System.out.println("String value :"+s); 
		
		
		//Converting String to int
		String p = "45";
		int b = Integer.parseInt(p);
		System.out.println("int value :"+b);
		
		
		//Converting int to String
		int c = 90;
		String q = Integer.toString(c);
		System.out.println("String value :"+q);
		
		
		//Converting String to Integer
		String r = "50";
		Integer k = Integer.valueOf(r);
		System.out.println("Integer wrapper value :"+k);
		
		
		//Converting Integer to int
		Integer l = new Integer(23);
		int d = l.intValue();
		System.out.println("int value :"+d);
		
	}
}