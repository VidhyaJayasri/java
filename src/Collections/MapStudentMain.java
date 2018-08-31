package Collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by expert on 17/7/18.
 */
public class MapStudentMain
{
    public static void main(String[] args)
    {
        HashMap<Integer,String> hmap= new HashMap<>();
        hmap.put(1,"Athira");
        hmap.put(10,"Vidhya");
        hmap.put(3,"Anu");
        hmap.put(23,"achu");
        hmap.remove(10);

        for (Map.Entry obj: hmap.entrySet())
        {
            System.out.println("Key : "+obj.getKey()+" "+"Value : "+obj.getValue());
        }
    }
}
