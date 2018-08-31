package second;

/**
 * Created by expert on 3/7/18.
 */
public class InheritanceB extends   InheritanceA
{
    int d= 1;
    int e=2;

    public InheritanceB()
    {
        System.out.println("Child Class constructor");
    }


    public void display() {
        System.out.println("hello");
        super.display();//for calling parent class
    }

    public static void main(String[] args)
    {

        InheritanceB obj= new InheritanceB();
        System.out.println("Properties of parent class "+ obj.a+" " +obj.b);
        System.out.println("Properties of child  class "+ obj.d+" " +obj.e);
        obj.display();
    }
}
