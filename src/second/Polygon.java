package second;

/**
 * Created by expert on 3/7/18.
 */
public class Polygon
{

    public void area(float r)
    {
        float area=(3.14f*(r*r));
        System.out.println(area);
    }

    public void area(int length,int breadth)
    {
        System.out.println(length*breadth);

    }

    public static void main(String[] args)
    {

        Polygon p = new Polygon();
        p.area(5.5f);
        p.area(5,10);
    }
}
