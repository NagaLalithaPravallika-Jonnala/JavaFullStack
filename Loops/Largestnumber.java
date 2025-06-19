//Loops 5rd program//
import java.util.Scanner;
public class Largestnumber
 {
  public static void main(String[] args) 
{
 Scanner sc = new Scanner(System.in);
 int a = sc.nextInt();
 int b = sc.nextInt();
 int c = sc.nextInt();
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
/*10
20
30
The Largest number is 30*/