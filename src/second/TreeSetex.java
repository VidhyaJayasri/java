package second;

import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * Created by expert on 12/7/18.
 */
public class TreeSetex
{
    public static void main(String[] args)
    {
        TreeSet<String> Str= new TreeSet<>();
        Str.add("Ammu");
        Str.add("Vidhya");
        Str.add("Ravi");
       //Str.add(null);// null values can not be add

        for (String S:Str)
        {
            System.out.println(S);

        }

    }
}
