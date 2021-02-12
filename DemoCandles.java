class Candle
{
	String color;
	int height;
	double price;
void getColor()
{
	System.out.println ("The colour of the candel is " + color);
}
void getHeight()
{
	System.out.println("Height of the candel id " + height);
}
void getPrice()
{
	System.out.println("Price of thr candel is " + price);
}
void setColor(String c)
{
color = c;
}
void setHeight(int h)
{
	height=h;
 double n = 2;
 price = h * n;
}
}
class ScentedCandle extends Candle
{
 String scent;
 void getScent()
{
System.out.println("The scent of the candel is " + scent);
}
void setScent(String s)
{
scent = s;
}
void setHeight(int h)
{
double n = 3;
super.setHeight(h);
price = h * n;
}
}
public class DemoCandles
{
public static void main(String args[])
{
Candle a = new Candle();
ScentedCandle b = new ScentedCandle();
a.setColor("yellow");
a.setHeight(9);
b.setColor("orange");
b.setScent("jasmine"); 
b.setHeight(7);
a.getHeight();
a.getColor();
a.getPrice();
System.out.println("Scented candel");
b.getHeight();
b.getColor();
b.getScent();
b.getPrice();
}
} 