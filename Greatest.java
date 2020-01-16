/*
greatest of three numbers

1 start 
2 input any three numbers from the command line arguments (a,b,c)
3 if a >b and a>c
    then a is greatest
  or b>a and b>c 
    then b is greatest
  or c>a and c>b 
    then c is greatest
4 return the greatest number
5 end
c
*/




public class Greatest{
 public static void main(String args[]){
   int a,b,c;
   a = Integer.parseInt(args[0]);
   b = Integer.parseInt(args[1]);
   c = Integer.parseInt(args[2]);
   if( a>b && a>c){
          System.out.println(a + "is greatest");}
   else if (b>a && b>c){
          System.out.println(b + "is greatest");}
   else if(c>a && c>b) {
          System.out.println(c + "is greatest");}
   else {System.out.println("No proper comparison done");}
   //return great;
}} 
