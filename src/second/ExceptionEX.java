package second;

/**
 * Created by expert on 9/7/18.
 */
public class ExceptionEX
{
    public static void  add(int X,int Y)
    {
        int Z= X+Y;
        if(Z>50)
        {
            throw new ArithmeticException("Not Vaild");
        }

    }
    public static void first()
    {
        second();
    }
    public static void second()
    {
     third();
    }
    public static void third()
    {
        throw new ArithmeticException("exception");
    }

    public static void main(String[] args)
    {
        try
        {
            first();
            add(40,50);
        }
        catch (Exception e)
        {
            System.out.println("Exception caught");
        }
    }
}
