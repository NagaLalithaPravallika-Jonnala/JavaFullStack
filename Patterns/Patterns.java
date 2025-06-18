//Pattern-1
/*public class Patterns
{
 public static void main(String[] args)
 {
  int n=6;
  for(int i=0;i<n;i++)
  {
   for(int j=0;j<n;j++)
   {
    System.out.print("* ");
   }
   System.out.println();
  }
 }
}
Output:
* * * * * *
* * * * * *
* * * * * *
* * * * * *
* * * * * *
* * * * * * */

//Pattern-2
/*public class Patterns
{
 public static void main(String[] args)
 {
  int n=6;
  for(int i=1;i<n;i++)
  {
   for(int j=1;j<n;j++)
   {
    System.out.print(i+" " );
   }
   System.out.println();
  }
 }
}
Output:
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5 */

//Pattern-3
/*public class Patterns
{
 public static void main(String[] args)
 {
  int n=6;
  for(int i=1;i<n;i++)
  {
   for(int j=1;j<n;j++)
   {
    System.out.print(j+" " );
   }
   System.out.println();
  }
 }
}
Output:1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5 */

//Pattern-4
/*public class Patterns
{
 public static void main(String[] args)
 {
  int n=1;
  for(int i=0;i<5;i++)
  {
    for(int j=0;j<=4;j++)
    {
    System.out.print(n+" " );
    n++;
   }
   System.out.println();
  }
 }
}
Output:
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25 */

//Pattern-5
/*public class Patterns
{
 public static void main(String[] args)
 {
  int n=1;
  for(int i=0;i<5;i++)
  {
    for(int j=0;j<=4;j++)
    {
    System.out.print(n+" " );
    n++;
    if(n==10)
   {
    n=1;
   }
   }
   System.out.println();
  }
 }
}
Output:
1 3 5 7 9
11 13 15 17 19
21 23 25 27 29
31 33 35 37 39
41 43 45 47 49*/
 
//Pattern-6
/*public class Patterns
{
 public static void main(String[] args)
 {
  int n=1;
  for(int i=0;i<5;i++)
  {
    for(int j=0;j<10;j++)
    {
     if(n%2!=0)
     {
      System.out.print(n+" " );
     }
     n++;
    }
   System.out.println();
  }
 }
}
Output:
1 3 5 7 9
11 13 15 17 19
21 23 25 27 29
31 33 35 37 39
41 43 45 47 49 */

//Pattern-7
/*public class Patterns
{
 public static void main(String[] args)
 {
  for(int i=0;i<5;i++)
  {
    for(int j=0;j<=4;j++)
    {
     if(j%2==0)
    {
     System.out.print("1 ");
    }
    else
    {
     System.out.print("0 ");
    }
   }
   System.out.println();
  }
 }
}
Output:
1 0 1 0 1
1 0 1 0 1
1 0 1 0 1
1 0 1 0 1
1 0 1 0 1 */   
//Pattern-8
/*public class Patterns
{
 public static void main(String[] args)
 {
  int n=5;
  for(int i=1;i<=n;i++)
  {
   for(int j=1;j<=n;j++)
   {
    if(j<=n-i)
    {
    System.out.print(" ");
   }
    else
    {
    System.out.print("* ");
    }
   }
   System.out.println();
  }
 }
}
Output:
    *
   * *
  * * *
 * * * *
* * * * *  */

//Pattern-9
/*public class Patterns
{
 public static void main(String[] args)
 {
  int n=5;
  for(int i=1;i<=n;i++)
  {
   for(int j=1;j<=n-i;j++)
   {
    System.out.print(" ");
   }
    for(int k=1;k<=i;k++)
    {
    System.out.print((2*k)+" ");
    }
   System.out.println();
  }
 }
}
Output: 
    2
   2 4
  2 4 6
 2 4 6 8
2 4 6 8 10*/ 

//Pattern-10
/*public class Patterns
{
 public static void main(String[] args)
 {
  String s="INDIA";
  for(int i=0;i<=s.length();i++)
  {
   System.out.println(s.substring(0,i));
  }
  System.out.println();
 }
}
Output:
I
IN
IND
INDI
INDIA*/
 