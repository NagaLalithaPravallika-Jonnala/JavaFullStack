//prime or not//
 import java.util.Scanner;
public class Primeornot
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = sc.nextInt();
boolean isPrime = true;
if (num <= 1) {
isPrime = false;
}
 else 
{
for (int i = 2; i <= Math.sqrt(num); i++) 
{
if (num % i == 0) {
isPrime = false;
break;
}
}
}
if (isPrime) 
{
System.out.println(num + " is a Prime Number.");
} 
else 
{
System.out.println(num + " is Not a Prime Number.");
}
}
}
/*
Enter a number: 7
7 is a Prime Number.*/
