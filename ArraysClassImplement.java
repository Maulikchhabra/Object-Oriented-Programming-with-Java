import java.util.*;

public class ArraysClassImplement{
	
	public static void main(String args[]){
		
		int a[] ={20,5,50,10,25};
		int b[]={1,5,2,4,3};
		int i;
		
		for(i=0;i<a.length;i++){
			System.out.print(a[i]+" "); //in insertion order
		}
		
		System.out.print("\n");
		
		Arrays.sort(a); //will sort the array
		
		for(i=0;i<a.length;i++){
			System.out.print(a[i]+" "); //in sorted order
		}
		
		System.out.print("\n");
		
		Arrays.sort(b,0,4); //will sort from index 2 to 4
		
		for(i=0;i<a.length;i++){
			System.out.print(b[i]+" "); //in sorted order of given output
		}
		
		System.out.print("\n");
		
		Arrays.fill(a,5); //will fill 5 in all values
		
		for(i=0;i<a.length;i++){
			System.out.print(a[i]+" "); //in sorted order of given output
		}
		
		System.out.print("\n");
		
		Arrays.fill(a,1,3,3); //will fill 2 in between the given indexes 
		
		for(i=0;i<a.length;i++){
			System.out.print(a[i]+" "); //in sorted order
		}
		
		System.out.print("\n");
	}
}