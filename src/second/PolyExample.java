package second;

/**
 * Created by expert on 3/7/18.
 */
public class PolyExample
{

    public void display()
    {
        System.out.println("Display funtion");
    }
    public void display(String msg)
    {
        System.out.println(msg);
    }

    public static void main(String[] args)
    {
        PolyExample P = new PolyExample();
        P.display();
        P.display("method overloading invoked");

    }
}
