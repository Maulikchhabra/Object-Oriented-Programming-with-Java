class Box
{
  private int length,breadth,height;
  public void setDim(int l, int b, int h){
   length=l; breadth=b; height=h;}
  public void showDim(){
   System.out.println("L =" + length);
   System.out.println("B =" + breadth);
   System.out.println("H =" + height);}
 public static void main(String args[]){
  Box smallbox = new Box();
  smallbox.setDim(12,10,4);
  smallbox.showDim();
}}
