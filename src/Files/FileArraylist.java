package Files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by expert on 19/7/18.
 */
public class FileArraylist
{
    public static void main(String[] args)  throws IOException
    {
        FileWriter fout=new FileWriter("FIle3.txt");
        fout.write("Hello WOrld");
        fout.close();
        FileReader fin = new FileReader("FIle3.txt");
        int temp=0;
        ArrayList<String> al = new ArrayList<String>();
        StringBuilder sb= new StringBuilder();

        while ((temp=fin.read())!=-1)
        {
           char a=((char)temp);
           String s= Character.toString(a);
          // String a[]= sb.append(s);
            System.out.println(s);
          //  al.add(s);

        }

       /* for (String obj2 : al)
        {
            System.out.println(obj2);
        }*/

                }


    }

