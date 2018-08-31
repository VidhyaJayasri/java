package second;
import java.util.Scanner;
/**
 * Created by expert on 27/6/18.
 */
public class Employee
{

  public int add(int x,int y)
  {

      return x+y;
  }
    public static void main(String[] args)
    {
     department d=new department(1,"CSE");
     d.details();
     Scanner s=new Scanner(System.in);
        Employee emp= new Employee();
        System.out.println("a=");
        int a=s.nextInt();
        Scanner u=new Scanner(System.in);
            System.out.println("b=");
        int b=u.nextInt();

        //System.out.println(x);
    // System.out.println("x=");
   // x=s.nextLine();
    System.out.println(emp.add(a,b));
    // int y=s.nextLine();
    //System.out.println(x);
    }
}
