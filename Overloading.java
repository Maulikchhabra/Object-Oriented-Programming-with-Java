class Parent{

 public void fun1(){
   System.out.println("Parent Class");}

 public void fun2(int x){
   int a =x; 
   System.out.println("Parent Class => a :"+a);}

}

class Child extends Parent{
 
 void fun1(int x){
  int b=x;
  System.out.println("Child class => b :"+b); }

 void fun2(int x,int y){
  int c =x;
  int d =y;
  int e;
  e = c+d;
  System.out.println("Child class => e :"+e);}
}

public class Overloading{
 public static void main(String []args){
   Child ob1 = new Child();
   ob1.fun1();
   ob1.fun1(5);
   ob1.fun2(10);
   ob1.fun2(5,10);
 } 

}
