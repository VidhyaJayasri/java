package second;

import java.util.ArrayList;

/**
 * Created by expert on 11/7/18.
 */
public class ParkingMain
{
    public static void main(String[] args)
    {


        Parking p1 = new Parking(2, 101, 10);
        Parking p2 = new Parking(2, 103, 11);
        Parking p3 = new Parking(2, 102, 05);
        Parking p4 = new Parking(2, 104, 06);
       Parking p5 = new Parking(4,105,02);
        ArrayList<Parking> Parking2 = new ArrayList<>();
        Parking.addvechicle(Parking2,p1);
        Parking.addvechicle(Parking2,p2);
        Parking.addvechicle(Parking2,p3);
       Parking.addvechicle(Parking2,p4);
      Parking.addvechicle(Parking2,p5);
        Parking.removevechicle(Parking2,102);


    }

}
