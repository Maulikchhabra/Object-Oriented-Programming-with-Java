/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Horses
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T > 0){
		    
		    int N = sc.nextInt();
		    int S[] = new int[N];
		    int diff = Integer.MAX_VALUE;
		    
		    for(int i=0;i<N;i++){
		        S[i] = sc.nextInt();
		    }
		    
		    for(int i =0;i<N;i++){
		        for(int j =i+1;j<N;j++){
		            if(Math.abs((S[i] -S[j])) < diff){
		                diff =Math.abs((S[i]-S[j]));
		            }
		        }
		    }
		    
		    System.out.println(diff);
		}
		
		
	}
}
