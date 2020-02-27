import java.util.Scanner;



class employee{
	String name;
	int empid;
	int salary;
	int IncreasedSalary;
	int percentage;
	
	// scanner class for taking input
	Scanner sc = new  Scanner(System.in);
	
	employee(){
		
	}
	
	employee(String name, int empid, int salary ){
		
	}
	
	// returns name
	String getName() {
		System.out.print("Enter Your name:");
		name = sc.nextLine();
		return name;
	}
	
	// return salary
	int getSalary() {
		System.out.print("Enter Your salary:");
		salary = sc.nextInt();
		return salary;
	}

	// increase salary by user specified percentage
	int IncreaseSalary() {
		
		
		System.out.println("Enter the percentage by which increase salary: ");
	    percentage = sc.nextInt();
		
		IncreasedSalary = salary + (salary * percentage /100);
		return IncreasedSalary;
	}
	
	void show(){
		System.out.println("Hello "+name);
		System.out.println("Your employee id :"+empid);
		System.out.println("Your current salary :"+salary);
		System.out.println("Increased salary :"+IncreasedSalary);
	}

}

class Manager extends employee{
	String department;
	
	String getDepartment() {
		System.out.print("Enter Your Department:");
		department = sc.nextLine();
		return  department;
	}
	
	void showDep(){
		System.out.println("Your department : "+department);
	} 
}

public class InheritanceEmployee {

	public static void main(String[] args) {
		employee e1 = new employee();
		Manager m1 = new Manager();
		
		e1.getName();
		e1.getSalary();
		e1.IncreaseSalary();
		m1.getDepartment();
		e1.show();
		m1.showDep();
	}

}