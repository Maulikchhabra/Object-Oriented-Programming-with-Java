import java.util.Scanner;
import java.lang.Math;
public class Square {
	double arr[] = new double[10];
	double sum =0.0;

	
	Scanner sc = new Scanner(System.in);
	
	void input(){
		System.out.println("Enter the numbers");
		for(int i=0;i<10;i++){
			arr[i]= sc.nextDouble();
		}
	}
	
	double square(){
		for(int i=0;i<10;i++){
			arr[i] = Math.pow(arr[i], 2);
			sum = sum+arr[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s1 = new Square();
		s1.input();
		s1.square();
		System.out.println("Sum is ="+s1.sum);
	}
	

}
