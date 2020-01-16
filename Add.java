/*
add two numbers
 
1 start
2 input numbers thru command line arguments
3 convert the arguments into integer and pass them in two variables a and b
4 perform addition of a and b and store it in c
5 end
*/


public class Add{
  public static void main(String args[]){
    int a,b,c;
    a=Integer.parseInt(args[0]);
    b=Integer.parseInt(args[1]);
    c=a+b;
    System.out.println("Addition of " + a + " and " + b +" is " + c);
}}
