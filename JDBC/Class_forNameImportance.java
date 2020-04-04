//Discussing about the Class.forName importance

class Demo{
	
	static{
		System.out.println("Static Initialization block");
	}
	
	{
		System.out.println("Instantaneous Initialization Block");
	}
}

public class Class_forNameImportance {
    
	public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		
		System.out.println("1st start");
		Class.forName("Demo");
		//Class.forName('Class name') does not create an object so instantaneous block would not be called
		System.out.println("1st end");
		
		/*
		System.out.println("2nd start");
		Class.forName("Demo").newInstance();
		//Class.forName('Class name').newInstance() does create an object so instantaneous block as well as static block would be called
		System.out.println("2nd end");
		*/
		
		//Class.forName("com.mysql.jdbc.Driver"); (it just loads the driver but not register it)
	}
}
