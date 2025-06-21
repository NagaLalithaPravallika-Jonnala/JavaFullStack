//Call Instance methods in static methods
public class InstanceMethod
{
    int x=6;
    int y=3;
    void add() 
    {
        System.out.println(x+y);
    }
    static void getInstance()
    {
        System.out.println("Instance methods in static methods");
        InstanceMethod i=new InstanceMethod();
        i.add();
    }
    public static void main(String[] args)
    {
       getInstance();
    }
}
Output:
Instance methods in static methods
9