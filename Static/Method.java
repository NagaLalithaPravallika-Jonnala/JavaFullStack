class Method
{
 static int a1=6;
 static int b=3;
 int c=4;
 int d=2;
 static void add()
 {
  System.out.println("class2");
  System.out.println("Static m3:"+(a1+b));
 }
 static void sub()
 {
  System.out.println("class2");
  System.out.println("Static m4:"+(a1-b));
 }
 void mul()
 {
  System.out.println("class2");
  System.out.println("Instance m3:"+(c*d));
 }
 void div()
 {
  System.out.println("class2");
  System.out.println("Instance m4:"+(c/d));
 }
 public static void main(String[] args)
 {
  System.out.println("Main method");
  Method m1=new Method();
  Method m2=new Method();
  Method m=new Method();
  m.add();
  m.sub();
  m.mul();
  m.div();
  add();
  sub();
  }
}