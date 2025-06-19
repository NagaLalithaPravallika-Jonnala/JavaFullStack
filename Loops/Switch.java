//11th Loops program//
import java.util.Scanner;
public class Switch 
{ 
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);        
int a = sc.nextInt();
switch (a % 2) 
{
case 0:
System.out.println("The number is Even");
break;
case 1:
System.out.println("The number is Odd");
break;
}
}
}
/*5
The number is Odd*/
