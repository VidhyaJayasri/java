package Collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by expert on 17/7/18.
 */
public class Student2Main
{
    public static void main(String[] args)
    {
        HashMap<Integer,Student2> hmap=new HashMap<>();
        hmap.put(2,new Student2("vidhya",26,"Vj00123"));
        hmap.put(3,new Student2("ammu",20,"AM00123"));
        hmap.put(1,new Student2("divya",19,"DJ00123"));

        for (Map.Entry<Integer,Student2> obj : hmap.entrySet())
        {
            System.out.println("rollno : "+obj.getKey());
            System.out.println("Details of Student");
            Student2 Std = obj.getValue();
            System.out.println("Name = "+Std.name+" "+"Age= "+Std.age+" "+"Addr = "+Std.addr);
        }

    }
}
