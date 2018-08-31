package second;

import java.util.ArrayList;

/**
 * Created by expert on 14/8/18.
 */
public class SplitArray
{
    public static void main(String[] args) {


        int a[] = {1, 100, 90, 46, 20, 36, 78, 450};
         ArrayList<Integer> b= new ArrayList();
        for(int i=0;i<a.length/2;i++)
        {
           b.add(a[i]);
        }
        System.out.println("First  Array");
        for (Integer l:b )
        {
            System.out.println(l);

        }
        ArrayList<Integer> c= new ArrayList();


        for(int i=a.length/2;i<a.length;i++)
        {
            c.add(a[i]);
        }

        System.out.println("Second Array");
        for (Integer l:c )
        {
            System.out.println(l);

        }

    }
}
