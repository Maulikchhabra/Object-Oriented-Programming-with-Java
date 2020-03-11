/*
Algorithm = 
 1 Start
 2 Import the Scanner class in program
 3 Make an object of class Scanner using System.in
 4 Input the numbers using scanner object
 5 In nested for loops check the condition if the numbers are equal or not 
    if not then print the numbers combination
 6 End 

*/




import java.util.Scanner;
public class Combination{
 int a,b,c;

 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int seq[] =new int[3];

    for(int i =0;i<3;i++){
     seq[i] = sc.nextInt();}
 
 
            for (int i = 0; i < 3; i++){
              for(int j =0;j<3;j++){   
                for(int k=0;k<3;k++){
                  if(i!=j && j!=k && k!=i){
                    System.out.println(seq[i]+""+seq[j]+""+seq[k]);} 
                }}}
            

 sc.close();
}
}