package RegularEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by expert on 20/7/18.
 */
public class Matching
{
    public static void main(String[] args)
    {
        boolean b= false;

        Pattern p= Pattern.compile("java");
        Matcher m=p.matcher("hi java,hello java");
        while (m.find())
        {
            System.out.println("found " + m.group() + "Starting at index " + m.start() + " " + "ending index at " + m.end());
            b = true;
        }
        if(b==false)
        {
            System.out.println("not found");

        }

    }
}
