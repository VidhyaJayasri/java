package second;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by expert on 9/7/18.
 */
public class TypeCastingEx
{
    public static void main(String[] args) {


        byte b = 10;
        int x = b;//Upcasting or implicit type Casting
        int z=10;
        float f=z;
        int i=10;
        int by=i;
        float f1=30.50f;
        int y=(int)f1;//down casting or explicit type casting.

        System.out.println(x);
        System.out.println(f);
        System.out.println(i);
        System.out.println(y);

        boolean b1=true;
        Integer i1 = Integer.valueOf(x);//AUTOBOXING
        int u=i; //unboxing
        Boolean obj = Boolean.valueOf(b1);
        System.out.println(obj);
        String S= "123";
        Integer intv =Integer.parseInt(S);
        System.out.println(intv);
       Float ff= Float.parseFloat(S);
       // float fs= float.par
        System.out.println(S);

       String d= "true";
        System.out.println(Boolean.parseBoolean(d));
    }
}
