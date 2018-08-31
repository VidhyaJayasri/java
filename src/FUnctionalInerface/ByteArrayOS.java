package FUnctionalInerface;

import java.io.*;

/**
 * Created by expert on 30/8/18.
 */
public class ByteArrayOS
{


    public static void main(String[] args) throws IOException
    {
        String S="Hello world";
        byte[] b= S.getBytes();
        FileOutputStream F1out=new FileOutputStream("F1.txt");
        FileOutputStream F2out=new FileOutputStream("F2.txt");
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        bos.write(b);
        bos.writeTo(F1out);



    }
}
