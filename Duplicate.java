import java.util.*;
class NewException extends Exception
{
	public NewException(String s)
	{
		super(s);
	}
}
public class Duplicate
{
	static Scanner sc = new Scanner(System.in);
	static int arr[];
	public static void duplicate() throws  NewException
	{
		System.out.println("Enter array size");
		int m = sc.nextInt();
		arr = new int[m];
		System.out.println("Enter array elements");
		for(int i = 0; i < arr.length; i++)
		{  
			arr[i] = sc.nextInt();
		}
		 for(int i = 0; i < m; i++)
		 {  
			 for(int j = i + 1; j < m; j++) 
			 {  
				 if(arr[i] == arr[j])  
				 {
					 throw new NewException(" The array has duplicate elements");
				 }
				 
			 }  
	     }  
	}
	public static void main(String args[]) throws Exception
	{
		duplicate();
	}
}