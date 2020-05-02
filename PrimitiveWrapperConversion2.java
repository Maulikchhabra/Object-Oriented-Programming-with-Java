public class PrimitiveWrapperConversion2{
	
	public static void main(String args[]){
	
	   //Converting float to Float
	   float a = 50.0F;
	   Float p = Float.valueOf(a);
	   System.out.println("Float Wrapper value :"+p);
	   
	   
	   //Converting Float to String
	   Float q = new Float(24.5);
	   String x = Float.toString(q);
	   System.out.println("String value :"+x);
	   
	   
	   //Converting String to float
	   String y ="100.0";
	   float b = Float.parseFloat(y);
	   System.out.println("float value :"+b);
	   
	   
	   //Converting float to String
	   float c = 75.5F;
	   String z = Float.toString(c);
	   System.out.println("String value :"+z);
	   
	   
	   //Converting String to Float
	   String w = "30.6";
	   Float r = Float.valueOf(w);
	   System.out.println("Float Wrapper value :"+r);
	   
	   
	   //Converting Float to float
	   Float s = new Float(55.5);
	   float d = s.floatValue();
	   System.out.println("float value :"+d);
	}	
}