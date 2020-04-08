import java.io.*;
import java.util.*;
import java.lang.*;

public class JavaStringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();

        String A2 = new StringBuilder(A).reverse().toString();
        System.out.println(A.equals(A2) ? "Yes" : "No");
       
        
        /* Enter your code here. Print output to STDOUT. */
        
    }
}



