

/**
 * Created by expert on 31/8/18.
 */
public class GenericsTypeOld <T>
{
    private T t;
    public  T get()
    {
        return t;
    }

public void set(T t)
{
    this.t=t;
}

    public static void main(String[] args)
    {
    GenericsTypeOld<String> type=new GenericsTypeOld<>();
    type.set("ANN");
    String str =type.get();
    }
}
