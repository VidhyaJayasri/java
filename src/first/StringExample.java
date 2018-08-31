package first;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by expert on 29/6/18.
 */
public class StringExample
{
    public static void main(String[] args)
    {
        String s="Hello";
        String obj = new String("Hello WOrld");// new keyword
        //s=  s.concat(" World");
        System.out.println(s);
      //  StringBuffer s3=new StringBuffer("Hello"); // for creating mutable string objects.
        //s3.append(" Hello");
        String s3="Hello";
       // System.out.println(s3);
        boolean b= s.equals(s3);
        //System.out.println(s.equals(s3));
        //System.out.println(s.equalsIgnoreCase(s3));
       // System.out.println(s==s3);
        String a="abc";
        String s4="efghij";
        String s5=" trim";
        System.out.println(a.compareTo(s4));//-ve integer comparison.
        System.out.println(a.toUpperCase());
        System.out.println(s4.toLowerCase());
        System.out.println(s5.trim());
        System.out.println(s4.length());
        System.out.println(s4.substring(0,3));
        System.out.println(s4.substring(3,6));
        System.out.println(s.charAt(0));

    }
}
