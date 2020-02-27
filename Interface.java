

interface A{
	
	public void meth1();
	public void meth2();
	
}

class Myclass implements A{
	
	public void meth1(){
		System.out.println("Hello !");
	}
	
	public void meth2(){
		System.out.println("DevOps !");
	}
}

public class Interface{
	
     public static void main(String []args){
		 Myclass c = new Myclass();
		 c.meth1();
		 c.meth2();
	 }	
}