import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JavaPrimalityTest {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        
        BigInteger b = new BigInteger(n);

        if(b.isProbablePrime(1) == true){
            System.out.println("prime");
        
        }else{System.out.println("not prime");}

        //System.out.println();
        scanner.close();
    }
}
