import java.util.Scanner;

public class Divisibility {
    int i,sum=0;
    Scanner sc = new Scanner(System.in);
    int sum(){
    	for(int i=41;i<250;i++)
    	{
    		if(i % 5 == 0){
    			sum = sum+i;
    		}
    	}    
    	return sum;	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Divisibility obj = new Divisibility();
		obj.sum();
		System.out.println("Sum is :"+obj.sum);
		

	}

}
