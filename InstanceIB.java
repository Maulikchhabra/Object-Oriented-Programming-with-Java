public class InstanceIB{
private int x;
//Instance initialization block
{
System.out.println("Initialization block: x ="+x);
x=5;}
//Constructor
public InstanceIB(){
System.out.println("Constructor: x ="+x);}
public static void main(String []args){
 InstanceIB i1 = new InstanceIB();
 InstanceIB i2 = new InstanceIB();}
}