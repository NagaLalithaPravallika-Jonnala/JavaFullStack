//Static Instance variables
public class StaticInstanceVar
{
    static int x=9;
    int y=10;
    public static void main(String[] args)
    {
        System.out.println("Static variable:"+x);
        StaticInstanceVar s=new StaticInstanceVar();
        System.out.println("Instance variable:"+s.y);
    }
}
Output:Static variable:9
Instance variable:10