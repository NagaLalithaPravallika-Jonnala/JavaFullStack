//Create a class,object,method and its signature
/*public class JavaBasics
{ 
 public int add(int x,int y)
 {
  return  x+y;
 }
 public static void main(String[] args)
 {
  JavaBasics a=new JavaBasics();
  System.out.println(a.add(100,300));
 }
}
Output:
400*/




//Print your name
/*public class JavaBasics
{
 public static void main(String[] args)
 {
  System.out.println("Naga Lalitha Pravallika Jonnala");
  }
}
Output:
Naga Lalitha Pravallika Jonnala
*/





//comments
/*public class JavaBasics
{
 public static void main(String[] args)
 {
  System.out.println("//Single line comment");
  System.out.println(" Multi line comment");
  }
}
Output:
//Single line comment
Multi line comment*/



//Data Types
/*public class  JavaBasics
{
 public static void main(String[] args)
 {
  int i=2;
  boolean b=true;
  char c='p';
  float f=(float)45.0;
  double d=400.64;
  System.out.println(i);
  System.out.println(b);
  System.out.println(c);
  System.out.println(f);
  System.out.println(d);
 }
}
Output:2
true
p
45.0
400.64*/




//Scope of Variables
/*public class JavaBasics
{
 int n=20;
 public static void main(String[] args)
 {
  int g=50;
  JavaBasics s=new JavaBasics();
  System.out.println("Local variable:"+g);
  System.out.println("Globalvariable:"+s.n);
 }
}
Output:
Local variable:50
Globalvariable:20
*/





//print your name and call the function from main method
public class JavaBasics
{
 public String myName(String s)
 {
  return s;
 }
 public static void main(String[] args)
 {
  JavaBasics n=new JavaBasics();
  System.out.println(n.myName("Pravallika"));
 }
}

