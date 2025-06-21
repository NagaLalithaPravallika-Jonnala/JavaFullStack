//Call Static method in instance methods
public class StaticMethod
{
    static int x=3;
    static int y=8;
    static void add()
    {
       System.out.println(x+y);
    }
    void getStatic() 
    {
        System.out.println("Static method in instance methods");
        System.out.println(x+y);
    }
    public static void main(String[] args)
    {
        StaticMethod s=new StaticMethod ();
       s.getStatic();
    }
}
Output:
Static method in instance methods
11