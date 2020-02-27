import java.util.Scanner; //Scanner importation

interface area{ 
	
	public final double PI = 3.14; //final keyword will make constant
	public double area();
	public double perimeter();
}

class Circle implements area{
	int radius;
	double area ,peri;
	Scanner sc = new Scanner(System.in);  //Scanner object 
    
	public void getRad(){radius = sc.nextInt();}
	
	public double area(){
		
		area = PI * radius * radius;
        return area;		
	}
	
	public double perimeter(){
		
		peri = 2 * PI * radius;
		return peri;
	}
	
	public void showResult(){
		System.out.println("Area :"+area);
		System.out.println("Perimeter:"+peri);
	}
	
}

public class InterfaceConstantValue{
	
	public static void main(String []args){
		Circle c = new Circle();
		c.getRad();
		c.area();
		c.perimeter();
		c.showResult();
	}
}