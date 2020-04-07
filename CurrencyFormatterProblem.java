import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CurrencyFormatterProblem {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale INDIA = new Locale("en", "IN"); /seeting a default Locale
        
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(INDIA).format(payment); //getting currencies in different format
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);  
  
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);

       /* NumberFormat nF 
            = NumberFormat 
                  .getCurrencyInstance( 
                      Locale.CANADA); 
  
        // Stores the values 
        String values 
            = nF.getCurrency() 
                  .getDisplayName(); 
  
        // Prints the currency 
        System.out.println(values);*/
    }
}
