package first;

import java.util.Scanner;

/**
 * Created by expert on 28/6/18.
 */
public class LeapYear {
    int z;


    public void Yearcheck(int Y)
    {
       z=Y;
        if(z % 4 == 0)
        {

            System.out.println(z +" is a Leap Year");
        }
        else
        {
            System.out.println(z +" is not a Leap Year");
        }
    }


    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter any year:");

        int year = s.nextInt();

        System.out.println("YEAR ="+year);
        LeapYear LY= new LeapYear();
        LY.Yearcheck(year);


    }
}
