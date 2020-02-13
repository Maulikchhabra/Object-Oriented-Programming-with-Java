public class StaticIB{
private static int k;

//Static Initialization block
static{
System.out.println("Static Initialization block: k ="+k);
k=10;}

public static void main(String []args){
new StaticIB();
}

}