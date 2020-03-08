//import java.util.Scanner;
import java.lang.Math;


interface test{
	
	public double square(double a);
	
}

class Arithmetic implements test{
	
	double powered;
    public double square(double a){    
		double num =a;
        powered = Math.pow(num,2.0);
	    return powered;	}
	
	void show(){
		System.out.println("Square :"+powered);
	}

	
}

public class ToTestInt{
	
	public static void main(String []args){
	    Arithmetic ar = new Arithmetic();
        ar.square(4.0);
		ar.show();
        		
	}
}