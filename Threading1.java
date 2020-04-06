class Thread1 implements Runnable{
	
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("A"+i);
		}
	}
}

class Thread2 implements Runnable{
	
	public void run(){
		for(int i=0;i<10;i++){System.out.println("B"+i);}
	}
}

public class Threading1{
	
	public static void main(String args[]){
		Thread t1 = new Thread(new Thread1());
		Thread t2 = new Thread(new Thread2());
		t1.start();
		t2.start();
	}
}