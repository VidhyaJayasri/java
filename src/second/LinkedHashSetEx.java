package second;

import java.util.LinkedHashSet;

/**
 * Created by expert on 12/7/18.
 */
public class LinkedHashSetEx
{
    public static void main(String[] args)
    {
        LinkedHashSet<String> Str= new LinkedHashSet<>();
        Str.add("ammu");
        Str.add("Achu");
        Str.add(null);

        for (String S:Str)
        {
            System.out.println(S);

        }

    }
}
