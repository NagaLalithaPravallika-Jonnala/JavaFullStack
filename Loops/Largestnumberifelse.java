//Loops 13th program//
import java.util.Scanner;
public class Largestnumberifelse
 {
  public static void main(String[] args) 
{
 Scanner sc = new Scanner(System.in);
 int a = 10;
 int b = 20;
 int c =30;
 if (a == b && b == c) 
{
 System.out.println("All are Equal");
 }
 else if (a > b && a > c)
 {
  System.out.println("The Largest number is " + a);
  } 
else if (b > c) 
{
 System.out.println("The Largest number is " + b);
 }
else 
{
 System.out.println("The Largest number is " + c);
}
}
}
/*D:\Java2025\Loops>javac Largestnumberifelse.java

D:\Java2025\Loops>java Largestnumberifelse
The Largest number is 30
*/