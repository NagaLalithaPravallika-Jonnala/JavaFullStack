//Add integer values of an array
/*public class  Array
{
  public static void main(String[] args)
  {
    int []a={1,2,3,4,5,6,7};
    int sum=0;
    {
     for(int i=0;i<7;i++)
     {
      sum=sum+a[i];
     }
    System.out.print(sum);
   }
  }
}
Output:28
*/




//Calculate average value of an array
/*public class  Array
{
  public static void main(String[] args)
  {
    int []a={1,2,3,4,5,6,7};
    int sum=0;
    {
     for(int i=0;i<7;i++)
     {
      sum=sum+a[i];
     }
    int avg=sum/7;
    System.out.print(avg);
   }
  }
}
Output:4
*/




//To find index of an array
/*import java.util.*;
public class Array
{
 public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Size of  array:");
 int size=sc.nextInt();
 int a[]=new int[size];
 for(int i=0;i<size;i++)
 {
  System.out.println("element of array"); 
  a[i]=sc.nextInt();
  }
  System.out.println("Index finding element in array");
  int s=sc.nextInt();
  for(int i=0;i<size;i++)
  {
   if(a[i]==s)
   {
     System.out.println("index of" + s + " is " + i);
   }
  }
 }
}
Output:
Size of  array:
5
element of array
12
element of array
34
element of array
22
element of array
44
element of array
35
Index finding element in array
22
index of 22 is 2
*/



//To test if array contains a specific value
/*import java.util.*;
public class  Array
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  int a[]={1,2,3,4,5};
  int s=sc.nextInt();
  boolean sv=false;
  for(int j=0;j<a.length;j++)
  {
   if(a[j]==s)
   {
    sv=true;
    }
   }
   if(sv)
   {
     System.out.println("arrays contains specific values");
    }
    else
    {
      System.out.println("arrays  not contains specific values");
    }
 }
}
Output:2
arrays contains specific values

D:\5D2>java Array
6
arrays  not contains specific values
*/



//remove a specific element from an array
/*import java. util. *;
public class Array
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("removing element:");
        int e=sc.nextInt();
        int count=0;
        System.out.println("Elements:");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++) 
        {
            if(a[i]!=e) 
            {
                count++;
            }
        }
        int b[]=new int[count];
        int j=0;
        for (int i=0;i<size;i++) 
        {
            if(a[i]!=e) 
            {
                b[j]=a[i];
                j++;
            }
        }
        System.out.println("after removing");
        for (int i=0;i<count;i++) 
        {
            System.out.print(b[i] + " ");
        }
    }
}
Output:
7
removing element:
5
Elements:
1
2
3
4
5
6
7
after removing
1 2 3 4 6 7
*/





//copy an array to another array
/*import java.util.*;
public class  Array
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter array size:");
  int size=sc.nextInt();
  System.out.println("Enter array values:");
  int a[]=new int[size];
  int b[]=new int[size];
  for(int i=0;i<size;i++)
  {
   a[i]=sc.nextInt();
  }
  System.out.print("a[]={");
  for(int i=0;i<size;i++)
  {
   System.out.print(" "+a[i]+" ");
  }
  System.out.println("}");
  for(int i=0;i<size;i++)
  {
   b[i]=a[i];
  }
  System.out.print("b[]={");
  for(int i=0;i<size;i++)
  {
   System.out.print(" "+b[i]+" ");
  }
  System.out.println("}");
 }
}
/*Output:
Enetr array size:
4
Enter array values:
11
12
13
14
a[]={ 11  12  13  14 }
b[]={ 11  12  13  14 }
*/




//insert an element at a specific position in the array
/*import java.util.*;
public class Array
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number of elements:");
  int size=sc.nextInt();
  System.out.println("Enter elements:");
  int a[]=new int[size];
  for(int i=0;i<size;i++)
  {
   a[i]=sc.nextInt();
  }
  System.out.print("Initial:");
  for(int i=0;i<size;i++)
  {
   System.out.print(a[i]+" ");
  }
  int pos=3;
  int ele=9;
  int b[]=new int[size+1];
  for(int i=0;i<size+1;i++)
  {
   if(i<pos-1)
   {
    b[i]=a[i];
   }
   else if(i==pos)
   {
    b[i]=ele;
   }
   else
   {
    b[i]=a[i-1];
   }
  }
  System.out.println();
  System.out.print("After inserting:");
  for(int i=0;i<b.length;i++)
  {
   System.out.print(b[i]+" ");
  }
 }
}
output:
Enter number of elements:
6
Enter elements:
12
32
13
22
32
12
Initial:12 32 13 22 32 12
After inserting:12 32 32 9 22 32 12
*/




//to fond minimum maximum values of an array
/*import java.util.*;
public class Array
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number of elements:");
  int size=sc.nextInt();
  System.out.println("Enter elements:");
  int a[]=new int[size];
  for(int i=0;i<size;i++)
  {
   a[i]=sc.nextInt();
  }
  int min=a[0];
  int max=a[0];
  for(int i=0;i<size;i++)
  {
   if(min>a[i])
   {
    min=a[i];
   }
  }
  for(int i=0;i<size;i++)
  {
   if(max<a[i])
   {
    max=a[i];
   }
  }
  System.out.println("Maximum="+max);
  System.out.println("Minimum="+min);
 }
}
Output:
Enter number of elements:
4
Enter elements
34
67267
3222
323
Maximum=67267
Minimum=34
*/





//reverse an array of integer value
/*import java.util.*;
public class Array
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number of elements:");
  int sum=0;
  int size=sc.nextInt();
  int a[]=new int[size];
  System.out.println("Enter elements:");
  for(int i=0;i<size;i++)
  { 
   a[i]=sc.nextInt();
  }
  System.out.println("After reverse of an array of integer value:");
  for(int i=size-1;i>=0;i--) 
  {
   System.out.println(a[i]);
  }
 }
}
Output:
Enter number of elements:
4
Enter elements:
23
32
22
33
After reverse of an array of integer value:
33
22
32
23
*/


//Duplicate values of an array
/*import java.util.*;
public class Array
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number of elements:");
  int size=sc.nextInt();
  int a[]=new int[size];
  System.out.println("Enter elements:");
  for(int i=0;i<size;i++)
  { 
   a[i]=sc.nextInt();
  }
  System.out.println("Duplicate elemnts:");
  for(int i=0;i<size;i++)
  {
   for(int j=i+1;j<size;j++)
   {
    if(a[i]==a[j])
    {
     System.out.println(a[i]);
    }
   }
  }
 }
}
Output:Enter number of elements:
6
Enter elements:
2
3
2
5
6
5
Duplicate elemnts:
2
5
*/



//To find the common values between two array
/*import java.util.*;
public class Array
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number of elements:");
  int size=sc.nextInt();
  int a[]=new int[size];
  int b[]=new int[size];
  System.out.println("Enter elements in first array:");
  for(int i=0;i<size;i++)
  { 
   a[i]=sc.nextInt();
  }
  System.out.println("Enter elements in second array:");
  for(int i=0;i<size;i++)
  { 
   b[i]=sc.nextInt();
  }
  System.out.println("Common elements:");
  for(int i=0;i<size;i++)
  {
   for(int j=0;j<size;j++)
   {
    if(a[i]==b[j])
    {
     System.out.println(a[i]);
    }
   }
  }
 }
}
Output:
Enter number of elements:
4
Enter elements in first array:
11
22
34
55
Enter elements in second array:
24
22
11
33
Common elements:
11
22
*/





//Remove duplicate elements from an array
/*import java.util.*;
public class Array
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number of elements:");
  int size=sc.nextInt();
  int a[]=new int[size];
  System.out.println("Enter elements:");
  for(int i=0;i<size;i++)
  { 
   a[i]=sc.nextInt();
  }
  System.out.println("After removing duplicates:");
  for(int i=0;i<size;i++)
  {
   boolean dup=false;
   for(int j=0;j<i;j++)
   {
    if(a[i]==a[j])
    {
     dup=true;
     break;
    }
   }
   if(!dup)
   {
     System.out.println(a[i]+" ");
   }
  }
 }
}
Output:
Enter number of elements:
4
Enter elements:
22
44
22
66
After removing duplicates:
22
44
66
*/





//To find the second largest number in an array
/*import java.util.*;
public class Array
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number of elements:");
  int size=sc.nextInt();
  int a[]=new int[size];
  System.out.println("Enter elements:");
  for(int i=0;i<size;i++)
  {
   a[i]=sc.nextInt();
  }
  int largest=a[0];
  for(int i=0;i<size;i++)
  {
   if(largest<a[i])
   {
    largest=a[i];
   }
  } 
  int slargest=Integer.MIN_VALUE;
  for(int i=0;i<size;i++)
  {
   if(a[i]!=largest)
   {
    if(slargest<a[i])
    {
     slargest=a[i];
    }
  }
  }
  System.out.println("Second largest:"+slargest);
 }
}
Output:
Enter number of elements:
5
Enter elements:
23
2
34
44
55
Second largest:44
*/





//To find the second largest number in an array
/*import java.util.*;
public class Array
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number of elements:");
  int size=sc.nextInt();
  int a[]=new int[size];
  System.out.println("Enter elements:");
  for(int i=0;i<size;i++)
  {
   a[i]=sc.nextInt();
  }
  int largest=a[0];
  for(int i=0;i<size;i++)
  {
   if(largest<a[i])
   {
    largest=a[i];
   }
  } 
  int slargest=Integer.MIN_VALUE;
  for(int i=0;i<size;i++)
  {
   if(a[i]!=largest)
   {
    if(slargest<a[i])
    {
     slargest=a[i];
    }
  }
  }
  System.out.println("Second largest:"+slargest);
 }
}
Output:
Enter number of elements:
5
Enter elements:
23
2
34
44
55
Second largest:44
*/





//to find even number and odd number in an array
/*import java.util.*;
public class Array
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number of elements:");
  int size=sc.nextInt();
  int a[]=new int[size];
  System.out.println("Enter elements:");
  for(int i=0;i<size;i++)
  {
   a[i]=sc.nextInt();
  }
  int count=0;
  int flag=0;
  for(int i=0;i<size;i++)
  {
   if(a[i]%2==0)
   {
    count++;
   }
   else
   {
    flag++;
   }
  }
  System.out.println("Number of even numbers:"+count);
  System.out.println("Number of odd numbers:"+flag);
 }
}
Output:Enter number of elements:
6
Enter elements:
12
33
39
55
88
46
Number of even numbers:3
Number of odd numbers:3
*/




//To get the difference of largest and smallest value
/*import java.util.*;
public class Array
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number of elements:");
  int size=sc.nextInt();
  int a[]=new int[size];
  System.out.println("Enter elements:");
  for(int i=0;i<size;i++)
  {
   a[i]=sc.nextInt();
  }
  int min=a[0];
  int max=a[0];
  for(int i=0;i<size;i++)
  {
   if(min>a[i])
   {
    min=a[i];
   }
  }
  for(int i=0;i<size;i++)
  {
   if(max<a[i])
   {
    max=a[i];
   }
  }
  System.out.println("Differnce:"+(max-min));
 }
}
Output:Enter number of elements:
4
Enter elements:
1
2
3
4
Differnce:3
*/





//to verify if the array contains two specified elements(12,23)
/*import java.util.*;
public class Array
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number of elements:");
  int size=sc.nextInt();
  int a[]=new int[size];
  System.out.println("Enter elements:");
  for(int i=0;i<size;i++)
  {
   a[i]=sc.nextInt();
  }
  boolean twelve=false;
  boolean twentythree=false;
  for(int i=0;i<size;i++)
  {
   if(a[i]==12)
   {
    twelve=true;
   }
   if(a[i]==23)
   {
    twentythree=true;
   }
  } 
  if(twelve && twentythree)
  {
   System.out.println("Both 12 , 23 are present");
  }
  else if(twelve )
  {
   System.out.println("12 is present");
  }
  else if(twentythree )
  {
   System.out.println("23 is present");
  }
  else
  {
   System.out.println("12 ,23 are not present");
  }
 }
}
Output:
Enter number of elements:
4
Enter elements:
23
45
12
67
Both 12 , 23 are present


Enter number of elements:
4
Enter elements:
24
67
78
34
12 ,23 are not present


Enter number of elements:
4
Enter elements:
12
34
56
65
12 is present


Enter number of elements:
4
Enter elements:
23
45
67
8
23 is present
*/





//To remove duplicate elements and return the new array
/*import java.util.*;
public class Array
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number of elements:");
  int size=sc.nextInt();
  int a[]=new int[size];
  System.out.println("Enter elements:");
  for(int i=0;i<size;i++)
  { 
   a[i]=sc.nextInt();
  }
  System.out.println("After removing duplicates:");
  for(int i=0;i<size;i++)
  {
   boolean dup=false;
   for(int j=0;j<i;j++)
   {
    if(a[i]==a[j])
    {
     dup=true;
     break;
    }
   }
   if(!dup)
   {
     System.out.println(a[i]+" ");
   }
  }
 }
}
Output:
Enter number of elements:
4
Enter elements:
4
4
23
4
After removing duplicates:
4
23
*/




//To find the missing number of sorted array of 1 to 100
/*public class Array
{
 public static void main(String[] args) 
 {
  int[] a=new int[99];
  int index=0;
  for (int i=1;i<=100;i++) 
  {
    if(i!=27) 
   {
     a[index++]=i;
    }
   }
   int sum=100*101/2;
   int add=0;
   for (int i=0;i<a.length;i++) 
  {
   add+= a[i];
  }
  int miss=sum-add;
  System.out.println("Missing number is: " + miss);
 }
}
Output:
Missing number is: 27
*/