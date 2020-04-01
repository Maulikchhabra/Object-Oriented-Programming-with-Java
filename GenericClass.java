class Template<T>
{
   T i;
   public void add(T i1){ i=i1;}

   public T get(){return (i);}   
}

public class GenericClass{
	public static void main(String args[]){
		Template<Integer> a = new Template<Integer>();
		Template<String> b = new Template<String>();
		Integer k = new Integer(5);
		a.add(k);
		b.add("Java");
		System.out.println("a: "+a.get()+" b: "+b.get());
	}
}