class Example {

	int z;
	public void f1(){System.out.print("Super And This");}
	
	}



 class Child extends Example{
	int z;
	public void f1(){ super.f1();}
	
	public void f2(){
		int z;
		z=2;
		this.z=3;
		super.z=4;
	}
}

public class ThisAndSuper{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj =new Child();
		obj.f1();
		obj.f2();

}}
