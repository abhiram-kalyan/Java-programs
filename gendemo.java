import java .util.*;
class gen<T>{
	T a;
	gen(T value)
	{
		a=value;
	}
	void show()
	{
		System.out.println(" "+a);
	}
}
public class gendemo{
	public static void main(String[]args)
	{
		gen<Integer> x=new gen<Integer>(25);
		x.show();
	}
}