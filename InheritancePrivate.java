 class Inheritance{
	 private int privatemember;
	 public int publicmember; 
    Inheritance(){
	   privatemember = 34;
	   publicmember = 25;
     }
}

public class InheritancePrivate extends Inheritance{
	public static void main(String []args){
		InheritancePrivate obj = new InheritancePrivate();
		System.out.println("Public member is :"+obj.publicmember);
		//System.out.println("Private member is :"+obj.privatemember);
    //The above call to private member would give error cause private member are not accessible to subclasses.
		
	}
}
