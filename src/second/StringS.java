package second;

import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by expert on 9/7/18.
 */
public class StringS
{
    public static void main(String[] args)
    {
        String sobj= "Hello";
        char[] ch=sobj.toCharArray();
        for (char objs: ch)
        {
            System.out.println(objs);

        }
        String S = "Hi,Helow,How,r,u";
        String[] a = S.split(",");
        Object[] Objects={1,"vidhya",10.0f};
        int[] a1={9,4,5,1};
        Arrays.sort(a1);
        System.out.println("element is present "+Arrays.binarySearch(a1,4));
        for (int x:a1)
        {
            System.out.println(x);

        }
    /*    for (int i=0;i<5;i++)
        {

        System.out.println(a[i]);
    }*/



        for (String obj: a)
        {
            System.out.println(obj);
        }

        System.out.println("Objects :- ");

        for(Object obj1: Objects)
        {
            System.out.println(obj1);
        }
        StringTokenizer S1= new StringTokenizer(S,",");
        while (S1.hasMoreTokens())
        {
            System.out.println(S1.nextToken());
        }



    }
}
