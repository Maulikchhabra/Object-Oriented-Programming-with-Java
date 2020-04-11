import java.io.*;
import java.util.*;

class Parent{
	
	static int count =0;
	
	synchronized static int display(){
		count++;
		return count;
	}
	  

}

class Threads extends Parent implements Runnable {
	Parent pr = this;
	Thread t;
	
	Threads(){
		t=new Thread(this);
        t.start();
	}
	
	 public void run(){
		pr.display();	
	}
}



public class Threading3{
	
	public static void main(String args[]){
		Threads t1 = new Threads();
		Threads t2 = new Threads();
		Threads t3 = new Threads();
		Threads t4 = new Threads();
		Threads t5 = new Threads();
		Threads t6 = new Threads();
		Threads t7 = new Threads();
		Threads t8 = new Threads();
		Threads t9 = new Threads();
		Threads t10 = new Threads();
		

		System.out.println(t10.count);
}}