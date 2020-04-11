class Thread1 implements Runnable{
	
	public void run(){
		for(int i=0;i<10;i++){
			if(i%2 ==0){
				System.out.println("Even number :"+i);
			}
		}
	}
}

class Thread2 implements Runnable{
	
	public void run(){
		for(int i=0;i<10;i++){
			if(i%2 !=0){
				System.out.println("Odd number :"+i);
			}
		}
	}
}

public class Threading2{
	
	public static void main(String args[]){
		Thread t1 = new Thread(new Thread1());
		Thread t2 = new Thread(new Thread2());
		t1.start();
		t2.start();
	}
}