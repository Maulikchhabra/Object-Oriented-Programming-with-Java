class OuterClass1{
	
	//Static inner class can only access static variables
	static int y=10;
	
	static class InnerStaticClass{
		
		void fun1(){
			System.out.println("From inner class with static keyword");
		}
		
		void show(){System.out.println("Digit is "+y);}
	} 
	
	void fun2(){
		System.out.println("From outerclass1");
	}
}

class OuterClass2{
	
	//Non static inner class can access all type of variables except private
	static int x=10;
	public int a=5;
	protected int b =15;
	int c=20;
	
	class InnerSimpleClass{
		
		void fun3(){
			System.out.println("From inner class without static keyword");
		}
		
		void showDig(){System.out.println("Digits are "+x +" "+a+" "+b+" "+c);}
	}
	
	void fun4(){
		System.out.println("From outerclass2");
	}
}

public class InnerClasses{
	
	public static void main(String args[]){
		
		//For outerclass1 (class with static inner class)
		OuterClass1.InnerStaticClass c = new OuterClass1.InnerStaticClass(); //object creation of inner class
		c.fun1();
		c.show();
		//c.fun2(); (can't access fun2() as it is outside innerclass directly)
	
	    
		//For outerclass2 (class witj non static inner class)
		OuterClass2 out = new OuterClass2(); //object creation of outer class
		OuterClass2.InnerSimpleClass sc = out.new InnerSimpleClass(); //object creation of inner class
	    sc.fun3();
		sc.showDig();
		out.fun4();
		//sc.fun4(); 
		}
}

//Note = In case of static inner class, no need to make object of outer class but in case of non static inner class u need to create object of outer class.