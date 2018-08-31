package Collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by expert on 17/7/18.
 */
public class AddressMap
{
    //int Houseno;
    String name;
    int Mobnum;

    public AddressMap(String name, int mobnum)
    {
        this.name = name;
        Mobnum = mobnum;
    }


    public static void delete(HashMap<Integer,AddressMap> hmap, Integer no)
    {
        for (Map.Entry obj:hmap.entrySet())
        {
            if (obj.getKey()==no)
            {
                hmap.remove(obj.getKey());
                break;
            }


        }

    }


    public static void Update (HashMap<Integer,AddressMap> hmap, Integer no)
    {
        for (Map.Entry obj:hmap.entrySet())
        {
            if (obj.getKey()==no) {
                System.out.println("House Number:- "+obj.getKey());
           //    AddressMap obj3 = obj.getValue();
              //  System.out.println("name = " + obj3.name);
            }


        }

    }



}
