//8th Loops program//
import java.util.Scanner;
public class Armstrong
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int n = sc.nextInt();
int p = String.valueOf(n).length(); 
int sum = 0;
int temp = n;
while (temp > 0) 
{
int r = temp % 10;
sum += Math.pow(r, p);
temp /= 10;
}
if (n == sum) {
System.out.println(n + " is an Armstrong number.");
} 
else 
{
System.out.println(n + " is not an Armstrong number.");
}
sc.close();
}
}
/*Enter a number: 153
153 is an Armstrong number.*/
