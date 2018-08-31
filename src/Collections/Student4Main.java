package Collections;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by expert on 17/7/18.
 */
public class Student4Main
{
    public static void main(String[] args)
    {
        TreeMap<Integer,String> m = new TreeMap<>();
        m.put(20,"Achus");
        m.put(2,"vidhya");
        m.put(11,"ancy");
       // m.put(null,"aass");

        for (Map.Entry<Integer,String> obj:m.entrySet())
        {
            System.out.println(obj.getKey());
        }

    }

}
