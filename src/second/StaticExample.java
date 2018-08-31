package second;

/**
 * Created by expert on 4/7/18.
 */
public class StaticExample
{
     static int i=1;
    int j=1;

    StaticExample()
    {
        ++i;
        ++j;
        System.out.println(i+" "+j);
    }
    public static void display()
    {
        System.out.println("Static Function");
    }

    static class Innerstatic
    {
        public void showMessage()
        {
            System.out.println("Hello World");
        }
        public static void printfun()
        {
            System.out.println("Static Function of inner Class");
        }
    }

    static
    {
        System.out.println("Static block");
    }
    public static void main(String[] args)
    {
        StaticExample s= new StaticExample();
        StaticExample s1= new StaticExample();
        System.out.println(StaticExample.i);
        display();
        Innerstatic.printfun();
        Innerstatic is=new Innerstatic();
        is.showMessage();
    }

}
