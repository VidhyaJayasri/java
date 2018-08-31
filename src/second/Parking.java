package second;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by expert on 11/7/18.
 */
public class Parking
{
    int type;
    int slotnum;
    int time;

    public Parking(int type, int slotnum, int time) {
        this.type = type;
        this.slotnum = slotnum;
        this.time = time;

    }

    public static void addvechicle(ArrayList<Parking> p,Parking obj)
    {
            if (p.size() < 3)
        {
                p.add(obj);
            }
            else {
                System.out.println("All slot are occupied");
            }

    }

    public static void removevechicle(ArrayList<Parking> p,int stno)
    {
        Iterator itr = p.iterator();
        while (itr.hasNext())
        {
            Parking obj1 =(Parking)itr.next();
            if(obj1.slotnum==stno)
            {


                System.out.println("amount to be paid for slot num "+obj1.slotnum +" is "+obj1.time*15);
                 p.remove(obj1);
                 break;
                //System.out.println(obj1.slotnum);
            }


        }


        System.out.println("Remaining Parking Details:- ");
        for (Parking obj2: p)
        {
            System.out.println("Slotnum= "+obj2.slotnum+" "+"Time = "+obj2.time+" "+"Type = "+obj2.type);
        }

    }


    }
