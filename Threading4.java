abstract public class Threading4 implements Runnable {
    public static void main(String args[]) throws InterruptedException {
       Thread T1=new Thread();
       Thread T2=new Thread(); //thread formation
       Thread T3=new Thread();
       Thread T4=new Thread();
       Thread T5=new Thread();
	   
       T1.setPriority(7);
       T2.setPriority(2);
       T3.setPriority(10); //setting priority to threads
       T4.setPriority(5);
       T5.setPriority(8);
      
	  T1.sleep(1500); 
      if (T1.isAlive()) System.out.println("Thread 1 alive");
      else System.out.println("Thread 1 not alive");
         T2.start();
		 
     if (T2.isAlive()) System.out.println("Thread 2 alive");
     else System.out.println("Thread 2 not alive");
        T3.sleep(1000);
		
     if (T3.isAlive()) System.out.println("Thread 3 alive");
     else System.out.println("Thread 3 not alive");
        T4.start();
		
     if (T4.isAlive()) System.out.println("Thread 4 alive");
     else System.out.println("Thread 4 not alive");
       T5.start();
	   
    if (T5.isAlive()) System.out.println("Thread 5 alive");
    else System.out.println("Thread 5 not alive"); } }