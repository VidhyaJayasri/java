package Collections;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/**
 * Created by expert on 17/7/18.
 */
public class Student3Main
{
    public static void main(String[] args)
    {
        LinkedHashMap<String,String> obj = new LinkedHashMap<>();
        obj.put("11","Amu");
        obj.put("2","Achu");
        System.out.println(obj.containsKey("11"));
        System.out.println(obj.containsValue("amal"));
        for (Map.Entry<String,String> obj1:obj.entrySet())
        {
            System.out.println(obj1.getKey());
            System.out.println(obj1.getValue());
        }

    }
}
