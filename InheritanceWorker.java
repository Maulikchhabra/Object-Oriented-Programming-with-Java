import java.util.Scanner;

abstract class Worker{
	String name = new String();
	double totalSalary;
	int hoursPerDay =6;
    int salaryPerDay = 300;
	
	abstract double ComPay(double hours);
	void result(){
		System.out.println("Salary :"+totalSalary);
	}
}

class DailyWorker extends Worker{
	 
	double ComPay(double hours){
		
		double daysWorked = hours/ hoursPerDay;
	    totalSalary = daysWorked * salaryPerDay;
		return totalSalary;
	}
	
	
}

class SalariedWorker extends Worker{
	  
	double ComPay(double hours){
	    hours =40;
		double daysWorked = hours/ hoursPerDay;
		totalSalary  = daysWorked * salaryPerDay;
		return totalSalary;
	}  
	
	
}

public class InheritanceWorker{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("DailyWorker or SalariedWorker");
		int choice = sc.nextInt();
		System.out.println("Hello "+name);

		switch(choice){
			
			case 1: DailyWorker d1 = new DailyWorker();
			        d1.ComPay(36.0);
					d1.result();
					break;
             
            case 2: SalariedWorker s1 = new SalariedWorker();
                    s1.ComPay(40.0);
					s1.result();
                    break;					
		}
	}
}