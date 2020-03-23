import java.util.Scanner; //Scanner class import
import java.util.Random; //Random class import
import java.lang.Math; //Math class import

class Account{
	
	protected String name;
	protected int accno;
	protected String type;
	protected double balance;
	
	//Object formation
	Scanner sc = new Scanner(System.in);
	Random ran = new Random();
	//Math m = new Math();
	
	void details(){
		System.out.println("Enter name :");
		name = sc.nextLine();
  		accno = ran.nextInt(10000);  //generating random accno through random class 
  		//This fn will multiply any decimal from 0 to 1 with 10000 and will return the multiplication 
  		System.out.println("Enter balance :");
		balance = sc.nextDouble();
	}
	
	void display(){
		System.out.println("Name : "+name);
		System.out.println("Account number : "+accno);
		System.out.println("Balance : "+balance);
		}
	
	void displayBalance(){System.out.println("Balance : "+balance);}
	
	void deposit(){
		double amount; //amount to be deposited
		System.out.println("Enter amount to deposit :");
		amount = sc.nextDouble();
		balance = balance + amount;
	}
}

class SavingAccount extends Account{
	
	double interest;
	
	double compoundInterest(){
		int time, rate;
		System.out.println("Enter time :");
		time =sc.nextInt();
		System.out.println("Enter rate :");
		rate =sc.nextInt();
		interest = balance * Math.pow(1 + rate/100.0, time) -balance; //calculating interest of saving account
		return interest;
	}
	
	void updateBalance(){
		balance = balance + compoundInterest(); //updating balance by adding interest
	}
	
	void withdraw(){
		double amount;
		System.out.println("Enter amount to withdraw:");
		amount = sc.nextDouble();
		
		if(balance >= amount) {
			balance = balance - amount; //updating balance by deducting withdrawal
		}
		else{
			System.out.println("Amount cannot be withdrawn.");
		}
	}
}

class CurrentAccount extends Account{
	double penal;
	int checker =1; //for the minimum balance checking purpose
	
	double minimumBalance(){
		if(balance <= 1000){
			penal= 25.0;
			balance = balance - penal;	 //updating balance deducting penalty
			checker =0;
		}
		else{
			System.out.println("Penalty not charged!!");
		}
		return balance;
	}
	
	void withdraw(){
		double amount;
		if(checker ==1){
            System.out.println("Enter amount to withdraw :");
            amount = sc.nextDouble();
            if(balance >= amount){
            	balance = balance - amount; //withdrawing some amount
            }
            else{
			   System.out.println("Unalbe to withdraw amount.");
		     }}
            else{System.out.println("Cant withdraw amount from account being panaltied!");}    
	}
}

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrentAccount c = new CurrentAccount();
		SavingAccount s = new SavingAccount();
		
		//Current  account
		System.out.println("Current Account");
		c.details();
		c.minimumBalance();
		c.display(); // current balance display
		c.deposit();
		c.displayBalance(); //updated balance display after deposit
		c.withdraw();
		c.displayBalance(); //updated balance display after withdraw 
		System.out.println("\n");
 
        System.out.println("Saving Account");
		//Saving account
		s.details();
		s.display();
		s.deposit();
		s.displayBalance(); //updated balance display after deposit
		s.withdraw();
		s.displayBalance(); //updated balance display after withdraw
		System.out.println("\n");
		
	}

}
