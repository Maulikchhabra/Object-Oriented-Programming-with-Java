/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class BuyingSweets
{
	public static void main (String[] args)
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
		//InputStreamReader r=new InputStreamReader(System.in);    
        //BufferedReader br=new BufferedReader(r);
		
		int t =in.nextInt();
		
		
		for(int j=0;j<t;j++){
		    int sum=0,sweets,tc;
		    int n =in.nextInt();
		    int x = in.nextInt();
		    
		    int arr[] = new int[n];
		    
		    for(int i=0;i<n;i++){
		        arr[i] = in.nextInt();
		    }
		    
		    Arrays.sort(arr);
		    for(int i=0;i<n;i++){
		        sum =sum+arr[i];
		    }
		     
		    sweets = sum/x;
		    tc = sweets*x;
		    
		    if(sum-arr[0]>=tc){
		        System.out.println("-1");
		    }
		    else{
		        System.out.println(sweets);
		    }
		    
		}
	}
}
