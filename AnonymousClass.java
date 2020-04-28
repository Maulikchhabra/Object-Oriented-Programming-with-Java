class Types{
	
	public void fun(){
		
		int a=10,b=20;
		
		int c =a+b;
		System.out.println("(Normal)Sum is "+c);
	}
	
	public void details2(){}
	
}

class Driver{
	
	class Named{
		
		void details1(){ System.out.println("Class with Name");}
	}
	
	Types t =new Types(){ //way to form anonymous class
		
		public void details2(){ System.out.println("Anonymous class");}
		
		public void fun(){
		
		   int a=20,b=20;
		
		   int c =a+b;
		System.out.println("(Overridden)Sum is "+c);}
	
	};
}

public class AnonymousClass{
	
	public static void main(String args[]){
		
		Driver driver = new Driver();
		Types type = new Types();
		Driver.Named nm = driver.new Named();
		
		type.fun(); //normal function call
		driver.t.details2(); //calling method inside anonymous class
		driver.t.fun(); //calling method inside anonymous class
		nm.details1(); //calling inner class method
		
	}
}