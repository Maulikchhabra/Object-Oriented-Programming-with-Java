//If we use static keyword in inheritance for both parent and child function then it is called as function hiding.

class Parent{
 
    public static void fun1(int a,int b){
	   int num1 =a;
       int num2 = b;
       int add = a+b;
       System.out.println("addition is :"+add);}
		
}
	
class Child extends Parent{
   
    public static void fun1(int a,int b){
	   int num1=a;
       int num2=b;
       int sub = a-b;
       System.out.println("Subtraction is :"+sub);}
	
}	

public class InheritanceWithStatic{
 
  public static void main(String []args){
     Child.fun1(10,5);
	 Parent.fun1(10,5);}}
