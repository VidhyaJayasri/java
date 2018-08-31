package FUnctionalInerface;

/**
 * Created by expert on 29/8/18.
 */
interface Drawable
{
    public void draw(String name,int z);

}
public class Lambda
{
    public static void main(String[] args)
    {
        int width =10;

        Drawable d2=(x,y) ->
        {
            System.out.println("Drawing "+width+" name "+x +" Y "+y);

        };
        d2.draw("square",2);
    }
}
