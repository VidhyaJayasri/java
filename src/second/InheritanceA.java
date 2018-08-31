package second;

/**
 * Created by expert on 3/7/18.
 */
public class InheritanceA
{
    int a=10;
    int b=20;
    public void display()
    {
        System.out.println("Parent Class function");
    }

    public InheritanceA()
    {
        System.out.println("Parent Class constructor");
    }


    public  int add(int x,int y)
    {
        System.out.println("in parent"+x+y);
        return x+y;
    }
    public static void main(String[] args)
    {

    }
}
