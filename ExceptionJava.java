import java.io.*;
import java.util.*;

class ExceptionJava
{
   
   public static void main(String args[]){
      int d;
      float r;
      System.out.println("Enter the number to divide 100:");
      Scanner sc=new Scanner(System.in);
      d=sc.nextInt();
     
	  try{
         if(d==0){
			System.out.println("Terminated (Exception caught)");
            throw new Exception();}
	    
		if(d!=0){
            r=100/d;
            System.out.println("Result is:"+r);}}


      catch(Exception e){
          System.out.println("Exception Caught (Can't Divide By Zero)");}}}