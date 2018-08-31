package Collections;

/**
 * Created by expert on 24/7/18.
 */
public class GarbageExample
{
    @Override
    protected void finalize() {
        System.out.println("before garbage collection");
    }

    public static void main(String[] args)
    {
        GarbageExample s= new GarbageExample();
        s= null;
        GarbageExample s1= new GarbageExample();
        s1=null;
        System.gc();
    }
}
