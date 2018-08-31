package Files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by expert on 18/7/18.
 */
public class File2ex
{
    public static void main(String[] args) throws IOException
    {
        FileWriter fout=new FileWriter("Second.txt");
        fout.write("Hello World");
        fout.close();
        FileReader fin = new FileReader("Second.txt");
        System.out.println((char)fin.read());
        int ch=0;
        while ((ch=fin.read())!=-1)
        {
            System.out.println((char)ch);
        }

    }
}
