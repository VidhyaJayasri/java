package FUnctionalInerface;

import java.util.ArrayList;
//import java.util.stream.Stream;


/**
 * Created by expert on 29/8/18.
 */
public class Stream
{
    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(4);
        al.add(3);
      java.util.stream.Stream<Integer> s=al.stream();///class name shld be diffrent
        s.map(item->item*item).forEach(z->{
            System.out.println(z);
        });
 //     s.filter(x -> x>2).forEach(m ->{
 //         System.out.println(m);
 //     });

ArrayList<String> al1=new ArrayList<>();
al1.add("one");
al1.add("two");
al1.add("three");
al1.stream().filter(e->e.contains("t")).forEach(q-> {
    System.out.println(q);
});
    }
}
