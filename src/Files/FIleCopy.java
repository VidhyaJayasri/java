package Files;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by expert on 18/7/18.
 */
public class FIleCopy
{

    public static void main(String[] args) throws IOException
    {
        FileWriter fout=new FileWriter("FIle1.txt");
        fout.write("Hello WOrld");
        fout.close();
        //fout.close();
        FileReader fin = new FileReader("FIle1.txt");
       // System.out.println((char)fin.read());
        int ch=0;

        FileWriter ft=new FileWriter("FIle2.txt");
        while ((ch=fin.read())!=-1)
        {

            ft.write((char)ch);


        }
        ft.close();

        FileReader f2 = new FileReader("FIle2.txt");
        System.out.println((char)f2.read());
int fr=0;
        while ((fr=f2.read())!=-1)
        {
            System.out.println((char)fr);
        }

           }

    }

