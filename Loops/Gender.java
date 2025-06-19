import java.util.Scanner;
public class Gender
{
public static void main(String[] args) 
{
 Scanner sc = new Scanner(System.in);
System.out.print("Enter gender : ");
char gender = sc.next().toUpperCase().charAt(0); 
 switch (gender) 
{
case 'M':
 System.out.println("Gender: Male");
 break;
 case 'F':
System.out.println("Gender: Female");
break;
default:
System.out.println("Invalid input! Please enter M or F.");
}
}
}
/*Enter gender : F
Gender: Female*/
