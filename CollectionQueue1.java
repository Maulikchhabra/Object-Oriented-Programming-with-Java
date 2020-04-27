import java.util.*;

public class CollectionQueue1{
	
	public static void main(String args[]){
		
		PriorityQueue pq = new PriorityQueue(); //object formation of priority queue
		
		pq.offer("A");
		pq.offer("D");
		pq.offer("C");
		pq.offer("B"); //storing values in pq
		
		System.out.println(pq); //may or maynot show sorted order according to normal order
		
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll()); //will delete the element and return the same.
	}
} 

//Priority queue follows normal sorting order but can store values in a non sorted order. To check the sorting, one can see the elements deleted by poll function are in sorted order.