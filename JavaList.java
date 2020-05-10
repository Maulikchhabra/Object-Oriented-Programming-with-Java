import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> l = new ArrayList<Integer>(n);
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            //list[i] = a;
            l.add(i,a);
        }
        //System.out.println(l);
        int nq = sc.nextInt(); //no of queries

       for(int i=0;i<nq;i++){
            //sc.nextLine();
            String qu = sc.next();
            
            if(qu.equals("Delete")){

                int r =sc.nextInt();

                l.remove(r);
            }
            else if(qu.equals("Insert")){

                int p = sc.nextInt();
                int q = sc.nextInt();
                l.add(p,q);            
            }
            
        }

        ListIterator<Integer> iterator = l.listIterator(); 

        while (iterator.hasNext()) { 
                System.out.print(iterator.next()+" "); 
            } 

        
    }
}
