class Method1
{
 static int x=5;
 static int y=10;
 int z=150;
 int a=20;
 static
 {
  System.out.println("class 1");
  System.out.println("Static b1:"+x);
 }
 static
 {
  System.out.println("class2");
  System.out.println("Static b2:"+y);
 }
 {
  System.out.println(" class1");
  System.out.println("Instance b2:"+z);
 }
 {
  System.out.println(" class1");
  System.out.println("Instance b2:"+a);
 }
 static void add()
 {
  System.out.println("class1");
  System.out.println("Static m1:"+(x+y));
 }
 static void sub()
 {
  System.out.println(" class1");
  System.out.println("Static m2:"+(x-y));
 }
 void mul()
 {
  System.out.println("class1");
  System.out.println("Instance m1:"+(z*a));
 }
 void div()
 {
  System.out.println("class1");
  System.out.println("Instance m2:"+(z/a));
 }
}
class Method2
{
 static int a1=6;
 static int b=3;
 int c=4;
 int d=2;
 static
 {
  System.out.println(" class2");
  System.out.println("Static b3:"+a1);
 }
 static
 {
  System.out.println(" class2");
  System.out.println("Static b4:"+b);
 }
 {
  System.out.println("class2");
  System.out.println("Instance b3:"+c);
 }
 {
  System.out.println("class2");
  System.out.println("Instance b4:"+d);
 }
 static void add1()
 {
  System.out.println("class2");
  System.out.println("Static m3:"+(a1+b));
 }
 static void sub1()
 {
  System.out.println("class2");
  System.out.println("Static m4:"+(a1-b));
 }
 void mul1()
 {
  System.out.println("class2");
  System.out.println("Instance m3:"+(c*d));
 }
 void div1()
 {
  System.out.println("class2");
  System.out.println("Instance m4:"+(c/d));
 }
 public static void main(String[] args)
 {
  System.out.println("Main method");
  Method1 m1=new Method1();
  Method2 m2=new Method2();
  Method1 m=new Method1();
  m1.add();
  m1.sub();
  m1.mul();
  m1.div();
  add1();
  sub1();
  m2.mul1();
  m2.div1();
 }
}