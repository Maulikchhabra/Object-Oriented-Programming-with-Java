class A {

	
	public void f1(){System.out.print("SuperClass");}
	
	}



class B extends Example{
	
	
	public void f2(){
		System.out.println("Child class");
	}
}

public class Inheritance{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	            	A obj1 =new A();
                //A obj2 =new B();
                B obj3 = new B();
                //B obj4 = new A();
		            obj1.f1();
		            //obj1.f2();
                obj2.f1();
		            //obj2.f2();
                obj3.f1();
		            obj3.f2();
                obj4.f1();
		            obj4.f2();

}}

/*
Inheritance.java:22: error: incompatible types: B cannot be converted to A
                A obj2 =new B();
                        ^
Inheritance.java:24: error: incompatible types: A cannot be converted to B
                B obj4 = new A();
                         ^
Inheritance.java:26: error: cannot find symbol
                obj1.f2();
                    ^
  symbol:   method f2()
  location: variable obj1 of type A
Inheritance.java:28: error: cannot find symbol
                obj2.f2();
                    ^
  symbol:   method f2()
  location: variable obj2 of type A
4 errors
*/
