import java.util.Scanner; //Importing Scanner claass
import java.util.Arrays;  //Importing Arrays class

abstract class Animal{
	
    Scanner sc = new Scanner(System.in); //Scanner class object 
	
	//Variable Declarations
    public String name;
	public int age;
	public String type; 
	
	Animal(){
		this.name = name;
		this.age = age;
	}
	
	//Method to return name 
	String getName(){
		System.out.print("Enter animal's name :");
		name = sc.nextLine();
		return name;
	}
	
	//Method to return age
	int getAge(){
		System.out.print("Enter animal's age :");
		age = sc.nextInt();
		return age;
	}
	
	public String toString(){//overriding the toString() method  
       return "Name : "+name +" Age : "+age;  
    }
	
	abstract void talk(); //abstract method to provide different functionality based on classes
	
}

class Lion extends Animal{
	String type ="lion";
	
	
	void talk(){
		System.out.println("Hii I am "+name+" a "+type+" and I am "+age+" years old.");
	}
}

class Tiger extends Animal{
	String type="tiger";
	
	
	void talk(){
		System.out.println("Hii I am "+name+" a "+type+" and I am "+age+" years old.");
	}
}

public class Zoo{
	
	//Scanner sc = new Scanner(System.in);
	Animal arr[] = new Animal[10];
	int choice ,i=0;
	
	//System.out.print("Enter the number of animals you want to add :");
	//int n = sc.nextInt();
	
	  
	
	void addAnimal(Animal newAnimal){ //adding animal to array of animal type
		 arr[i] = newAnimal;
		 i++;
		 
	}
	
	void displayAnimals(){ //Displaying all animals in animals array
	    System.out.println("\n"); 
		System.out.println("Animal array with their name and age is: ");
		System.out.println("\n");
		System.out.println(Arrays.toString(arr));
		//System.out.println(arr[i]);
		//System.out.println(arr[i]);
		i++;	
	}
	
	void feedingTime(){ //Feeding time include all animals talking
		Animal tg = new Tiger();
		Animal ln = new Lion();
		tg.talk();
		ln.talk();
	}
	
	public static void main(String args[]){
	
		//Object formations
		Zoo z = new Zoo();
		Animal an = new Lion();
        Animal an1 = new Tiger();
        
        
	while(true){
	    Scanner s = new Scanner(System.in);
		System.out.println("a. Add a animal");
		System.out.println("b. Display all animals");
		System.out.println("c. Feeding Time");
		System.out.println("d. Display specific animal");
		System.out.println("Enter the choice in a b c d form only:");
		
		
		String choice;
		//choice= s.nextLine();
		choice = s.nextLine();
		
		
     
		switch(choice){
		
		  case "a" :System.out.println("Add animal");
		            System.out.println("Enter the type of animal :");
	                String ty = s.nextLine();
		            if(ty.equals("lion")){
		            	an.getName();
		        		an.getAge();
		        		z.addAnimal(an);
		        		//continue;
		            }
		            else if(ty.equals("tiger")){
		            	an1.getName();
		        		an1.getAge();
		        		z.addAnimal(an1);
		        		//continue;
		            }
					System.out.println("Animal added!");
					System.out.println("\n");
		            break;
			        
		            
		   case "b" :System.out.println("Display animals");
		             z.displayAnimals();
					 System.out.println("Animals displayed!");
					 System.out.println("\n");
		             break;
		           
		           
		   case "c" :System.out.println("Feeding time");
		             z.feedingTime();
					 System.out.println("\n");
		             break;
		          
		          
		   case "d" :System.out.println("Display specific animal");
		             System.out.println("Enter the type of animal :");
	                 String ty1 = s.nextLine();
		             if(ty1.equals("lion")){
		            	an.talk();
		             }
		             else if(ty1.equals("tiger")){
		            	an1.talk();
		             }
			         break;
	              
		}        
		} }
		
		}
		
		

	
	
