//Static variable in static methods
public class StaticVariable
{
    int x=4;
    int y=6;
    void add() 
    {
        System.out.println("Static variable in instance methods");
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println(x+y);
    }
    public static void main(String[] args)
    {
       StaticVariable s=new StaticVariable();
       s.add();
    }
}
Output:
Static variable in instance methods
x=4
y=6
10