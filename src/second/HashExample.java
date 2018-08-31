package second;

import java.util.HashSet;

/**
 * Created by expert on 12/7/18.
 */
public class HashExample
{
    public static void main(String[] args) {
        HashSet<String> setex = new HashSet<>();
        setex.add("anu");
        setex.add("Vidhya");
        setex.add("zen");
        setex.add("ammu");
        setex.add("ammu");
        setex.add(null);
        for (String S:setex)
        {
            System.out.println(S);

        }
    }
}
