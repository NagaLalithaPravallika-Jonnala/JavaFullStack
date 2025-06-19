import java.util.Scanner;
public class Equalornot
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);       
System.out.print("Enter a number a: ");
int a=sc.nextInt();
System.out.print("Enter a number b: ");
int b=sc.nextInt();   
if (a == b) 
{
System.out.println("a is equal to b");
} 
else 
{
System.out.println("a is not equal to b");     
}
if (a != b) 
{
System.out.println("a is not equal to b");
} 
else 
{
System.out.println("a is equal to b");
}
}
}
/*D:\Java2025\Loops>java Equalornot
Enter a number a: 8
Enter a number b: 8
a is equal to b
a is equal to b*/
