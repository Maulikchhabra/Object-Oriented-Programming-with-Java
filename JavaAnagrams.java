import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
         String aa = a.toLowerCase();
        String bb = b.toLowerCase();
       char[] ch1 = aa.toCharArray();
        char[] ch2 = bb.toCharArray();
        int count[] = new int[26];
        int n = ch1.length;
        int m = ch2.length;

         if(n != m)
            return false;
        for(int i=0;i<n;i++)
        {
         count[ch1[i]-97]++;
        count[ch2[i]-97] -- ;
        }
        for(int i=0;i<26;i++)
        { 
          if (count[i] != 0)
           return false;
        }

        return true;

        }

    public static void main(String[] args) {
