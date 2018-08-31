package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by expert on 17/7/18.
 */
public class AddressMapMain
{

   /* public void delete(HashMap<Integer,AddressMap> m, int Houseno)
    {
        System.out.println("delete "+Houseno);
       // HashMap<Integer,AddressMap> hmap=new HashMap<>();
        //m.remove(Houseno);

        for (Map.Entry obj:m.entrySet())
        {
            if (obj.getKey()==Houseno)
            {
                m.remove(obj.getKey());
                break;
            }


        }
        }*/



    public static void main(String[] args)
    {
        HashMap<Integer,AddressMap> hmap=new HashMap<>();
        hmap.put(2,new AddressMap("Vidhya",1232));
        hmap.put(21,new AddressMap("ammu",2321));
        hmap.put(10,new AddressMap("Vinu",1232));
        AddressMapMain oob = new AddressMapMain();

        /*for (Map.Entry<Integer,AddressMap> obj:hmap.entrySet())
        {
            System.out.println("House Number:- "+obj.getKey());
            AddressMap obj2 = obj.getValue();
            System.out.println("name = "+obj2.name+" "+"Mobnum = "+obj2.Mobnum);

        }*/

       //oob.delete(m,2);
        AddressMap.delete(hmap,2);
        AddressMap.Update (hmap,21);

        for (Map.Entry<Integer,AddressMap> obj1:hmap.entrySet())
        {
            System.out.println("House Number:- "+obj1.getKey());
            AddressMap obj2 = obj1.getValue();
            System.out.println("name = "+obj2.name+" "+"Mobnum = "+obj2.Mobnum);

        }
    }
}
