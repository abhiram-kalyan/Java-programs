public class Billing{
 	static double computeBill(double a)
 	{
		 return a*1.08;
 	}
 	static double computeBill(double a,double b)
 	{
 		return(a*b)*1.08;
 	}
 	static double computeBill(double a, double b,double c)
 	{
 		double n = (a*b)-c;
 		return n*1.08;
 	}
 public static void main(String[] args) {
 double k = computeBill(30);
 double l = computeBill(30,70);
 double m = computeBill(20,40,60);
 System.out.println("Price of one photo book after adding 8% tax is " + k + "Rs.");
 System.out.println("Price of photo book after computing quality and adding 8% taxis " + l + "Rs.");
 System.out.println("Price of photo book after computing quality,removeing couponvalue and adding 8% tax is " + m + "Rs.");
 }
}