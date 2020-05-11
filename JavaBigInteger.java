import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaBigInteger {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        BigInteger m = new BigInteger(a);
        BigInteger n = new BigInteger(b);

        BigInteger c = m.add(n);
        BigInteger d = m.multiply(n);
        //c = m+n;
        System.out.println(c);
        System.out.println(d);
    }
}
