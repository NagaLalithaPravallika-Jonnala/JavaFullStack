//Static method and instance method in main method
public class StaticInstance
{
    void getInstance() 
    {
        System.out.println("Instance method call in main method");
    }
    static void getStatic()
    {
       System.out.println("Static method call in main method");
    }
    public static void main(String[] args)
    {
        getStatic();
        StaticInstance s=new StaticInstance();
        s.getInstance();
    }
}
Output:
Static method call in main method
Instance method call in main method