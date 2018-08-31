package second;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by expert on 12/7/18.
 */
public class LinkedLIstCls
{
    public static void main(String[] args) {
        LinkedList<String> Linked = new LinkedList<>();
        Linked.add("Sam");
        Linked.add("Vidhya");
        Linked.add(null);
        Linked.addFirst("Nithya");
        Linked.addLast("anjana");
        Linked.removeLast();
        Linked.remove(2);
        Linked.removeFirst();
        Linked.remove("Sam");

        for (String str:Linked)
        {
            System.out.println(str);
        }

    }
}
