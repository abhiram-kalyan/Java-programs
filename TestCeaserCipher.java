import java.util.*;
public class TestCeaserCipher
{
public static StringBuffer mEncryption(String text, int k)
{
StringBuffer result= new StringBuffer();
for (int i=0; i<text.length(); i++)
{
if (Character.isUpperCase(text.charAt(i)))
{
char ch = (char)(((int)text.charAt(i) + k - 65) % 26 + 65);
result.append(ch);
}
else
{
char ch = (char)(((int)text.charAt(i) + k - 97) % 26 + 97);
result.append(ch);
}
}
return result;
}
public static StringBuffer mDecryption(String text, int k)
{
StringBuffer result= new StringBuffer();
for (int i=0; i<text.length(); i++)
{
if (Character.isUpperCase(text.charAt(i)))
{
char ch = (char)(((int)text.charAt(i) + k - 65) % 26 + 65);
result.append(ch);
}
else
{
char ch = (char)(((int)text.charAt(i) + k - 97) % 26 + 97);
result.append(ch);
}
}
return result;
}
public static void main(String[] args)
{
String text1 = "Abhiram";
int k = 25;
System.out.println("Text : " + text1);
System.out.println("Shift : " + k);
System.out.println("Input to encryption is : " + mEncryption(text1, k));
String text2 = "Zaghqzl";
System.out.println("Text : " + text2);
System.out.println("Shift : " + k);
System.out.println("Input to decryption is : " + mDecryption(text2, 26-k));
}
}