package Files;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * Created by expert on 19/7/18.
 */
public class Arrrayindq
{
    public static void main(String[] args)
    {
        ArrayDeque<String> obj = new ArrayDeque<String>();
        obj.addFirst("anu");
        obj.addLast("alan");
        obj.add("ammu");
        obj.add("achu");
        obj.add("lisa");
        System.out.println(obj);
        System.out.println("head "+obj.peek());//return the first element
        System.out.println("remove first "+obj.pollFirst());// remove and return
        // first element returns null if empty
        System.out.println("removed Last "+obj.pollLast());// remove and return
        // last  element returns null if empty
        System.out.println("after removal"+obj);
        System.out.println(obj.remove());//remove first;
        System.out.println(obj.removeFirst());//remove and return first element
        System.out.println(obj.removeLast());//remove and return last element
        System.out.println(obj);



    }
}
