import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaBitSet {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        BitSet bs1 = new BitSet(n);
        BitSet bs2 = new BitSet(n);

        for(int i=0;i<m;i++){
            String st = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(st.equals("AND")){
                if(a ==1){ bs1.and(bs2);}
                else{ bs2.and(bs1);}
            }
            else if(st.equals("SET")){
                if( a==1){ bs1.set(b);}
                else{ bs2.set(b);}
            }
            else if(st.equals("OR")){
                if( a==1){ bs1.or(bs2);}
                else { bs2.or(bs1);}
            }
            else if(st.equals("XOR")){
                if( a==1){ bs1.xor(bs2);}
                else{ bs2.xor(bs1);}
            }
            else if(st.equals("FLIP")){
                if( a==1){ bs1.flip(b);}
                else{ bs2.flip(b);}
            }
        System.out.println(bs1.cardinality()+" "+bs2.cardinality());
        }
        
    }
}
