//To print Instance variable in static methods
public class InstanceVariable
{
    int x=4;
    int y=5;
    static void add() 
    {
        InstanceVariable i=new InstanceVariable();
        System.out.println("Instance variable in static methods");
        System.out.println("x="+i.x);
        System.out.println("y="+i.y);
        System.out.println(i.x+i.y);
    }
    public static void main(String[] args)
    {
        
       add();
    }
}
output:Instance variable in static methods
x=4
y=5
9
