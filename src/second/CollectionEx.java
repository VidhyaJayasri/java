package second;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by expert on 10/7/18.
 */
public class CollectionEx
{

    public static void main(String[] args)
    {
        //generic declaration
        ArrayList<String> al = new ArrayList<>();
        ArrayList<Integer> ai = new ArrayList<>();

       // List<String> all = new ArrayList<>();
      //  ArrayList<String> al2= new ArrayList<String>();
        al.add("Anu");
        al.add("ammu");
        al.add("Achu");
        al.add(null);
        ai.add(1);
        ai.add(2);
        ai.add(3);
        ArrayList<String> as= new ArrayList<>();
        as.add("apple");
        as.add("Orange");
        as.add("Grapes");
        al.remove("Anu");
        al.remove(2);

       al.addAll(2,as);

         for (String obj:al)
        {
            System.out.println(obj);
        }

     //   System.out.println("Integer Array List:- ");
      /*  for (Integer obj1:ai)
        {
            System.out.println(obj1);
        }*/

       /*Iterator itr = ai.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }*/

    /*   for (int i=0;i<ai.size();i++)
       {
           System.out.println(ai.get(i));
       }*/

    }
}
