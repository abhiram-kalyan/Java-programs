class CaesarCipher2 implements Runnable
{
Decryption q;
int num;
String decrypt;
Thread t;
CaesarCipher2(String d, int n, Decryption q)
{
num = n;
decrypt = d;
this.q = q;
t = new Thread(this, "thread");
}
public synchronized void run()
{
q.mD(num,decrypt);
}
}
class Decryption
{
public synchronized void mD(int num, String decrypt)
{
String result = "";
for (int i=0; i<decrypt.length(); i++)
{
if (Character.isUpperCase(decrypt.charAt(i)))
{
char ch = (char)(((int)decrypt.charAt(i) + (26-num) - 65) % 26 + 65);
result+=""+(ch);
}
else
{
char ch = (char)(((int)decrypt.charAt(i) + (26-num) - 97) % 26 + 97);
result+=""+(ch);
}
}
System.out.println(result+" Thread "+num);
}
}
public class BruteForceCeaserCipher
{
public static void main(String[] args)
{
Decryption q = new Decryption();
String d = "gdhrzfnncanx";
CaesarCipher2 ob0 = new CaesarCipher2(d,0,q);
CaesarCipher2 ob1 = new CaesarCipher2(d,1,q);
CaesarCipher2 ob2 = new CaesarCipher2(d,2,q);
CaesarCipher2 ob3 = new CaesarCipher2(d,3,q);
CaesarCipher2 ob4 = new CaesarCipher2(d,4,q);
CaesarCipher2 ob5 = new CaesarCipher2(d,5,q);
CaesarCipher2 ob6 = new CaesarCipher2(d,6,q);
CaesarCipher2 ob7 = new CaesarCipher2(d,7,q);
CaesarCipher2 ob8 = new CaesarCipher2(d,8,q);
CaesarCipher2 ob9 = new CaesarCipher2(d,9,q);
CaesarCipher2 ob10 = new CaesarCipher2(d,10,q);
CaesarCipher2 ob11 = new CaesarCipher2(d,11,q);
CaesarCipher2 ob12 = new CaesarCipher2(d,12,q);
CaesarCipher2 ob13 = new CaesarCipher2(d,13,q);
CaesarCipher2 ob14 = new CaesarCipher2(d,14,q);
CaesarCipher2 ob15 = new CaesarCipher2(d,15,q);
CaesarCipher2 ob16 = new CaesarCipher2(d,16,q);
CaesarCipher2 ob17 = new CaesarCipher2(d,17,q);
CaesarCipher2 ob18 = new CaesarCipher2(d,18,q);
CaesarCipher2 ob19 = new CaesarCipher2(d,19,q);
CaesarCipher2 ob20 = new CaesarCipher2(d,20,q);
CaesarCipher2 ob21 = new CaesarCipher2(d,21,q);
CaesarCipher2 ob22 = new CaesarCipher2(d,22,q);
CaesarCipher2 ob23 = new CaesarCipher2(d,23,q);
CaesarCipher2 ob24 = new CaesarCipher2(d,24,q);
CaesarCipher2 ob25 = new CaesarCipher2(d,25,q);
ob0.t.start();
ob1.t.start();
ob2.t.start();
ob3.t.start();
ob4.t.start();
ob5.t.start();
ob6.t.start();
ob7.t.start();
ob8.t.start();
ob9.t.start();
ob10.t.start(); 
ob11.t.start();
ob12.t.start();
ob13.t.start();
ob14.t.start();
ob15.t.start();
ob16.t.start();
ob17.t.start();
ob18.t.start();
ob19.t.start();
ob20.t.start();
ob21.t.start();
ob22.t.start();
ob23.t.start();
ob24.t.start();
ob25.t.start();
	}
}